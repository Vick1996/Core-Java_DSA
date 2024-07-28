package Prototype;

public class PrototypeMain
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        TextDocument tObj = new TextDocument();
        tObj.setTitle("TextDoc Obj");
        tObj.setContent("Some sample content of textDoc");
        tObj.setStats(new Stats("101", "Basic Stat"));

        TextDocument clonedObj = (TextDocument) tObj.clone();

        System.out.println(tObj.getTitle()+" "+clonedObj.getTitle());
        System.out.println(tObj.getStats().hashCode()+" "+clonedObj.getStats().hashCode());
//        System.out.println(tObj.hashCode()+"  "+clonedObj.hashCode());

        tObj.getStats().setId("Id changed for tObj");
        System.out.println(tObj.getStats().getId()+ " || "+clonedObj.getStats().getId());
        System.out.println("Equality: "+(tObj.equals(clonedObj)));
    }
}
