package Strategy;

public class SortMain
{
    public static void main(String[] args)
    {
        int[] data = {5, 4, 2, 1, 3, 0, 9};

        Sorter.sort(data, new BubbleSorter());
//        System.out.println(Arrays.toString(data));

        data = new int[] {10, 40, 34, 5, 2, 9};
        Sorter.sort(data, new InsertionSorter());
//        System.out.println(Arrays.toString(data));
    }
}