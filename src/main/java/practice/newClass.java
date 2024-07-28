package practice;

public class newClass
{
    public static void main(String[] args)
    {
        int[] arr = {5,6,7,8,9,1,2,3,4};
        int[] arr2 = {0, 2, 3, 4, 5};
        findMin(arr2);
    }
    public static void findMin(int[] arr)
    {
        int l = 0, e = arr.length-1;

        while(l < e)
        {
            int mid = l + (e-l) /2;

            if(arr[mid] > arr[e]) l = mid + 1;
            else e = mid;
        }
        System.out.println(arr[l]);
    }
}
