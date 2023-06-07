public class DishWasher extends Appliance {

    public DishWasher() {
        super();
    }

    public void doDishes() {
        if (super.hasWorkToDo)
            System.out.println("Dishes are being done.");
    }
}
