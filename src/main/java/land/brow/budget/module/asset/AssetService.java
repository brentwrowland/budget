package land.brow.budget.module.asset;

import io.micronaut.core.annotation.NonNull;
import jakarta.inject.Singleton;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Optional;

@Singleton
public class AssetService {
    private final AssetRepository repo;

    public AssetService(AssetRepository repo) {
        this.repo = repo;
    }

    public Iterable<Asset> list() {
        return repo.findAll();
    }

    public Asset save(@NotNull @Valid Asset asset) {
        if (asset.getId() != null) {
            return null;
        }

        return repo.save(asset);
    }

    public Asset update(Asset asset) {
        if (asset.getId() == null) {
            return null;
        }

        return repo.update(asset);
    }

    public Optional<Asset> find(@NonNull String id) {
        return repo.findById(id);
    }
}