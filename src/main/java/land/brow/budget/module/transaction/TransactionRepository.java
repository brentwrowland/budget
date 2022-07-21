package land.brow.budget.module.transaction;

import io.micronaut.data.mongodb.annotation.MongoRepository;
import io.micronaut.data.repository.CrudRepository;

@MongoRepository
public interface TransactionRepository extends CrudRepository<Transaction, String> {
}