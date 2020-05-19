import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    @Test
    public void customersTest()
    {
        Customer testCustomer = new Customer("Test Customer");
        assertEquals("Test Customer", testCustomer.getName());
    }


}