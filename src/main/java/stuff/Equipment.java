package stuff;

public abstract class Equipment implements Asset { //want all equioments to be assets
    protected int purchasePrice;

    public Equipment(int purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public int getValue() {
        return purchasePrice;
    }
}
