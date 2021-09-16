package RawData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Car {
    private String model;
    private Engine engine;
    private Cargo cargo;
    private Tyres tyres;

    public Car(String model, int speed, int power, int weight, String type, ArrayList<Double> tyres) {
        this.model = model;
        this.engine = new Engine(speed, power);
        this.cargo = new Cargo(weight, type);
        this.tyres = new Tyres(tyres);
    }

    public String getModel() {
        return this.model;
    }

    public Engine getEngine() {
        return this.engine;
    }

    public Tyres getTyres() {
        return this.tyres;
    }

    public Cargo getCargo() {
        return this.cargo;
    }
}

class Cargo {
    private int weight;
    private String type;

    public Cargo(int weight, String type) {
        this.weight = weight;
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}


class Engine {
    private int speed;
    private int power;

    public Engine(int speed, int power) {
        this.speed = speed;
        this.power = power;
    }

    public int getPower() {
        return this.power;
    }
}

class Tyres {
    private ArrayList<Double> presure;
    private double validTyrePresure;

    public Tyres(ArrayList<Double> tyres) {
        this.presure = tyres;
    }

    public ArrayList<Double> getPresure() {
        return this.presure;
    }

    public boolean presureUnderLine() {
        for (int i = 0; i < this.presure.size(); i++) {
            if (presure.get(i) < 1) {
                return true;
            }
        }
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int carsCount = Integer.parseInt(scan.nextLine());

        List<Car> cars = new ArrayList<>();

        while (carsCount-- > 0) {
            String[] line = scan.nextLine().split("\\s+");
            String name = line[0];
            int speed = Integer.parseInt(line[1]);
            int power = Integer.parseInt(line[2]);
            int weight = Integer.parseInt(line[3]);
            String type = line[4];
            ArrayList<Double> tyres = new ArrayList<>();
            for (int i = 5; i < line.length; i += 2) {
                tyres.add(Double.parseDouble(line[i]));
            }
            Car current = new Car(name, speed, power, weight, type, tyres);
            cars.add(current);

        }
        String searchedType = scan.nextLine();
        if ("fragile".equals(searchedType)) {
            cars.stream()
                    .filter(cargo -> cargo.getCargo().getType().equals("fragile"))
                    .filter(c -> c.getTyres().presureUnderLine())
                    .forEach(car -> System.out.println(car.getModel()));
        } else {
            cars.stream()
                    .filter(cargo -> cargo.getCargo().getType().equals("flamable"))
                    .filter(c -> c.getEngine().getPower() > 250)
                    .forEach(car -> System.out.println(car.getModel()));
        }
    }
}
