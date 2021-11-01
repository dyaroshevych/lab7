import delivery.Delivery;
import flowers.Item;
import payment.Payment;

import java.util.ArrayList;

public class Order {
    private ArrayList<Item> items = new ArrayList<Item>();
    private Payment payment;
    private Delivery delivery;

    public void setPaymentStrategy(Payment paymentStrategy) {
        payment = paymentStrategy;
    }

    public void setDeliveryStrategy(Delivery deliveryStrategy) {
        delivery = deliveryStrategy;
    }

    public double calculateTotalPrice() {
        double price = 0;

        for (Item item: items) {
            price += item.price();
        }

        return price;
    }

    public void processOrder() {
        payment.pay(calculateTotalPrice());
        delivery.deliver(items);
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }
}
