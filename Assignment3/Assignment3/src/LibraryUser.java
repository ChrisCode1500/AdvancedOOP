import java.util.ArrayList;

public interface LibraryUser
{
    public void BorrowBook(Library library, Book book);
    public void ReturnBook(Library library, Book book);
    public void ShowBooks();
}
