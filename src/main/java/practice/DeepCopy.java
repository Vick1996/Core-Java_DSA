package practice;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DeepCopy implements Serializable
{
    public static List<Subjects> deepCopyUsingSerialization(List<Subjects> subjectsList)
    {
        List<Subjects> copiedList = new ArrayList<>();

        try
        {
            //Serialize
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(out);

            oos.writeObject(subjectsList);

            //Deserialize
            ByteArrayInputStream in = new ByteArrayInputStream(out.toByteArray());
            ObjectInputStream oin = new ObjectInputStream(in);

            copiedList = (List<Subjects>) oin.readObject();
        }
        catch(IOException | ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        return copiedList;
    }
}
