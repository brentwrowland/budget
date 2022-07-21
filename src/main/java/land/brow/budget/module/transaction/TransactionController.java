package land.brow.budget.module.transaction;

import io.micronaut.core.annotation.NonNull;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.*;
import io.micronaut.scheduling.TaskExecutors;
import io.micronaut.scheduling.annotation.ExecuteOn;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Optional;

@Controller("/transactions")
@ExecuteOn(TaskExecutors.IO)
public class TransactionController {
    private final TransactionService service;

    public TransactionController(TransactionService service) {
        this.service = service;
    }

    @Get
    Iterable<TransactionView> list() {
        return service.list();
    }

    @Post
    @Status(HttpStatus.CREATED)
    Transaction save(@NonNull @NotNull @Valid Transaction transaction) {
        return service.save(transaction);
    }

    @Put
    Transaction update(@NonNull @NotNull @Valid Transaction transaction) {
        return service.update(transaction);
    }

    @Get("/{id}")
    Optional<Transaction> find(@PathVariable String id) {
        return service.find(id);
    }
}