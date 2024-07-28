package org.example;

public class CloneExample
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        //Cloning

        System.out.println("\nCLONING");
        Singleton clone1 = Singleton.getInstance();
        System.out.println("Clone 1 : "+clone1.hashCode());

        Singleton clone2 = (Singleton) clone1.clone();
        System.out.println("Clone 2 : "+clone2.hashCode());
    }
}
