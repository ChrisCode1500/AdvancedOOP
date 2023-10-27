import java.util.ArrayList;

public class Student implements LibraryUser
{
    ArrayList<Book> studentBooks = new ArrayList<Book>();
    @Override
    public void BorrowBook(Library library, Book book)
    {
        if (library.DoesBookExist(book))
        {
            studentBooks.add(book);
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
        studentBooks.remove(book);
        library.AddBook(book);
    }

    @Override
    public void ShowBooks()
    {
        System.out.println("Student books: ");
        for (Book book : this.studentBooks)
        {
            System.out.println(book.getTitle());
        }
    }
}
