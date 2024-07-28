package practice.effectiveJava;

import java.time.Instant;
import java.util.Date;

public class FooBarStaticMain
{
    public static void main(String[] args) {
        Boolean b1 = Boolean.FALSE;
        Boolean b2 = Boolean.FALSE;
        Boolean.valueOf(b2);

//        System.out.println(b1==b2);
//        System.out.println(b1.equals(b2));

        Instant inst = Instant.now();
        Date d = Date.from(inst);
        System.out.println("date -> : "+d);

        System.out.println(FooBarStatic.createObject(1));
    }
}
