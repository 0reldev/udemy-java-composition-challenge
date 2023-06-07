public class CoffeeMaker extends Appliance {

    public CoffeeMaker() {
        super();
    }

    public void brewCoffee() {
        if (hasWorkToDo) {
            System.out.println("Coffee is being brewed.");
            hasWorkToDo = false;
        }
    }
}