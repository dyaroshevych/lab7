package orders;

import decorators.PaperDecorator;
import delivery.Delivery;
import delivery.PostDeliveryStrategy;
import flowers.*;
import payment.PayPalPaymentStrategy;
import payment.Payment;
import users.Receiver;
import users.Sender;


public enum QuickOrder {
    ROSE_BUCKET, CHAMOMILE_BUCKET, TULIP_BUCKET;

    public static Order createOrder(QuickOrder orderConstrictor) {
        Order order = new Order();
        FlowerBucket bucket;

        Delivery delivery = new PostDeliveryStrategy();
        order.setDeliveryStrategy(delivery);

        Payment payment = new PayPalPaymentStrategy();
        order.setPaymentStrategy(payment);

        Sender sender = new Sender();
        order.addUser(sender);

        Receiver receiver = new Receiver();
        order.addUser(receiver);

        if (orderConstrictor == QuickOrder.ROSE_BUCKET) {
            Flower flower = new Flower(Color.Red,Type.Rose, 20, 3);
            FlowerPack[] flowerPacks =  { new FlowerPack(flower,7) };
            bucket = new FlowerBucket(flowerPacks);
        } else if (orderConstrictor == QuickOrder.CHAMOMILE_BUCKET){
            Flower flower = new Flower(Color.Red, Type.Chamomile, 10, 5);
            FlowerPack[] flowerPacks =  { new FlowerPack(flower,9) };
            bucket = new FlowerBucket(flowerPacks);
        } else if (orderConstrictor == QuickOrder.TULIP_BUCKET) {
            Flower flower = new Flower(Color.Red, Type.Tulip, 15, 4);
            FlowerPack[] flowerPacks =  { new FlowerPack(flower,3) };
            bucket = new FlowerBucket(flowerPacks);
        } else {
            System.out.println("Bucket is currently not available.");
            return order;
        }

        order.addItem(new PaperDecorator(bucket));
        return order;
    }
}