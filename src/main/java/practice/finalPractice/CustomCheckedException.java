package practice.finalPractice;

public class CustomCheckedException extends Exception
{
    public CustomCheckedException(String message) {
        System.out.println(message);
    }
}
