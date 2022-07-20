package land.brow.budget.service;

import io.micronaut.core.annotation.NonNull;
import land.brow.budget.entity.Transaction;

import java.util.Optional;

public interface TransactionService
{
    Iterable<Transaction> list();
    
    Transaction save(Transaction transaction);
    
    Optional<Transaction> find(@NonNull String id);
}
