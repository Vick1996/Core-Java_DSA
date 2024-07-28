package practice.finalPractice;

public class StringExample
{
    public static void main(String[] args)
    {
        String s = "newString";
        String s2 = "stringex";     //s.intern();

        System.out.println(s.intern());

        String s3 = s2.intern();
        String s4 = new String("stringex");
        System.out.println(s4.hashCode()+" "+s3.hashCode());
    }
}
