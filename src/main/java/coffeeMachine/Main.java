package coffeeMachine;

public class Main {
    public static void main(String[] args) {
        coffeemachine machineCoffee = new coffeemachine();

        machineCoffee.addProduct(new Beverages("Вода", 10))
                .addProduct(new Beverages("Минеральная вода", 15))
                .addProduct(new Coffee("Кофе", 60, "Эспрессо", 75))
                .addProduct(new Coffee("Кофе", 120, "Капучино", 75))
                .addProduct(new Coffee("Кофе", 150, "Латте", 75))
                .addProduct(new Coffee("Кофе", 150, "Латте", 75))
                .addProduct((new Tea("Чай", 45, "Черный", "Горячий")))
                .addProduct((new Tea("Чай", 55, "Зеленый", "Холодный")))
                .addProduct(new Tea("Чай", 70, "Цветочный", "Холодный"))
                .addProduct(new Juice("Сок", 100, "Апельсиновый"))
                .addProduct(new Juice ("Сок", 100, "Яблочный"))
                .addProduct(new Juice("Сок", 100, "Вишневый"))
                .addProduct(new Juice("Сок", 100, "Ананасовый"));



        Beverages saledProduct1 = machineCoffee.saleCoffeeByType("Капучино");
        Beverages saledProduct2 = machineCoffee.saleProduct("Минеральная вода");
        Beverages saledProduct3 = machineCoffee.saleTeaByType("Черный");
        Beverages saledProduct4 = machineCoffee.saleJuiceFlavor("Яблочный");

        System.out.println(saledProduct1);

        System.out.println("__________________________________________");

        System.out.println(machineCoffee);
    }
}
