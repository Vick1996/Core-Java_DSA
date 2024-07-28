package practice.finalPractice;


import java.io.IOException;

class Parent
{
    public void disp(Child child) throws CustomCheckedException
    {
        if(child==null)
            throw new CustomCheckedException("Child reference could not be null");
        child.disp(child);
    }
}
class Child extends Parent
{
    @Override
    public void disp(Child child) throws CustomCheckedException
    {
        System.out.println("Inside child disp");
    }
}
public class ExceptionMain
{
    public static void main(String[] args) throws CustomCheckedException
    {
        Parent p = new Parent();
        Child child = null;
        p.disp(child);
    }
}