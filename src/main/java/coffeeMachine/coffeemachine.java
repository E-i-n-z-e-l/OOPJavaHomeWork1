package coffeeMachine;

import java.util.ArrayList;
import java.util.List;

public class coffeemachine {
    private List<Beverages> beveragesHotCold = new ArrayList<>(); // Используем (private) чтобы нельзя было менять список и деньги;
    private double money = 0;

    public coffeemachine addProduct(Beverages prod){
        beveragesHotCold.add(prod);
        return this; // Позволяет в Main добавлять "напитки" через (.add);
    }

    public List<Beverages> getbeveragesHotCold() {
        return beveragesHotCold;
    }

    public Beverages findProduct(String name){ // Поиск напитков через метод (equals);
        for (Beverages beverages:beveragesHotCold) {
            if (name.equals(beverages.getBeveragesName())){
                return beverages;
            }
        }
        return null;
    }

    public double getMoney() {
        return money;
    }

    public Beverages saleProduct(String nameProd){ // продажа воды;
        Beverages founded = findProduct(nameProd);
        if (founded != null){
            money = money + founded.getBeveragesPrice(); // Считаем сколько заработали;
            beveragesHotCold.remove(founded); // удаление продукта из автомата;
        }
        return founded;
    }

    public List<Coffee> findCoffeeByType(String typeCoffee) { // поиск вида кофе;
        List<Coffee> coffeeList = new ArrayList<>();
        for (Beverages beverages : beveragesHotCold) {
            if (beverages instanceof Coffee) {
                Coffee coffee = (Coffee) beverages;
                if (coffee.getTypeCoffee().equals(typeCoffee)) {
                    coffeeList.add(coffee);
                }
            }
        }
        return coffeeList;
    }

    public Coffee saleCoffeeByType(String typeCoffee) { // продажа кофе;
        List<Coffee> coffeeList = findCoffeeByType(typeCoffee);
        if (!coffeeList.isEmpty()) {
            Coffee coffee = coffeeList.get(0);
            money += coffee.getBeveragesPrice();
            beveragesHotCold.remove(coffee);
            return coffee;
        }
        return null;
    }

    public List<Tea> findTeaByType(String typeTea) { // поиск вида чая;
        List<Tea> teaList = new ArrayList<>();
        for (Beverages beverages : beveragesHotCold) {
            if (beverages instanceof Tea) {
                Tea tea = (Tea) beverages;
                if (tea.getTypeTea().equals(typeTea)) {
                    teaList.add(tea);
                }
            }
        }
        return teaList;
    }

    public Tea saleTeaByType(String typeTea) { // продажа чая;
        List<Tea> teaList = findTeaByType(typeTea);
        if (!teaList.isEmpty()) {
            Tea tea = teaList.get(0);
            money += tea.getBeveragesPrice();
            beveragesHotCold.remove(tea);
            return tea;
        }
        return null;
    }

    public List<Juice> findJuiceFlavor(String flavor) { // поиск вкуса сока;
        List<Juice> juiceList = new ArrayList<>();
        for (Beverages beverages : beveragesHotCold) {
            if (beverages instanceof Juice) {
                Juice juice = (Juice) beverages;
                if (juice.getTypeFlavor().equals(flavor)) {
                    juiceList.add(juice);
                }
            }
        }
        return juiceList;
    }

    public Juice saleJuiceFlavor(String flavor) { // продажа сока;
        List<Juice> juiceList = findJuiceFlavor(flavor);
        if (!juiceList.isEmpty()) {
            Juice juice = juiceList.get(0);
            money += juice.getBeveragesPrice();
            beveragesHotCold.remove(juice);
            return juice;
        }
        return null;
    }

    @Override
    public String toString() { // Состояние автомата - сколько денег там осталось;
        StringBuilder builder = new StringBuilder();
        builder.append("Денег в автомате: ").append(money).append("\n").append("Напитков осталось: ").append("\n");
        for (Beverages beverages:beveragesHotCold) {
            builder.append(beverages).append("\n");
        }
        return builder.toString();
    }
}
