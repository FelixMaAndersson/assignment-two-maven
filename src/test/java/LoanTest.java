import static org.junit.jupiter.api.Assertions.*;

import models.*;
import org.junit.jupiter.api.Test;
import utilities.GenderType;

import java.time.*;

public class LoanTest {
    Customer c1 = new Customer("Mr", "Felix", "Andersson", "", "", "", 0, GenderType.MALE);
    Book b1 = new Book(1, "Learning Java", "", "", "", 0);

    Loan l1 = new Loan(1, c1, b1);
    LocalDate dueDate = LocalDate.now().plusDays(14);

    //VG

    /**
     * Verifies that a newly created Loan sets its due date
     * to 14 days after the loan date.
     */
    @Test
    public void testDueDate() {
        assertEquals(dueDate, l1.getDueDate());
    }
}