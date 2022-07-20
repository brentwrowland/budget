package land.brow.budget.service;

import io.micronaut.core.annotation.NonNull;
import jakarta.inject.Singleton;
import land.brow.budget.entity.Asset;
import land.brow.budget.repository.AssetRepository;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Optional;

@Singleton
public class DefaultAssetService implements AssetService {
    private final AssetRepository repo;

    public DefaultAssetService(AssetRepository repo) {
        this.repo = repo;
    }

    @Override
    public Iterable<Asset> list() {
        return repo.findAll();
    }

    @Override
    public Asset save(@NotNull @Valid Asset asset) {
        if (asset.getId() != null) {
            return null;
        }

        return repo.save(asset);
    }

    @Override
    public Asset update(Asset asset) {
        if (asset.getId() == null) {
            return null;
        }

        return repo.update(asset);
    }

    @Override
    public Optional<Asset> find(@NonNull String id) {
        return repo.findById(id);
    }
}