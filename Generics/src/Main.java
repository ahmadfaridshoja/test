//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        inventory<Vehicle> vehicleinventory = new inventory<>();
        car car1 = new car("Ranger", "234534534534", 360);
        PickupTruck truck1=new PickupTruck("Ranger","23423544365",400);
        vehicleinventory.addToinventory(car1);
        vehicleinventory.addToinventory(truck1);
        System.out.println(vehicleinventory);
        vehicleinventory.removeFrominventory("23423544365");
        System.out.println(vehicleinventory);



    }
}

