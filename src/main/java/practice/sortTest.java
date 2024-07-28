package practice;

import java.util.Arrays;
import java.util.Collections;

public class sortTest
{
    public static void main(String[] args)
    {
        int[] a = {9, 3, 31, 44, 24, 98, 100, 9};
        int n = a.length;

        /*
        mergeSort(a, 0, n-1);

        System.out.println("Merge sort");
        for (int s: a)
        {
            System.out.print(s+" ");
        }


        quickSort(a, 0, n-1);

        System.out.println("\n\nQuick sort");
        for (int s: a)
        {
            System.out.print(s+" ");
        }

        insertionSort(a);

        System.out.println("\n\nInsertion sort");
        for (int s: a)
        {
            System.out.print(s+" ");
        }
        */
        selectionSort(a);

        System.out.println("\n\nSelection sort");
        for(int s : a)
        {
            System.out.print(s+" ");
        }
    }

    public static void selectionSort(int[] a)
    {
        int n = a.length;

        for(int i=0; i<n-1; i++)
        {
            int mini = i;

            for(int j=i+1; j<n; j++)
            {
                if(a[j] < a[mini]) mini = j;
            }
            swap(a, i, mini);
        }
    }
    public static void insertionSort(int[] a)
    {
        int n = a.length;

        for(int i=0; i<=n-1; i++)
        {
             for(int j=i; j > 0 && a[j-1] > a[j]; j--)
            {
                swap(a, j-1, j);
            }
        }
    }

    public static void quickSort(int[] a, int s, int e)
    {
        if(s >= e) return;

        int idx = rearrange(a, s, e);

        quickSort(a, s, idx-1);
        quickSort(a, idx+1, e);
    }
    public static int rearrange(int[] A, int s, int e)
    {
        int p1=s+1, p2=e;

        while(p1 <= p2)
        {
            if(A[p1] <= A[s]) p1++;

            else if (A[p2] > A[s]) p2--;

            else
            {
                swap(A, p1, p2);
                p1++; p2--;
            }
        }
        swap(A, s, p2);
        return p2;
    }
    public static void swap(int[] a, int i, int j)
    {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
    public static void mergeSort(int[] a, int s, int e)
    {
        if(s==e) return;

        int mid = (s+e)/2;
        mergeSort(a, s, mid);
        mergeSort(a, mid+1, e);

        merge(a, s, mid, e);
    }
    public static void merge(int[] a, int s, int m, int e)
    {
        int p1=s, p2=m+1, p3=0;
        int[] res = new int[e-s+1];

        while(p1 <= m && p2 <= e)
        {
            if(a[p1] <= a[p2])
            {
                res[p3] = a[p1];
                p3++;
                p1++;
            }
            else
            {
                res[p3] = a[p2];
                p3++;
                p2++;
            }
        }
        while(p1 <= m)
        {
            res[p3] = a[p1];
            p3++;
            p1++;
        }
        while(p2 <= e)
        {
            res[p3] = a[p2];
            p3++;
            p2++;
        }

        System.arraycopy(res, 0, a, s, e-s+1);
    }
}
