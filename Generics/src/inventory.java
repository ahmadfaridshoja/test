import java.util.ArrayList;
public class inventory<T extends Vehicle> {
    ArrayList<T> inventory = new ArrayList<>();
    public inventory(){

    }
    public void addToinventory(T Vehicle){
        inventory.add(Vehicle);
    }
    public void removeFrominventory(String vin){
        for (int i = 0; i < inventory.size(); i++){
            if (inventory.get(i).getVin().equals(vin)){
                inventory.remove(i);
            }
        }
    }
}



