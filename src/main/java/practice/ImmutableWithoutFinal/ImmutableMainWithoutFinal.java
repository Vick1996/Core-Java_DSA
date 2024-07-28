package practice.ImmutableWithoutFinal;
import org.example.Department;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ImmutableMainWithoutFinal
{
    public static void main(String[] args)
    {

        List<String> tags = new ArrayList<String>();
        tags.add("tag1");
        tags.add("tag2");

        List<List<String>> groups = new ArrayList<List<String>>();
        List<String> group1 = new ArrayList<String>();
        group1.add("A-Group");
        List<String> group2 = new ArrayList<String>();
        group2.add("B-group");
        groups.add(group1);
        groups.add(group2);

        List<Department> departments = new ArrayList<Department>();
        departments.add(new Department("1", "hr", tags, groups));

        Date onBoardingDate = new Date();
        System.out.println("new Date: " + onBoardingDate);
        System.out.println("==================================================================================>");
        EmployeeWithoutFinal employeeWithoutFinal = new MutableSubClass("1", "tony", departments, onBoardingDate);
        System.out.println("Employee Before Modifications : "+employeeWithoutFinal);

        MutableSubClass mutableSubClass = (MutableSubClass) employeeWithoutFinal;
        mutableSubClass.setNewEmpId("55555");
        mutableSubClass.setNewEmpName("Mike");
        mutableSubClass.setNewDepartments(new ArrayList<Department>());
        mutableSubClass.setNewOnboardingDate(new Date());
        System.out.println("Employee After Modification : "+employeeWithoutFinal);
        System.out.println("\n"+mutableSubClass.getClass());

        System.out.println("====================Upcasting==========================");
        EmployeeWithoutFinal employeeObj = (EmployeeWithoutFinal) mutableSubClass;

        ((MutableSubClass) employeeObj).setNewEmpId("99999");
        ((MutableSubClass) employeeObj).setNewEmpName("ChangedName");
        ((MutableSubClass) employeeObj).setNewOnboardingDate(new Date());
        System.out.println("Upcasting changes\n"+employeeObj);
        System.out.println("\n"+employeeObj.getClass());
    }
}
