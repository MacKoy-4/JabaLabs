package LabaTest3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import org.program.Laba3.*;

public class LabaTest {
    @Test
    void AddProducts() {
        Product laptop = new Product(1, "Laptop", 999.99);
        Product smartphone = new Product(2, "Smartphone", 499.99);
        Cart cart = new Cart();
        ECommerceSystem eCommerceSystem = new ECommerceSystem();

        //assertEquals(laptop, eCommerceSystem.get);
        eCommerceSystem.addToCart(cart, laptop);
        eCommerceSystem.addToCart(cart, smartphone);
        System.out.println("Added to Cart: " + smartphone.getName());
    }

    @Test
    void RemoveProducts() {

    }

    @Test
    void PlaceOrder() {

    }

    @Test
    void GetOrderStatus() {

    }
}
