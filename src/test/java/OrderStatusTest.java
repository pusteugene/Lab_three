import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderStatusTest {

    @Test
    void testGetOrderStatus() {
        int orderId = 1;
        List<Product> products = new ArrayList<>();
        Order order = new Order(orderId, products);
        assertEquals("Pending", order.getStatus());
    }

    @Test
    void testSetOrderStatus() {
        int orderId = 1;
        List<Product> products = new ArrayList<>();
        Order order = new Order(orderId, products);

        String newStatus = "Completed";
        order.setStatus(newStatus);
        assertEquals(newStatus, order.getStatus());
    }
}
