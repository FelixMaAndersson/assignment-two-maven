import static org.junit.jupiter.api.Assertions.*;

import models.Book;
import org.junit.jupiter.api.Test;

class BookTest {
    Book b1 = new Book(1, "Learning Java", "", "", "", 0);
    Book b2 = new Book(1, "Learning Java", "", "", "", 0);
    Book b3 = new Book(2, "Learning Yoda", "", "", "", 0);

    //G
    /**
     * Verifies that two Book objects with identical data are considered equal.
     */
    @Test
    public void test2EqualBooks() {
        assertEquals(b1, b2);
    }

    //G
    /**
     * Verifies that two Book objects with unidentical data are considered non equal.
     */
    @Test
    public void test2NonEqualBooks() {
        assertNotEquals(b1, b3);
    }

}
