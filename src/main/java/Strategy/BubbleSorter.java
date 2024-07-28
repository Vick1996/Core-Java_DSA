package Strategy;

import java.util.Arrays;

public class BubbleSorter implements Sortable
{
    @Override
    public int[] sort(int[] data)
    {
        //Implement bubble sort algo here
        Arrays.sort(data);
        System.out.println("Inside bubble sort\n"+Arrays.toString(data));
        return data;
    }
}
