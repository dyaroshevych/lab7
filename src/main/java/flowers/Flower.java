package flowers;

import lombok.Setter;
import lombok.Getter;
import lombok.AllArgsConstructor;

@Setter @Getter @AllArgsConstructor
public class Flower extends Item {
    private Color color;
    private Type type;
    private int sepalLength;
    private double price;

    public boolean equals(Flower otherFlower) {
        return this.getColor() == otherFlower.getColor() &&
                this.getType() == otherFlower.getType() &&
                this.getSepalLength() == otherFlower.getSepalLength() &&
                this.getPrice() == otherFlower.getPrice();
    }

    @Override
    public double price() {
        return price;
    }

    @Override
    public String getDescription() {
        return "" + color + " " + type + " with sepal length " + sepalLength;
    }
}
