package decorators;

import flowers.Item;

public class RibbonDecorator extends ItemDecorator {
    public RibbonDecorator(Item item) {
        super(item);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "with ribbon";
    }

    @Override
    public double price() {
        return 40 + super.price();
    }
}
