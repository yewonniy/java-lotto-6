package enums;

public enum Prize {
    FIRST(2000000000),
    SECOND(30000000),
    THIRD(1500000),
    FOURTH(50000),
    FIFTH(5000);


    public final int price;
    Prize(int price) {
        this.price = price;
    }
}