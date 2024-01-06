package LabaTest2;

import org.junit.jupiter.api.Test;

import org.program.Laba2.*;

public class LabaTest {
    @Test
    void TestFunc() {
        Library library = new Library();
        Book newBook = new Book("title", "author", "abc1000", 2000);
        library.addBook(newBook);

        library.showAllBooks();

        Book interestingBook;

        interestingBook = library.findBookByTitle("title");
        if (interestingBook != null) {
            System.out.println("Знайдена книга:\n" + interestingBook);
        } else {
            System.out.println("Книгу не знайдено.");
        }

        library.removeBookByISBN("abc1000");

        interestingBook = library.findBookByTitle("title");
        if (interestingBook != null) {
            System.out.println("Знайдена книга:\n" + interestingBook);
        } else {
            System.out.println("Книгу не знайдено.");
        }
    }
}
