package customMapPackage;

import java.util.ArrayList;

public class HashMapMain
{
    public static void main(String[] args)
    {
        HashmapCustom.HashMap<String, Integer> hm = new HashmapCustom.HashMap<>();
        hm.put("India", 350000);
        hm.put("China", 900000);
        hm.put("USA", 850000);

        ArrayList<String> keys = hm.keySet();

        for(int i=0; i<keys.size(); i++)
        {
            System.out.println(keys.get(i)+" : "+hm.get(keys.get(i)));
        }

        hm.remove("China");
        System.out.println(hm.get("China"));
    }
}
