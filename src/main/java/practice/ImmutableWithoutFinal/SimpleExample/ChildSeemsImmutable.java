package practice.ImmutableWithoutFinal.SimpleExample;

import java.util.HashMap;

public class ChildSeemsImmutable extends  SeemsImmutable
{
    private int realVal;

    public ChildSeemsImmutable(int realVal)
    {
        super(realVal);
        this.realVal = realVal;
    }

    public int getRealVal()
    {
        return realVal;
    }

    public void setRealVal(int newRealVal)
    {
        this.realVal = newRealVal;
    }

    public static void main(String[] args)
    {
        ChildSeemsImmutable childObj1 = new ChildSeemsImmutable(888);

        ChildSeemsImmutable childObj = new ChildSeemsImmutable(10);

        SeemsImmutable seemsImmObj = (SeemsImmutable) childObj;

        //System.out.println("Parent obj: "+seemsImmObj.getValue());

        childObj.setRealVal(999);
        System.out.println("Child obj val: "+childObj.getValue());


        System.out.println("Parent obj val: "+seemsImmObj.getValue());

        HashMap<SeemsImmutable, Integer> hm = new HashMap<>();
        //hm.put(seemsImmObj, seemsImmObj.getValue());

        hm.put(childObj, childObj.getValue());

        childObj1.setRealVal(199000);

        System.out.println("Child1: "+childObj1.getValue());
        System.out.println(hm.get(childObj));
    }
}
