package coffeeMachine;

public class Beverages { // Используем (private) чтобы нельзя было менять хар-ки напитков;
    private String beveragesName;
    private double beveragesPrice;

    public Beverages(String beveragesName, double beveragesPrice) {
        this.beveragesName = beveragesName;
        this.beveragesPrice = beveragesPrice;
    }

    @Override
    public String toString() {
        return String.format("Напиток: %s, Цена: %f", beveragesName, beveragesPrice);
    }

    public String getBeveragesName() {
        return beveragesName;
    }

    public double getBeveragesPrice() {
        return beveragesPrice;
    }
}
