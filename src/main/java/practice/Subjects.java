package practice;

import java.io.Serializable;

public class Subjects implements Serializable
{
    private String subId;
    private String subName;
    private String teacherName;

    public Subjects(String subId, String subName, String teacherName)
    {
        this.subId = subId;
        this.subName = subName;
        this.teacherName = teacherName;
    }

    public Subjects(Subjects subject)
    {
        super();
        this.subId = new String(subject.getSubId());
        this.subName = new String(subject.getSubName());
        this.teacherName = new String(subject.getTeacherName());
    }
    public String getSubId() {
        return subId;
    }

    public void setSubId(String subId) {
        this.subId = subId;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public String toString() {
        return "Subjects{" +
                "subId=" + subId +
                ", subName='" + subName + '\'' +
                ", teacherName='" + teacherName + '\'' +
                '}';
    }
}
