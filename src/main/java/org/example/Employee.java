package org.example;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public final class Employee implements  Serializable
{
    private final String empID;
    private final String empName;
    private final List<Department> departments;
    private final Date onboardingDate;

    public Employee(String empID,String empName, List<Department> departments, Date onboardingDate)
    {
        this.empID = empID;
        this.empName = empName;

        this.departments = Collections.unmodifiableList(new ArrayList<>(departments));
        this.onboardingDate = onboardingDate;
    }

    public String getEmpID() {
        return empID;
    }

    public String getEmpName() {
        return empName;
    }

    public List<Department> getDepartments()
    {
//        List<Department> newList = new ArrayList<>();
//        return newList.add(Department(departments));

        List<List<Department>> departmentCopies = new ArrayList<>(); // Temporary container

        for (Department department : this.departments)
        {
            departmentCopies.add(Collections.singletonList(new Department(department)));
        }

        // Flatten the list of department copies into a single list
        List<Department> flattenedCopies = departmentCopies.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        return Collections.unmodifiableList(flattenedCopies);
    }

    public Date getOnboardingDate() {
        return onboardingDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empID='" + empID + '\'' +
                ", empName='" + empName + '\'' +
                ", departments=" + departments +
                ", onboardingDate=" + onboardingDate +
                '}';
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException
    {
        in.defaultReadObject();

//        this.departments = Collections.unmodifiableList(new ArrayList<>((List<Department>) in.readObject()));
    }
}
