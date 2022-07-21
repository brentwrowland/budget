package land.brow.budget.module.category;

import io.micronaut.data.mongodb.annotation.MongoRepository;
import io.micronaut.data.repository.CrudRepository;

@MongoRepository
public interface CategoryRepository extends CrudRepository<Category, String> {
}