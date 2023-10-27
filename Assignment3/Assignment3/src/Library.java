import java.util.ArrayList;

public class Library
{
    ArrayList<Book> books = new ArrayList<Book>();

    public void AddBook(Book book)
    {
        this.books.add(book);
    }

    public void RemoveBook(Book book)
    {
        this.books.remove(book);
    }

    public Boolean DoesBookExist(Book book)
    {
        for(Book item : this.books)
        {
            if(item.getTitle().equals(book.getTitle()))
            {
                return true;
            }
        }
        return false;
    }

    public void ShowBooks()
    {
        System.out.println("Library books: ");
        for (Book book : this.books)
        {
            System.out.println(book.getTitle());
        }
    }
}
