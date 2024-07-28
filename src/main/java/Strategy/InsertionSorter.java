package Strategy;

import java.util.Arrays;

public class InsertionSorter implements Sortable
{
    @Override
    public int[] sort(int[] data)
    {
        //Implement insertion sort algo here
        Arrays.sort(data);
        System.out.println("Insertion sort\n"+Arrays.toString(data));
        return data;
    }
}
