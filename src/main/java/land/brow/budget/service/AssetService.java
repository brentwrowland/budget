package land.brow.budget.service;

import io.micronaut.core.annotation.NonNull;
import land.brow.budget.entity.Asset;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Optional;

public interface AssetService {
    Iterable<Asset> list();

    Asset save(@NotNull @Valid Asset asset);

    Asset update(Asset asset);

    Optional<Asset> find(@NonNull String id);
}
