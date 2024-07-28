package practice;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class SolutionClass
{
    public static void main(String[] args)
    {
        String s = "tree";
        Map<Character, Long> map = s.chars().mapToObj(c -> (char)(c)).collect(Collectors.groupingBy(f->f, Collectors.counting()));
        System.out.println(map);

        Optional<String> t = null;
        System.out.println(Optional.ofNullable(t));

        int n;
        List<Item> itemList = new ArrayList<>();
        HashMap<Item, Integer> hm = new HashMap<>();
        BigDecimal b = new BigDecimal(19999999999.9999999);

        Item item1 = new Item(19999, "item1", b);
        Item item2 = new Item(19999, "item2", b);
        Item item3 = new Item(19999, "item1", b);
        Item item4 = new Item(19999, "item1", b);

        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
        n = itemList.size();

        while(n-- > 0)
        {
            Item it = itemList.get(n);
            hm.put(it, hm.getOrDefault(it, 0) +1);
        }
        System.out.println(hm);
    }
}
class Item
{
    private long id;
    private String name;
    private BigDecimal price;

    public Item(long id, String name, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public int hashCode() {
        return (int)this.getId();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==this) return true;

        if(obj==null || obj.getClass() != this.getClass()) return false;

        Item item = (Item) obj;

        return item.id==this.id;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
