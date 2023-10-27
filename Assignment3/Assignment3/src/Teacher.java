import java.util.ArrayList;

public class Teacher implements LibraryUser
{
    ArrayList<Book> teacherBooks = new ArrayList<Book>();
    @Override
    public void BorrowBook(Library library, Book book)
    {
        if (library.DoesBookExist(book))
        {
            teacherBooks.add(book);
            library.RemoveBook(book);
        }
        else
        {
            System.out.println("Sorry, that book isn't in the collection.");
        }
    }

    @Override
    public void ReturnBook(Library library, Book book)
    {
        teacherBooks.remove(book);
        library.AddBook(book);
    }

    @Override
    public void ShowBooks()
    {
        System.out.println("Teacher books: ");
        for (Book book : this.teacherBooks)
        {
            System.out.println(book.getTitle());
        }
    }
}
