package practice.finalPractice;

public class CustomUncheckedException extends RuntimeException
{
    public CustomUncheckedException(String message)
    {
        System.out.println("Custom Unchecked Exception called");
    }
}
