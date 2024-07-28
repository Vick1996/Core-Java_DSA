package org.example;

public class SingletonMain
{
    private static Class<?> getClass(String className) throws ClassNotFoundException
    {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

        if (classLoader == null) {
            classLoader = SingletonMain.class.getClassLoader();
        }
        return classLoader.loadClass(className);
    }

    public static void main(String[] args)
    {
        //Singleton logic check
        System.out.println("Singleton logic check:");

        Singleton obj1 = Singleton.getInstance();
        System.out.println(obj1.hashCode());

        Singleton obj2 = Singleton.getInstance();
        System.out.println(obj2.hashCode());

        //Classloader
        try
        {
            Class cl = Class.forName("Singleton");
            System.out.println("Classloader breaking: "+(Singleton) cl.newInstance());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        Thread t[] = new Thread[1000];
        for(int i=0; i<1000; i++)
        {
            t[i] = new Thread();
        }
        for(int i=0; i<1000; i++)
        {
            t[i].start();
            System.out.println(t[i].getName()+" : "+Singleton.getInstance().hashCode());
        }
    }
}