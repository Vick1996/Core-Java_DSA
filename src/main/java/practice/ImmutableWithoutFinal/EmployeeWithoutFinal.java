package practice.ImmutableWithoutFinal;


import org.example.Department;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeWithoutFinal {

    private final String empId;

    private final String empName;

    private final List<Department> departments;

    private final Date onboardingDate;

    public EmployeeWithoutFinal(String empId, String empName, List<Department> departments, Date onboardingDate)
    {
        super();
        this.empId = empId;
        this.empName = empName;
        this.departments = new ArrayList<>(departments);
        this.onboardingDate = onboardingDate;
    }

    public String getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public List<Department> getDepartments() {
        return new ArrayList<Department>(departments);
    }

    public Date getOnboardingDate()
    {
//        Date copyObjDate = new Date(onboardingDate.getYear(), onboardingDate.getMonth(), onboardingDate.getDate(),
//                onboardingDate.getHours(), onboardingDate.getMinutes(), onboardingDate.getSeconds());

        return onboardingDate;
    }

    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", empName=" + empName + ", departments=" + departments
                + ", onboardingDate=" + onboardingDate + "]";
    }

}
