package land.brow.budget.module.category;

import io.micronaut.core.annotation.NonNull;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.*;
import io.micronaut.scheduling.TaskExecutors;
import io.micronaut.scheduling.annotation.ExecuteOn;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Optional;

@Controller("/categories")
@ExecuteOn(TaskExecutors.IO)
public class CategoryController {

    private final CategoryService service;

    public CategoryController(CategoryService service) {
        this.service = service;
    }

    @Get
    Iterable<Category> list() {
        return service.list();
    }

    @Post
    @Status(HttpStatus.CREATED)
    Category save(@NonNull @NotNull @Valid Category category) {
        return service.save(category);
    }

    @Put
    Category update(@NonNull @NotNull @Valid Category category) {
        return service.update(category);
    }

    @Get("/{id}")
    Optional<Category> find(@PathVariable String id) {
        return service.find(id);
    }
}