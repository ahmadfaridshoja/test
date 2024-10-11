//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static int earthquakeRate=70;
    private static int crimeRate =80;
    private static int floodRate=60;
    public static void main(String[] args) {
        calculateEarthquakeRisk();
        calculateFloodRisk();
        calculateCrimeRisk();
        totalCalculatedRisk();
    }
    public static void calculateCrimeRisk(){
        System.out.println("Calculate Crime: "+crimeRate);
    }
    public static void calculateEarthquakeRisk(){
        System.out.println("Calculated Earth quake rate: "+earthquakeRate);
    }
    public static void calculateFloodRisk(){
        System.out.println("Calculate Flood Rate: "+floodRate);

    }
    public static void totalCalculatedRisk(){
        int totalRisk = earthquakeRate + crimeRate + floodRate;
        System.out.println("total calculate risk is:"+totalRisk);
    }
}