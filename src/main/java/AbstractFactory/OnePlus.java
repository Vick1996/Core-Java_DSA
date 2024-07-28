package AbstractFactory;

import java.util.Objects;

public class OnePlus
{
    private OnePlus() {};

    public static Phone getPhone(String model)
    {
        if(Objects.equals(model, "onePlus 7"))
            return new Phone(model);
        else if(Objects.equals(model, "onePlus 8"))
            return new Phone(model);

        return new NullPhone();
    }
}
