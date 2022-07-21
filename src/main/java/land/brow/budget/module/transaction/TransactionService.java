package land.brow.budget.module.transaction;

import io.micronaut.core.annotation.NonNull;
import jakarta.inject.Singleton;
import land.brow.budget.module.asset.Asset;
import land.brow.budget.module.asset.AssetRepository;
import land.brow.budget.module.category.Category;
import land.brow.budget.module.category.CategoryRepository;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Singleton
public class TransactionService {
    private final TransactionRepository repo;
    private final CategoryRepository categoryRepo;
    private final AssetRepository assetRepo;

    public TransactionService(TransactionRepository repo,
                              CategoryRepository categoryRepo,
                              AssetRepository assetRepo) {
        this.repo = repo;
        this.categoryRepo = categoryRepo;
        this.assetRepo = assetRepo;
    }

    public Iterable<TransactionView> list() {
        List<TransactionView> views = new ArrayList<>();

        for (Transaction transaction : repo.findAll()) {
            views.add(toView(transaction));
        }

        return views;
    }

    public Transaction save(Transaction transaction) {
        if (transaction.getId() != null) {
            return null;
        }

        return repo.save(transaction);
    }

    public Transaction update(Transaction transaction) {
        if (transaction.getId() == null) {
            return null;
        }

        return repo.update(transaction);
    }

    public Optional<Transaction> find(@NonNull String id) {
        return repo.findById(id);
    }

    private TransactionView toView(Transaction transaction) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        return new TransactionView(
                transaction.getId(),
                getCategoryName(transaction.getCategoryId()),
                getAssetName(transaction.getAssetId()),
                transaction.getDate() != null ? transaction.getDate().toString() : null,
                transaction.getPayee(),
                transaction.getMemo(),
                formatter.format(transaction.getAmount()));
    }

    private String getCategoryName(String id) {
        if (id == null) {
            return null;
        }

        Optional<Category> maybeCategory = categoryRepo.findById(id);
        return maybeCategory.map(Category::getName).orElse(null);
    }

    private String getAssetName(String id) {
        if (id == null) {
            return null;
        }

        Optional<Asset> maybeAsset = assetRepo.findById(id);
        return maybeAsset.map(Asset::getName).orElse(null);
    }
}