package org.example;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableMain
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

        Employee Emp = new Employee("ID-13", "John Wick", DepartmentList, date);

        try
        {
            List<Department> fetchedDept = Emp.getDepartments();

            System.out.println("Employee :\n "+Emp.getDepartments());


//            DepartmentList.add(new Department("CSE-2", "IT", tags, groups));

            DepartmentList.get(0).setDeptName("ChangedDept");

            Emp.getDepartments().get(0).setDeptName("Chemistry");
            Emp.getDepartments().get(0).deptId = "OIO-99";
            Emp.getDepartments().get(0).getTags().set(0,"tag22");

            System.out.println("\n\nDept list"+DepartmentList);

            System.out.println("Emp after \n"+Emp.getDepartments());

//          System.out.println(fetchedDept.getGroups().get(0).set(0, "Second"));
            fetchedDept.get(0).setDeptId("EEE-04");
            fetchedDept.get(0).setDeptName("Electronics");
            System.out.println("Fetched: "+fetchedDept);

            List<List<String>> gList = fetchedDept.get(0).getGroups();
            gList.get(0).set(0, "SSSS");
            System.out.println(gList);
        }
        catch(UnsupportedOperationException e)
        {
            System.out.println("Can't modify an immutable object");
        }

        System.out.println("\n\n"+Emp);
    }
}
