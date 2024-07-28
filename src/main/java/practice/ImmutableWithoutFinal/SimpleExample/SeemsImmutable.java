package practice.ImmutableWithoutFinal.SimpleExample;

import org.example.ImmutableMain;

public class SeemsImmutable
{
    private final int value;

    public SeemsImmutable(int value)
    {
        this.value = value;
    }
    public int getValue()
    {
        return value;
    }
}
