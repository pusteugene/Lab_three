import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void testGetId() {
        int id = 1;
        String name = "Product 1";
        double price = 10.0;
        Product product = new Product(id, name, price);
        assertEquals(id, product.getId());
    }

    @Test
    void testSetId() {
        int id = 1;
        String name = "Product 1";
        double price = 10.0;
        Product product = new Product(id, name, price);

        int newId = 2;
        product.setId(newId);
        assertEquals(newId, product.getId());
    }

    @Test
    void testGetName() {
        int id = 1;
        String name = "Product 1";
        double price = 10.0;
        Product product = new Product(id, name, price);
        assertEquals(name, product.getName());
    }

    @Test
    void testSetName() {
        int id = 1;
        String name = "Product 1";
        double price = 10.0;
        Product product = new Product(id, name, price);

        String newName = "Product 2";
        product.setName(newName);
        assertEquals(newName, product.getName());
    }

    @Test
    void testGetPrice() {
        int id = 1;
        String name = "Product 1";
        double price = 10.0;
        Product product = new Product(id, name, price);
        assertEquals(price, product.getPrice(), 0.001);
    }

    @Test
    void testSetPrice() {
        int id = 1;
        String name = "Product 1";
        double price = 10.0;
        Product product = new Product(id, name, price);

        double newPrice = 15.0;
        product.setPrice(newPrice);
        assertEquals(newPrice, product.getPrice(), 0.001);
    }
}
