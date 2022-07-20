package land.brow.budget.entity;

import io.micronaut.core.annotation.Nullable;
import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;

import java.util.Date;

@MappedEntity
public class Transaction {
    @Id
    @GeneratedValue
    private String id;

    @Nullable
    private String categoryId;

    @Nullable
    private String assetId;

    @Nullable
    private Date date;

    @Nullable
    private String payee;

    @Nullable
    private String memo;

    @Nullable
    private Double amount;

    public Transaction(@Nullable String categoryId,
                       @Nullable String assetId,
                       @Nullable Date date,
                       @Nullable String payee,
                       @Nullable String memo,
                       @Nullable Double amount) {
        this.categoryId = categoryId;
        this.assetId = assetId;
        this.date = date;
        this.payee = payee;
        this.memo = memo;
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Nullable
    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(@Nullable String categoryId) {
        this.categoryId = categoryId;
    }

    @Nullable
    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(@Nullable String assetId) {
        this.assetId = assetId;
    }

    @Nullable
    public Date getDate() {
        return date;
    }

    public void setDate(@Nullable Date date) {
        this.date = date;
    }

    @Nullable
    public String getPayee() {
        return payee;
    }

    public void setPayee(@Nullable String payee) {
        this.payee = payee;
    }

    @Nullable
    public String getMemo() {
        return memo;
    }

    public void setMemo(@Nullable String memo) {
        this.memo = memo;
    }

    @Nullable
    public Double getAmount() {
        return amount;
    }

    public void setAmount(@Nullable Double amount) {
        this.amount = amount;
    }
}