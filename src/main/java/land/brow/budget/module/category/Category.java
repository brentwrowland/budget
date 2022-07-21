package land.brow.budget.module.category;

import io.micronaut.core.annotation.NonNull;
import io.micronaut.core.annotation.Nullable;
import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;

import javax.validation.constraints.NotBlank;
import java.time.Month;
import java.time.Year;

@MappedEntity
public class Category {
    @Id
    @GeneratedValue
    private String id;

    @Nullable
    private String name;

    @Nullable
    private Double assigned;

    @NonNull
    @NotBlank
    private Month month;

    @NonNull
    @NotBlank
    private Year year;

    @Nullable
    private String description;

    public Category(@Nullable String name,
                    @Nullable Double assigned,
                    @NonNull Month month,
                    @NonNull Year year,
                    @Nullable String description) {
        this.name = name;
        this.assigned = assigned;
        this.month = month;
        this.year = year;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Nullable
    public String getName() {
        return name;
    }

    public void setName(@Nullable String name) {
        this.name = name;
    }

    @Nullable
    public Double getAssigned() {
        return assigned;
    }

    public void setAssigned(@Nullable Double assigned) {
        this.assigned = assigned;
    }

    @NonNull
    public Month getMonth() {
        return month;
    }

    public void setMonth(@NonNull Month month) {
        this.month = month;
    }

    @NonNull
    public Year getYear() {
        return year;
    }

    public void setYear(@NonNull Year year) {
        this.year = year;
    }

    @Nullable
    public String getDescription() {
        return description;
    }

    public void setDescription(@Nullable String description) {
        this.description = description;
    }
}