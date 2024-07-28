package practice.finalPractice;


class Cat
{
    private static int catCount;
    String name;
    protected int age;

    Cat()
    {
        catCount++;
    }
    public static int getCount()
    {
        return catCount;
    }
    public final int get(int o){return 2;}
    public static int get(){return 9;}
    public static boolean getCount(int i)
    {
        return catCount == i;
    }
    protected void method1()
    {
        System.out.println("Cat method1");
    }
}
class HouseCat extends Cat
{
    int age;

    HouseCat(){super();}

    //Cant provide weaker access to overriding methods since the compiler would get confused
    //Compile visibility is checked according to the reference and not the object itself.
    @Override
     public void method1() {
        System.out.println("HouseCat method1");
    }
}

public class StaticExample
{
    public static void main(String[] args)
    {
        System.out.println(Cat.getCount());
        Cat myCat = new Cat();
        myCat.name = "FirstCat";
        myCat.age = 5;
        System.out.println(Cat.getCount());
        System.out.println(myCat.get(3));
        System.out.println(Cat.getCount(2));

        Cat newCat = new HouseCat();
        newCat.method1();
        System.out.println(newCat.age);

//        myCat.method1();
    }
}
