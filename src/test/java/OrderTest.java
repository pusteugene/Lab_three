import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    @Test
    void testGetOrderId() {
        int orderId = 1;
        List<Product> products = new ArrayList<>();
        Order order = new Order(orderId, products);
        assertEquals(orderId, order.getOrderId());
    }

    @Test
    void testSetOrderId() {
        int orderId = 1;
        List<Product> products = new ArrayList<>();
        Order order = new Order(orderId, products);

        int newOrderId = 2;
        order.setOrderId(newOrderId);
        assertEquals(newOrderId, order.getOrderId());
    }

    @Test
    void testGetProducts() {
        int orderId = 1;
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Product 1", 10.0));
        products.add(new Product(2, "Product 2", 15.0));
        Order order = new Order(orderId, products);

        assertEquals(products, order.getProducts());
    }

    @Test
    void testSetProducts() {
        int orderId = 1;
        List<Product> products = new ArrayList<>();
        Order order = new Order(orderId, products);

        List<Product> newProducts = new ArrayList<>();
        newProducts.add(new Product(3, "Product 3", 20.0));
        newProducts.add(new Product(4, "Product 4", 25.0));
        order.setProducts(newProducts);

        assertEquals(newProducts, order.getProducts());
    }

}
