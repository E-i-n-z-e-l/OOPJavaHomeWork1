package coffeeMachine;

public class Coffee extends Beverages{
    private String typeCoffee;
    private int coffeeTemperature;


    public Coffee(String beveragesName, double beveragesPrice, String typeCoffee, int coffeeTemperature) {
        super(beveragesName, beveragesPrice);
        this.typeCoffee = typeCoffee;
        this.coffeeTemperature = coffeeTemperature;
    }

    public  String getTypeCoffee() { // Метод для дальнейшего использования в (coffeeMachine) чтобы возвращал вид кофе;
        return typeCoffee;
    }

    @Override
    public String toString() {
        return String.format("%s, Вид: %s, Температура: %d", super.toString(), typeCoffee, coffeeTemperature);
    }
}
