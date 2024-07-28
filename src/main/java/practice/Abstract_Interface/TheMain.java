package practice.Abstract_Interface;

public class TheMain extends Abstract1 implements Interface1,Interface2
{

    @Override
    public void displayAbstract() {
        System.out.println("Inside overriden displayAbstract");
    }

    @Override
    public void method2() {
        System.out.println("This is overriden method method2");
    }

    @Override
    public void method1()
    {
        System.out.println("Inisde overriden method1");
    }

    public static void main(String[] args)
    {
        TheMain obj = new TheMain();
        obj.disp();
        Interface2.disp();
        obj.method1();
        obj.displayAbstract();

    }
    static
    {
        System.out.println(Abstract1.age);
        Interface2.disp();
    }

}
