package AbstractFactory;

import java.util.Objects;

public class Samsung
{
    private Samsung() {};

    public static Phone getPhone(String model)
    {
        if(Objects.equals(model, "S23"))
            return new Phone(model);
        else if(Objects.equals(model, "S23 Ultra"))
            return new Phone(model);

        return new NullPhone();
    }
}
