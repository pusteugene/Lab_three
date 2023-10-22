import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CartTest {
    @Test
    void addProduct() {
        Cart cart = new Cart();
        Product product1 = new Product(1, "Product 1", 10.0);
        Product product2 = new Product(2, "Product 2", 20.0);

        // Додаємо продукти до кошика
        cart.addProduct(product1);
        cart.addProduct(product2);

        // Перевіряємо, чи кількість продуктів в кошику відповідає очікуваній
        assertEquals(2, cart.getProducts().size());
    }

    @Test
    void removeProduct() {
        Cart cart = new Cart();
        Product product1 = new Product(1, "Product 1", 10.0);
        Product product2 = new Product(2, "Product 2", 20.0);

        // Додаємо продукти до кошика
        cart.addProduct(product1);
        cart.addProduct(product2);

        // Видаляємо один продукт з кошика
        cart.removeProduct(product1);

        // Перевіряємо, чи кількість продуктів в кошику відповідає очікуваній (має бути 1)
        assertEquals(1, cart.getProducts().size());
    }
}
