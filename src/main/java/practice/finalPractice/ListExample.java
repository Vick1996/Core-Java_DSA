package practice.finalPractice;

import java.util.*;

public class ListExample
{
    public static void main(String[] args) throws ConcurrentModificationException
    {
        //internally uses arrays
        List<Integer> markslist = new ArrayList<>();
        markslist.add(100);
        markslist.add(50);
        markslist.add(40);
        markslist.add(80);

        //internally uses doubly linkedlist
        LinkedList<Integer> markslinkedList = new LinkedList<>();
        markslinkedList.add(100);
        markslinkedList.add(50);
        markslinkedList.add(40);
        markslinkedList.add(80);

        Iterator<Integer> listIterator = markslist.iterator();

        while(listIterator.hasNext())
        {
            int no = listIterator.next();
            System.out.println(no);

            //Concurrent modification exception, because using list.remove() is a fail fast iterator.
            // Instead use iterator to remove element, which is fail safe.
            if(no == 80) listIterator.remove();//markslist.remove(Integer.valueOf(80));
        }
    }
}
