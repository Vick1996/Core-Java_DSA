package practice.finalPractice;

import java.util.List;

class B
{
    int CONST = 5;
    public int mul(int b)
    {
        return CONST * b;
    }
}
public class A extends B
{
    int CONST = 10;
    public int mul(int a)
    {
        return CONST * a;
    }
    public static void main(String[] args)
    {
        A a = new A();
        B b = new B();
//        A a1 = new B();
        B obj = new A();

        a.mul(10);
        b.mul(10);
//        a1.mul(2);
        obj.mul(3);
    }
}

