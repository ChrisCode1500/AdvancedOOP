import java.util.Date;

public class EBook extends Book
{
    private String category;
    public EBook(String title, String author, int bookId, Date dueDate, String category)
    {
        super(title, author, bookId, dueDate);
        this.category = category;
    }

    public String getCategory()
    {
        return category;
    }

    public void setCategory(String category)
    {
        this.category = category;
    }
}
