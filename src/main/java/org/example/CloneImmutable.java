package org.example;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CloneImmutable
{
    public static void main(String[] args) throws CloneNotSupportedException
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


    }
}
