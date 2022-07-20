package land.brow.budget.service;

import io.micronaut.core.annotation.NonNull;
import jakarta.inject.Singleton;
import land.brow.budget.entity.Transaction;
import land.brow.budget.repository.TransactionRepository;

import java.util.Optional;

@Singleton
public class DefaultTransactionService implements TransactionService {
    private final TransactionRepository repo;

    public DefaultTransactionService(TransactionRepository repo) {
        this.repo = repo;
    }

    public Iterable<Transaction> list() {
        return repo.findAll();
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
}