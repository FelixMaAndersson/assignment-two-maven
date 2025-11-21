import static org.junit.jupiter.api.Assertions.*;

import models.Book;
import models.BookCatalog;
import models.BookNotFoundException;
import org.junit.jupiter.api.Test;

public class BookCatalogTest {

    private BookCatalog bc;
    private Book book1;

    public BookCatalogTest() {
        bc = new BookCatalog();
        book1 = new Book(1, "Learning Java", "", "", "", 0);
        bc.addBook(book1);
    }

    //G
    @Test
    public void testAddABook() {
        assertEquals(1, bc.getNumberOfBooks());
    }

    //G
    /**
     * Verifies that findBook returns the correct book when it exists in the catalog.
     */
    @Test
    public void testFindBook() {
        try {
            Book found = bc.findBook("Learning Java");
            assertEquals(book1, found);
        } catch (BookNotFoundException e) {
            fail("BookNotFoundException should not have been thrown");
        }
    }

    //G
    /**
     * Verifies that findBook matches titles regardless of letter casing.
     */
    @Test
    public void testFindBookIgnoringCase() {
        try {
            Book found = bc.findBook("learning java");
            assertEquals(book1, found);
        } catch (BookNotFoundException e) {
            fail("BookNotFoundException should not have been thrown");
        }
    }

    //G
    /**
     * Verifies that findBook matches titles regardless of extra spacing.
     */
    @Test
    public void testFindBookWithExtraSpaces() {
        try {
            Book found = bc.findBook("     learning java       ");
            assertEquals(book1, found);
        } catch (BookNotFoundException e) {
            fail("BookNotFoundException should not have been thrown");
        }
    }

    //VG
    // This test should throw BookNotFoundException in order to pass.
    /**
     * Verifies that searching for a non-existing book throws BookNotFoundException.
     */
    @Test
    public void testFindBookThatDoesntExist() throws BookNotFoundException {
        try {
            bc.findBook("Unlearning Javadådå?");
            fail("BookNotFoundException should have been thrown");
        } catch (BookNotFoundException e) {
            // BookNotFoundException was thrown
        }
    }
}
