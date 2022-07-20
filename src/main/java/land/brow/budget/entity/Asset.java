package land.brow.budget.entity;

import io.micronaut.core.annotation.NonNull;
import io.micronaut.core.annotation.Nullable;
import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;

import javax.validation.constraints.NotBlank;

public class Asset {
    @Id
    @GeneratedValue
    private String id;

    @Nullable
    @NotBlank
    private String address;

    @NonNull
    @NotBlank
    private AssetType type;

    @NonNull
    @NotBlank
    private String name;

    public Asset(@Nullable String address, @NonNull AssetType type, @NonNull String name) {
        this.address = address;
        this.type = type;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Nullable
    public String getAddress() {
        return address;
    }

    public void setAddress(@Nullable String address) {
        this.address = address;
    }

    @NonNull
    public AssetType getType() {
        return type;
    }

    public void setType(@NonNull AssetType type) {
        this.type = type;
    }

    @NonNull
    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }
}