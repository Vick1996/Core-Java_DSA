package org.example;

import java.io.Serializable;

public class Singleton implements Serializable, Cloneable {
    private Singleton() {
        //Avoiding instantiation via reflection
        if (InstanceHolder.INSTANCE != null) {
            throw new RuntimeException("Already instantiated");
        }
    }

    private static class InstanceHolder {
         static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return InstanceHolder.INSTANCE;
    }

    private static Class getClass(String classname) throws ClassNotFoundException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

        if (classLoader == null) classLoader = Singleton.class.getClassLoader();

        return (classLoader.loadClass(classname));
    }

    private Object readResolve() {
        return InstanceHolder.INSTANCE;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
//        return InstanceHolder.INSTANCE;
        throw new CloneNotSupportedException("Cloning a singleton object isn't allowed");
    }

//    @Override
//    protected Object newInstance() throws IllegalAccessException, InstantiationException {
//        return InstanceHolder.INSTANCE;
//    }
}
