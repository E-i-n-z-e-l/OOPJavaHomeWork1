package coffeeMachine;

public class Tea extends Beverages{
    private String typeTea;
    private String teaTemperature;
    public Tea(String beveragesName, double beveragesPrice, String typeTea, String teaTemperature) {
        super(beveragesName, beveragesPrice);
        this.typeTea = typeTea;
        this.teaTemperature = teaTemperature;
    }

    public  String getTypeTea() { // Метод для дальнейшего использования в (coffeeMachine) чтобы возвращал вид чая;
        return typeTea;
    }

    @Override
    public String toString() {
        return String.format("%s, Вид: %s, Температура: %s", super.toString(), typeTea, teaTemperature);
    }
}
