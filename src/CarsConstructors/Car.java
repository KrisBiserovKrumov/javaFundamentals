package CarsConstructors;

public class Car {
   private String mark;
   private String model;
   private int horsePower;

    public Car(String mark) {
        this.mark = mark;
        this.model = "unknown";
        this.horsePower = -1;
    }
    public Car(String mark,String model) {
        this.mark = mark;
        this.model = model;
        this.horsePower = -1;
    }
    public Car(String mark,int horsePower) {
        this.mark = mark;
        this.model = "unknown";
        this.horsePower = horsePower;
    }
    public Car(String mark,String model,int horsePower) {
        this.mark = mark;
        this.model = model;
        this.horsePower = horsePower;
    }

    public String getMark() {
        return mark;
    }
    public String getModel() {
        return model;
    }
    public int getHorsePower() {
        return horsePower;
    }


}
