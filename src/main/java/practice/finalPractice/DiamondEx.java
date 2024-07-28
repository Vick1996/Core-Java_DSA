package practice.finalPractice;

interface firstInterface
{
    public void someMethod();
    public default void defaultMethod()
    {
        System.out.println("Default method of firstInterface");
    }
}
interface secondInterface
{
    public void someMethod();
    public default void defaultMethod()
    {
        System.out.println("Default method of second interface");
    }
}
public class DiamondEx implements firstInterface, secondInterface
{
    @Override
    public void someMethod() {
        System.out.println("Overriding some method");
    }

    @Override
    public void defaultMethod() {
        firstInterface.super.defaultMethod();
        System.out.println("No overriding the default method");
    }

    public static void main(String[] args)
    {
        DiamondEx d = new DiamondEx();
        d.defaultMethod();
    }
}
