import Builders.CarBuilder;
import Models.Car;

public class Main {

    public static void main(String [] args) {
        CarBuilder carBuilder = new CarBuilder();
        Director director = new Director();

        director.constructSportsCar(carBuilder);

        Car car = carBuilder.getProduct();
        System.out.println(car.getSeats());


        director.constructNormalCar(carBuilder);

        Car car2 = carBuilder.getProduct();
        System.out.println(car2.getSeats());
    }

}
