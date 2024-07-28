package practice;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Student
{
    private final int id;
    private final String name;
    private final String email;
    private final List<Subjects> subjectsList;

    public Student(int id, String name, String email, List<Subjects> subjectsList)
    {
        super();
        this.id = id;
        this.name = name;
        this.email = email;
        this.subjectsList = DeepCopy.deepCopyUsingSerialization(subjectsList);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<Subjects> getSubjects()
    {
        List<Subjects> copiedSubjectsList = DeepCopy.deepCopyUsingSerialization(this.subjectsList);
//
//        for(Subjects subject: this.subjectsList)
//        {
////            Subjects sub = new Subjects(subject.getSubId(), subject.getSubName(), subject.getTeacherName());
//            copiedSubjectsList.add(new Subjects(subject));
////            copiedSubjectsList.add(new Subjects(sub));
//        }


        return copiedSubjectsList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", subjectsList=" + subjectsList +
                '}';
    }
}
