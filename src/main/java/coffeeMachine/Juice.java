package coffeeMachine;

public class Juice extends Beverages {
    private String flavor;

    public Juice(String beveragesName, double beveragesPrice, String flavor) {
        super(beveragesName, beveragesPrice);
        this.flavor = flavor;
    }

    public  String getTypeFlavor() { // Метод для дальнейшего использования в (coffeeMachine) чтобы возвращал вкус сока;
        return flavor;
    }

    @Override
    public String toString() {
        return String.format("%s, Вкус: %s", super.toString(), flavor);
    }
}
