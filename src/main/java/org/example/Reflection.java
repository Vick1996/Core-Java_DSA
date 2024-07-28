package org.example;

import java.lang.reflect.Constructor;

public class Reflection
{
    public static void main(String[] args) throws Throwable
    {

        System.out.println("Reflection");

        Class c = Class.forName("org.example.Singleton");

        Constructor c1[] = c.getDeclaredConstructors();

        c1[0].setAccessible(true);

        Singleton s2 = Singleton.getInstance();
        System.out.println(s2.hashCode());

        Singleton s1 = (Singleton) c1[0].newInstance();
        System.out.println(s1.hashCode());
    }
}
