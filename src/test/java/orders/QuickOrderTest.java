package orders;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickOrderTest {
    Order order;

    @Test
    void createOrder() {
        order = QuickOrder.createOrder(QuickOrder.TULIP_BUCKET);
        assertEquals(order.calculateTotalPrice(), 16);
    }
}