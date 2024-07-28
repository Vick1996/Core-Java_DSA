package Factory;

public class CarMain
{
    public static void main(String[] args)
    {
        Car car = CarFactory.getCar("sedan");
        car.drive();

        car = CarFactory.getCar("SUV");
        car.drive();
    }
}
