package Prototype;

public class TextDocument extends Document
{
    @Override
    public Document clone() throws CloneNotSupportedException
    {
        return (TextDocument) super.clone();
    }
}
