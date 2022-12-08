import java.util.*;

public class Main {
    public static void main(String[] args) {

        Car[] cars = {
                new Car("Audi", "A5", "blue", 230, "diesel", "automatic", 2006),
                new Car("BMW", "X5", "red", 300, "diesel", "automatic", 2012),
                new Car("Audi", "Q7", "black", 280, "diesel", "automatic", 2019),
                new Car("VW", "Golf", "white", 180, "gas", "automatic", 1998),
        };

        Car[] newCars = Car.getCarsByChar(cars, 'A');

        //for (Car car : newCars) {
        //    System.out.println(car.toString());
        //}

        Car.sortCars(cars, "ascending");
        for (Car car : cars) {
            System.out.println(car.toString());
        }
    }
}