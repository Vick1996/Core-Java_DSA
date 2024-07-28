package org.example;

import java.io.*;
import java.io.Serializable;

public class Serialization
{
    public static void main(String[] args)
    {
        System.out.println("Serialization");
        try
        {
            //Serialize
            Singleton instance1 = Singleton.getInstance();
            ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.text"));
            out.writeObject(instance1);
            out.close();

            //Deserialize
            ObjectInput in = new ObjectInputStream(new FileInputStream("file.text"));
            Singleton instance2 = (Singleton) in.readObject();
            in.close();

            System.out.println(instance1.hashCode());
            System.out.println(instance2.hashCode());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
