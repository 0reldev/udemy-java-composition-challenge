public class Refrigerator extends Appliance {

    public Refrigerator() {
        super();
    }

    public void orderFood() {
        if (super.hasWorkToDo)
            System.out.println("Food is being ordered.");
    }
}
