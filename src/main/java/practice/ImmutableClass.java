package practice;

import java.util.ArrayList;
import java.util.List;

public class ImmutableClass
{
    public static void main(String[] args)
    {
        Subjects sobj1 = new Subjects("101", "Maths", "Rose");
        Subjects sobj2 = new Subjects("102", "Biology", "Ben");
        Subjects sobj3 = new Subjects("103", "Physics", "Will");
        Subjects sobj4 = new Subjects("104", "Chemistry", "Ron");

        List<Subjects> slist = new ArrayList<>();
        slist.add(sobj1);
        slist.add(sobj2);
        slist.add(sobj3);
        slist.add(sobj4);

        Student student = new Student(1, "Vick", "vick7@gmail.com", slist);

        student.getSubjects().get(0).setSubId("1444");
        List<Subjects> fetchedSubj = student.getSubjects();
        System.out.println("Fetched subject before modification\n "+fetchedSubj);
        slist.get(0).setTeacherName("Phylis");
        slist.get(0).setSubName("Ethical Hacking");

        student.getSubjects().get(0).setTeacherName("Phylis");

        slist.remove(1);
        System.out.println("\nSlist len: \n "+slist.size());


        student.getSubjects().remove(1);

        System.out.println("\n----------Student object----------\n"+student.getSubjects().size());
    }
}
