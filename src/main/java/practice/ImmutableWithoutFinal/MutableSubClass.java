package practice.ImmutableWithoutFinal;

import org.example.Department;

import java.util.Date;
import java.util.List;

public class MutableSubClass extends EmployeeWithoutFinal
{
    private String newEmpId;

    private String newEmpName;

    private List<Department> newDepartments;

    private Date newOnboardingDate;

    public MutableSubClass( String newEmpId, String newEmpName, List<Department> newDepartments, Date newOnboardingDate)
    {
        super(newEmpId, newEmpName, newDepartments, newOnboardingDate);
        this.newEmpId=newEmpId;
        this.newEmpName=newEmpName;
        this.newDepartments=newDepartments;
        this.newOnboardingDate=newOnboardingDate;
    }

    public String getNewEmpId() {
        return newEmpId;
    }

    public void setNewEmpId(String newEmpId) {
        this.newEmpId = newEmpId;
    }

    public String getNewEmpName() {
        return newEmpName;
    }

    public void setNewEmpName(String newEmpName) {
        this.newEmpName = newEmpName;
    }

    public List<Department> getNewDepartments() {
        return newDepartments;
    }

    public void setNewDepartments(List<Department> newDepartments) {
        this.newDepartments = newDepartments;
    }

    public Date getNewOnboardingDate() {
        return newOnboardingDate;
    }

    public void setNewOnboardingDate(Date newOnboardingDate) {
        this.newOnboardingDate = newOnboardingDate;
    }

    @Override
    public String toString() {
        return "MutableSubClass [newEmpId=" + newEmpId + ", newEmpName=" + newEmpName + ", newDepartments="
                + newDepartments + ", newOnboardingDate=" + newOnboardingDate + "]";
    }



}
