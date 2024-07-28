package Prototype;

import javax.print.Doc;

public abstract class Document implements Cloneable
{
    private String title;
    private String content;
    private String formatting;
    private Stats stats;

    public String getTitle() {
        return title;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFormatting() {
        return formatting;
    }

    public void setFormatting(String formatting) {
        this.formatting = formatting;
    }

    @Override
    public Document clone() throws CloneNotSupportedException
    {
        //Logic for deep copy potentially
        Document cloned = (Document) super.clone();

        if(stats != null)
        {
            cloned.setStats(new Stats(stats.getId(), stats.getName()));
        }
        return cloned;
    }
}
