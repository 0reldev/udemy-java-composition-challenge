public class DishWasher extends Appliance {

    public DishWasher() {
        super();
    }

    public void doDishes() {
        if (hasWorkToDo) {
            System.out.println("Dishes are being done.");
            hasWorkToDo = false;
        }
    }
}
