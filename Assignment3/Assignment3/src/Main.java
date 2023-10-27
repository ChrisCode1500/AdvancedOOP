import java.util.Calendar;
import java.util.Date;

public class Main
{
    public static void main(String[] args)
    {
        Library library = new Library();
        Student student = new Student();
        Teacher teacher = new Teacher();
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MONTH, 11);
        calendar.set(Calendar.DATE, 5);
        calendar.set(Calendar.YEAR, 2023);
        Date dueDate = calendar.getTime();
        Book readyPlayerOne = new Book("Ready Player One", "Ernest Cline", 1, dueDate);
        Book necronomicon = new Book("Necronomicon", "H.P. Lovecraft", 2, dueDate);
        library.AddBook(readyPlayerOne);
        library.AddBook(necronomicon);
        library.ShowBooks();
        student.BorrowBook(library, readyPlayerOne);
        teacher.BorrowBook(library, necronomicon);

        student.ShowBooks();
        teacher.ShowBooks();
        library.ShowBooks();
    }
}