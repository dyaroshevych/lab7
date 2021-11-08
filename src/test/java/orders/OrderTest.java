package orders;

import decorators.BasketDecorator;
import decorators.PaperDecorator;
import decorators.RibbonDecorator;
import delivery.Delivery;
import delivery.PostDeliveryStrategy;
import flowers.*;
import org.junit.jupiter.api.Test;
import payment.PayPalPaymentStrategy;
import payment.Payment;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    private Flower flower1 = new Flower(Color.White, Type.Rose, 12, 5);
    private FlowerPack flowerPack1 = new FlowerPack(flower1,7);

    private Flower flower2 = new Flower(Color.Red, Type.Tulip, 10, 4);
    private FlowerPack flowerPack2 = new FlowerPack(flower2,5);

    private FlowerPack[] flowerPacks1 = {flowerPack1, flowerPack2};
    private FlowerBucket flowerBucket1 =  new FlowerBucket(flowerPacks1);

    private FlowerPack[] flowerPacks2 = {flowerPack2};
    private FlowerBucket flowerBucket2 =  new FlowerBucket(flowerPacks2);

    private Order order = new Order();

    private Item updatedBucket1 = new RibbonDecorator(new PaperDecorator(new BasketDecorator(flowerBucket1)));
    private Item updatedBucket2 = new BasketDecorator(new RibbonDecorator(flowerBucket2));
    private Delivery delivery = new PostDeliveryStrategy();
    private Payment payment = new PayPalPaymentStrategy();

    @Test
    void calculatePrice() {
        order.addItem(updatedBucket1);
        order.addItem(updatedBucket2);
        order.setPaymentStrategy(payment);
        order.setDeliveryStrategy(delivery);
        order.processOrder();
        assertEquals(order.calculateTotalPrice() ,185);
    }
}
