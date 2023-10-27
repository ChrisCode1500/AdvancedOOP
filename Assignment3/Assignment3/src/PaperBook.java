import java.util.ArrayList;
import java.util.Date;

public class PaperBook extends Book
{
    private ArrayList<String> category;
    public PaperBook(String title, String author, int bookId, Date dueDate, ArrayList<String> category)
    {
        super(title, author, bookId, dueDate);
        this.category = category;
    }

    public ArrayList<String> getCategory()
    {
        return category;
    }

    public void setCategory(ArrayList<String> category)
    {
        this.category = category;
    }
}
