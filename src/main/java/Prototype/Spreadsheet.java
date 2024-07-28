package Prototype;

public class Spreadsheet extends TextDocument
{
    @Override
    public Document clone() throws CloneNotSupportedException
    {
        return (Spreadsheet) super.clone();
    }
}
