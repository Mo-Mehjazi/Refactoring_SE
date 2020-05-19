import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgramTest {
    @Test
    public void testProgram() {
        Customer customer = new Customer("Test Customer");
        Movie childrenMovie = new Movie("Tom and Jerry", Movie.CHILDREN);
        Movie regMovie = new Movie("SAW VI", Movie.REGULAR);
        Movie newMovie = new Movie("A Quiet Place 2", Movie.NEW_RELEASE);
        Rental rent1 = new Rental(regMovie, 5);
        Rental rent2 = new Rental(childrenMovie, 4);
        Rental rent3 = new Rental(newMovie,6);

        customer.addRental(rent1);
        customer.addRental(rent2);
        customer.addRental(rent3);

        String toShow = "Rental Record for " + "Test Customer" + "\n" + "\t" + "Title" + "\t" +
                "\t" + "Days" + "\t" + "Amount" + "\n" + "\t" + "SAW VI" + "\t" + "\t" +
                5 + "\t" + 6.5 + "\n" + "\t" + "Tom and Jerry" + "\t" + "\t" + 4 + "\t" + 3.0 + "\n" +
                "\t" + "A Quiet Place 2" + "\t" + "\t" + 6 + "\t" + 18.0 + "\n" + "Amount owed is " +
                27.5 + "\n" + "You earned " + 4 + " frequent renter points";

        String act = customer.statement();
        assertEquals(toShow, act);
    }
}