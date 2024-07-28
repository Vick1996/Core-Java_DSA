package practice.finalPractice;

import java.util.Arrays;
import java.util.List;

public class DSAPrac
{
    static void add(List<Integer> li)
    {

    }
    static void add(List<Double> dlist)
    {

    }
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 2, 2, 3, 3, 4, 4, 4, 5, 6, 6, 6, 6};
        int st=0, e=2;

        while(e < arr.length)
        {
            if(arr[st] == arr[e])
            {
                arr[e] = -1 * arr[e];
                e++;
            }
            else
            {
                while(e-st != 2) st++;
                st++;
                e++;
            }
        }

        for(int i=0, j=1; j<arr.length; )
        {
            while(arr[j] < 0)
            {
                j++;
            }
        }
        Arrays.stream(arr).forEach(System.out::print);

    }
    static void swap(int[] arr, int i, int j)
    {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
