package practice.finalPractice;

import java.util.*;

public class SetExample
{
    public static void main(String[] args)
    {
        //hashmap()
        HashSet<Integer> hs = new HashSet<>();

        hs.add(1);
        hs.add(9);
        hs.add(2);
        hs.add(4);
        hs.add(5);
        hs.add(8);
        hs.add(3);

        System.out.println(hs.add(0));
        System.out.println(hs);

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Girish");
        linkedHashSet.add("Aloha");
        linkedHashSet.add("Zyzz");

        System.out.println(linkedHashSet);

        Thread t1 = new Thread();
        Thread t2 = new Thread();
        Thread t3 = new Thread();


        SortedSet s = Collections.synchronizedSortedSet(new TreeSet<Integer>(new RevComparator()));

//        TreeSet<Integer> s = new TreeSet<>();
        s.add(100);
        s.add(500);
        s.add(30);
        System.out.println(s);

        Iterator<Integer> itr = s.iterator();

        synchronized (SetExample.class)
        {
            while (itr.hasNext()) {
                int no = itr.next();

                if (no == 500) {
                    itr.remove();
                }
                System.out.println(no);
            }
        }
        System.out.println(s);
    }
}
class RevComparator implements Comparator<Integer>
{
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
    }
}
