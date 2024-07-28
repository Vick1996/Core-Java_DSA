package practice.finalPractice;

public class Animal
{
    protected int age;
    protected String name;

    public Animal(){}
    public Animal(int age, String name)
    {
        this.age = age;
        this.name = name;
    }
    public int getAge()
    {
        return this.age;
    }
    public String getName()
    {
        return this.name;
    }
}
