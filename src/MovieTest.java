import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest {
    @Test
    void testMovie() {
        Movie childrenMovie = new Movie("Tom and Jerry", Movie.CHILDREN);
        assertEquals("Tom and Jerry", childrenMovie.getTitle());
    }

}