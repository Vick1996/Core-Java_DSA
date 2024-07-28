package practice.finalPractice;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

class NullAllowComparator implements Comparator<Integer>
{
    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1==null) return 1;
        if(o2==null) return 0;

        return o1-o2;
    }
}
public class TreeMapCustom
{
    public static void main(String[] args)
    {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(null, 3);  //Allows null key
        hm.put(10, 8);
        System.out.println(hm);

        TreeMap<Integer, Integer> tm = new TreeMap<>(new NullAllowComparator());
//        tm.put(null, 8);
        tm.put(100,1);
        tm.put(40, 9);
        tm.put(90, null);
        tm.put(null, 0);

//        Gives null pointer exception
//        tm.put(null, 8);

        System.out.println(tm);
    }
}
