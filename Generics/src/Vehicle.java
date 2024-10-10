public abstract class Vehicle {
    public static String Make = "ford";
    private String model;
    private String vin;
    private int hp;

    public Vehicle(String model, String vin, int hp) {
    }

    public static String getMake() {
        return Make;
    }

    public static void setMake(String make) {
        Make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", vin='" + vin + '\'' +
                ", hp=" + hp +
                '}';
    }
}

