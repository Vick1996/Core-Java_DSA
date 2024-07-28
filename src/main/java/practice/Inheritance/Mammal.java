package practice.Inheritance;

import practice.finalPractice.Animal;

public class Mammal extends Animal
{
    public Mammal(int age, String name)
    {
        super(age, name);
    }

    public static void main(String[] args)
    {
        Animal animal = new Mammal(45, "Cat");

        System.out.println(animal.getAge());
        System.out.println(animal.getName());
    }
}
