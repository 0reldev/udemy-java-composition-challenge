public class CoffeeMaker extends Appliance {

    public CoffeeMaker() {
        super();
    }

    public void brewCoffee() {
        if (super.hasWorkToDo)
            System.out.println("Coffee is being brewed.");
    }
}