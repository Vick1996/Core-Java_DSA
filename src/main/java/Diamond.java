interface A
{
    default void test()
    {
        System.out.println("Inside interface A");
    }
}
interface  B
{
    default void test()
    {
        System.out.println("Inside interface B");
    }
}

public class Diamond implements A, B
{

    @Override
    public void test()
    {
        B.super.test();
    }

    public static void main(String[] args)
    {
        Diamond obj = new Diamond();
        obj.test();
    }
}
