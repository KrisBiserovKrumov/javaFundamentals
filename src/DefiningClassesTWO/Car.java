package DefiningClassesTWO;

public class Car {
    private String make;
    private String model;
    private Integer horsePower;

    public static final String undefinedValue = "unknown";

    public Car(String make,String model, Integer horsePower){
        this(make);
        this.model = model;
        this.horsePower = horsePower;
    }
    public Car(String make){
        this();
        this.make = make;
    }
    public Car(){
        this.make = undefinedValue;
        this.model = undefinedValue;
        this.horsePower = - 1;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(Integer horsePower) {
        this.horsePower = horsePower;
    }
}
