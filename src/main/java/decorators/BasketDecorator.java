package decorators;

import flowers.Item;

public class BasketDecorator extends ItemDecorator {
    public BasketDecorator(Item item) {
        super(item);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "with basket";
    }

    @Override
    public double price() {
        return 13 + super.price();
    }
}
