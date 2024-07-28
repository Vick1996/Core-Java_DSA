package org.example;

import java.io.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SerializationImmutable
{
    public static void main(String[] args)
    {
        try
        {
            //Department object
            List<String> tags = new ArrayList<>();
            tags.add("Fluid Mechanics");
            tags.add("ED");
            tags.add("Computer Applications");

            List<List<String>> groups = new ArrayList<>();
            for(int i=0; i<2; i++)
            {
                groups.add(Collections.nCopies(3, "Lorem Ipsum"));
            }

            Department dept = new Department("CSE-1", "Comp Sci", tags, groups);

            //Employee object
            List<Department> DepartmentList = new ArrayList<>();
            DepartmentList.add(dept);

            Date date = Date.valueOf("2024-3-18");
            //System.out.println(date);
            Employee emp = new Employee("ID-13", "John Wick", DepartmentList, date);


            //Serialize
            FileOutputStream fos = new FileOutputStream("file2.text");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(emp);
            oos.close();

            //Deserialize
            FileInputStream fis = new FileInputStream("file2.text");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Employee deEmp = (Employee) ois.readObject();

            System.out.println(emp);
            System.out.println(deEmp);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
