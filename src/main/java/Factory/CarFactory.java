package Factory;

public class CarFactory
{
    public static Car getCar(String type)
    {
        if(type.equals("sedan")) return new Sedan();

        else if(type.equals("SUV")) return new SUV();

        else return null;
    }
}
