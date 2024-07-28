package practice.Abstract_Interface;

public interface Interface1
{
    default void disp()
    {
        System.out.println("Inside disp of interface1");
    }
    public void method1();
}
