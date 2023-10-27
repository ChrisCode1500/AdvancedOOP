import java.util.Date;

public class Book {
    private String title;
    private String author;
    private int bookId;
    private Date dueDate;

    public Book(String title, String author, int bookId, Date dueDate)
    {
        this.title = title;
        this.author = author;
        this.bookId = bookId;
        this.dueDate = dueDate;
    }


    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId)
    {
        this.bookId = bookId;
    }

    public Date getDueDate()
    {
        return dueDate;
    }

    public void setDueDate(Date dueDate)
    {
        this.dueDate = dueDate;
    }
}
