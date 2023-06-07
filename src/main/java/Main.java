public class Main {

    public static void main(String[] args) {

        Refrigerator refrigerator = new Refrigerator();
        DishWasher dishWasher = new DishWasher();
        CoffeeMaker coffeeMaker = new CoffeeMaker();

        SmartKitchen smartKitchen = new SmartKitchen(coffeeMaker, dishWasher, refrigerator);
        smartKitchen.setKitchenState();
        smartKitchen.doKitchenWork();
    }
}
