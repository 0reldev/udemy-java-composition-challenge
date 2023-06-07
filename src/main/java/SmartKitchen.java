public class SmartKitchen {

    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen(CoffeeMaker brewMaster, DishWasher dishWasher, Refrigerator iceBox) {
        this.brewMaster = brewMaster;
        this.dishWasher = dishWasher;
        this.iceBox = iceBox;
    }

    public void addWater() {
        brewMaster.setHasWorkToDo(true);
        System.out.println("Water is being added.");
    }

    public void pourMilk() {
        iceBox.setHasWorkToDo(true);
        System.out.println("Milk is being poured.");
    }

    public void loadDishwasher() {
        dishWasher.setHasWorkToDo(true);
        System.out.println("Dishwasher is being loaded.");
    }

    public void setKitchenState() {
        addWater();
        pourMilk();
        loadDishwasher();
    }

    public void doKitchenWork() {
        iceBox.orderFood();
        dishWasher.doDishes();
        brewMaster.brewCoffee();
    }
}
