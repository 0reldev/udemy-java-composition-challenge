public class Refrigerator extends Appliance {

    public Refrigerator() {
        super();
    }

    public void orderFood() {
        if (hasWorkToDo) {
            System.out.println("Food is being ordered.");
            hasWorkToDo = false;
        }
    }


}
