package orders;

import delivery.Delivery;
import flowers.Item;
import payment.Payment;
import users.User;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private ArrayList<Item> items = new ArrayList<Item>();
    private Payment payment;
    private Delivery delivery;
    private List<User> users = new ArrayList<User>();

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public void notifyUsers() {
        for (User user: users) {
            user.update("notified");
        }
    }

    public void order() {
        notifyUsers();
    }

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
