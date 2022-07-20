package land.brow.budget.service;

import io.micronaut.core.annotation.NonNull;
import jakarta.inject.Singleton;
import land.brow.budget.entity.Category;
import land.brow.budget.repository.CategoryRepository;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Optional;

@Singleton
public class DefaultCategoryService {

    private final CategoryRepository repo;

    public DefaultCategoryService(CategoryRepository repo) {
        this.repo = repo;
    }

    public Iterable<Category> list() {
        return repo.findAll();
    }
    public Category save(@NotNull @Valid Category category) {
        if (category.getId() != null) {
            return null;
        }

        return repo.save(category);
    }

    public Category update(Category category) {
        if (category.getId() == null) {
            return null;
        }

        return repo.update(category);
    }

    public Optional<Category> find(@NonNull String id) {
        return repo.findById(id);
    }
}
