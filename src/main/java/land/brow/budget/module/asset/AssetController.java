package land.brow.budget.module.asset;

import io.micronaut.core.annotation.NonNull;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.*;
import io.micronaut.scheduling.TaskExecutors;
import io.micronaut.scheduling.annotation.ExecuteOn;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Optional;

@Controller("/assets")
@ExecuteOn(TaskExecutors.IO)
public class AssetController {

    private final AssetService service;

    public AssetController(AssetService service) {
        this.service = service;
    }

    @Get
    Iterable<Asset> list() {
        return service.list();
    }

    @Post
    @Status(HttpStatus.CREATED)
    Asset save(@NonNull @NotNull @Valid Asset asset) {
        return service.save(asset);
    }

    @Put
    Asset update(@NonNull @NotNull @Valid Asset asset) {
        return service.update(asset);
    }

    @Get("/{id}")
    Optional<Asset> find(@PathVariable String id) {
        return service.find(id);
    }
}