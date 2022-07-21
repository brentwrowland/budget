package land.brow.budget.module.transaction;

public class TransactionView {
    private String id;
    private String category;
    private String asset;
    private String date;
    private String payee;
    private String memo;
    private String amount;

    public TransactionView(String id, String category, String asset, String date, String payee, String memo, String amount) {
        this.id = id;
        this.category = category;
        this.asset = asset;
        this.date = date;
        this.payee = payee;
        this.memo = memo;
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public TransactionView setId(String id) {
        this.id = id;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public TransactionView setCategory(String category) {
        this.category = category;
        return this;
    }

    public String getAsset() {
        return asset;
    }

    public TransactionView setAsset(String asset) {
        this.asset = asset;
        return this;
    }

    public String getDate() {
        return date;
    }

    public TransactionView setDate(String date) {
        this.date = date;
        return this;
    }

    public String getPayee() {
        return payee;
    }

    public TransactionView setPayee(String payee) {
        this.payee = payee;
        return this;
    }

    public String getMemo() {
        return memo;
    }

    public TransactionView setMemo(String memo) {
        this.memo = memo;
        return this;
    }

    public String getAmount() {
        return amount;
    }

    public TransactionView setAmount(String amount) {
        this.amount = amount;
        return this;
    }
}