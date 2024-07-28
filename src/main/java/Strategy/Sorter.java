package Strategy;

public class Sorter
{
    public static void sort(int[] data, Sortable sortingStrategy)
    {
        data = sortingStrategy.sort(data);
        System.out.println("Sorted data using "+sortingStrategy.getClass().getSimpleName());
    }
}
