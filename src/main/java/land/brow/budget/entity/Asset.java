package land.brow.budget.entity;

import io.micronaut.core.annotation.NonNull;
import io.micronaut.core.annotation.Nullable;
import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;

import javax.validation.constraints.NotBlank;

public class Asset
{
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
}