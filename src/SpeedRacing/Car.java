package SpeedRacing;

public class Car {
    private String model;
    private Double fuel;
    private Double consumption;
    private int distanceTravelled;

    public Car(String model, Double fuel, Double consumption) {
        this.model = model;
        this.fuel = fuel;
        this.consumption = consumption;
        this.distanceTravelled = 0;
    }
    public boolean  drive(int distance){
        double fuelNeeded = distance * this.consumption;

        if (this.fuel >= fuelNeeded){
            this.fuel -= fuelNeeded;
            this.distanceTravelled += distance;
            return true;
        }return false;

    }
    public String getInfo(){
        return String.format("%s %.2f %d",this.model,this.fuel,this.distanceTravelled);
    }
}
