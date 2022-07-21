package land.brow.budget.module.asset;

import io.micronaut.data.mongodb.annotation.MongoRepository;
import io.micronaut.data.repository.CrudRepository;

@MongoRepository
public interface AssetRepository extends CrudRepository<Asset, String> {
}
