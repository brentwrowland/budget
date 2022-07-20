package land.brow.budget.repository;

import io.micronaut.data.mongodb.annotation.MongoRepository;
import io.micronaut.data.repository.CrudRepository;
import land.brow.budget.entity.Category;

@MongoRepository
public interface CategoryRepository extends CrudRepository<Category, String> {
}