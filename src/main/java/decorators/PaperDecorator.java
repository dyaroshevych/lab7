package decorators;

import flowers.Item;

public class PaperDecorator extends ItemDecorator {
    public PaperDecorator(Item item) {
        super(item);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "with paper";
    }

    @Override
    public double price() {
        return 4 + super.price();
    }
}
