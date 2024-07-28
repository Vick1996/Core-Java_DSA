package practice.effectiveJava;

public class FooBarStatic
{
    //constructor inaccessible
    private FooBarStatic(){

    }

    //static method since it is a good practice to not have this filter check in constructor
    public static FooBarStatic createObject(int no)
    {
        if(no > 9) return new FooBarStatic();
        else return null;
    }
}
