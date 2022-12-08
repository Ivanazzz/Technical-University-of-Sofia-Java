import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Car {
    String make;
    String model;
    String color;
    int horsePower;
    String engineType;
    String gearboxType;
    int year;

    public Car(String make, String model, String color, int horsePower,
               String engineType, String gearboxType, int year) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.engineType = engineType;
        this.gearboxType = gearboxType;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake() {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel() {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setCoolor() {
        this.color = color;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower() {
        this.horsePower = horsePower;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType() {
        this.engineType = engineType;
    }

    public String getGearboxType() {
        return gearboxType;
    }

    public void setGearboxType() {
        this.gearboxType = gearboxType;
    }

    public int getYear() {
        return year;
    }

    public void setYear() {
        this.year = year;
    }


    public static Car[] getCarsByChar(Car[] cars, char letter) {
        ArrayList<Car> newCars = new ArrayList<Car>();

        for (int car = 0; car < cars.length; car++) {
            Car currentCar = cars[car];

            if (currentCar.make.charAt(0) == letter) {
                newCars.add(currentCar);
            }
        }

        return newCars.toArray(new Car[0]);
    }

    public static Car[] sortCars(Car[] cars, String sortType) {
        ArrayList<Car> sortedCars = new ArrayList<>();
        for (Car car : cars) {
            sortedCars.add(car);
        }

        sortedCars.sort((car1, car2) -> car1.make.compareTo(car2.make));

        if (sortType.toLowerCase() == "ascending") {
            return sortedCars.toArray(new Car[0]);
        }
        else {
            return sortedCars.toArray(new Car[0]);
        }
    }

    public String toString() {
        return "Make: " + this.make + " Model: " + this.model + " Year: " + this.year;
    }
}