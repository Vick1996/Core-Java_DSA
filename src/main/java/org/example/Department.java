package org.example;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Department implements Serializable
{
    public String deptId;
    public String deptName;
    public List<String> tags;
    public List<List<String>> groups;

    public Department(String deptId, String deptName, List<String> tags, List<List<String>> groups)
    {
        this.deptId = deptId;
        this.deptName = deptName;
        this.tags = tags;
        this.groups = groups;
    }

    public Department(Department department)
    {
        this.deptId = new String(department.getDeptId()); // Deep copy for String
        this.deptName = new String(department.getDeptName()); // Deep copy for String

        // Deep copy for tags (using a new ArrayList)
        List<String> copiedTags = new ArrayList<>(department.getTags());
        this.tags = copiedTags;

        // Deep copy for groups (using a new ArrayList for groups and new ArrayLists for inner elements)
        List<List<String>> copiedGroups = new ArrayList<>();

        for (List<String> group : department.getGroups())
        {
            List<String> copiedGroup = new ArrayList<>(group);
            copiedGroups.add(copiedGroup);
        }
        this.groups = copiedGroups;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public List<List<String>> getGroups() {
        return groups;
    }

    public void setGroups(List<List<String>> groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptId='" + deptId + '\'' +
                ", deptName='" + deptName + '\'' +
                ", tags=" + tags +
                ", groups=" + groups +
                '}';
    }
}
