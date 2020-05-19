import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RentalTest {
    @Test
    public void testRental(){
        Movie regMovie = new Movie("REG", Movie.REGULAR);
        Rental rental = new Rental(regMovie, 7);
        assertEquals(7, rental.getDaysRented());
        assertEquals("REG", rental.getMovie().getTitle());
    }
}