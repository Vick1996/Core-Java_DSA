package org.example;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.Field;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.security.SecurityPermission;

public class ReflectionImmutable
{
    public static void main(String[] args) throws Throwable
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
        Employee Emp = new Employee("ID-13", "John Wick", DepartmentList, date);


        //Handling mutable object reference in immutable object
        System.out.println(Emp);

        //Reflection
        Class<?> classVar = Employee.class;
//        MethodHandles.Lookup lookup = classVar.get

        Class hackClass = Emp.getClass();
        System.out.println("Changing value of Emp obj empId\n");
        Field fs = hackClass.getDeclaredField("empName");
        fs.setAccessible(true);
        fs.set(Emp, "Name has been hacked");

        System.out.println(Emp);
    }
}
