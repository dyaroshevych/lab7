package delivery;

import flowers.Item;

import java.util.List;

public class DHLDeliveryStrategy implements Delivery {
    @Override
    public void deliver(List<Item> items) {
        System.out.println("Your items were delivered with DHL delivery strategy");
    }
}
