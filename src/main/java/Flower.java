import lombok.Setter;
import lombok.Getter;
import lombok.AllArgsConstructor;

@Setter @Getter @AllArgsConstructor
public class Flower {
    private Color color;
    private Type type;
    private int sepalLength;
    private int price;

    public boolean equals(Flower otherFlower) {
        return this.getColor() == otherFlower.getColor() &&
                this.getType() == otherFlower.getType() &&
                this.getSepalLength() == otherFlower.getSepalLength() &&
                this.getPrice() == otherFlower.getPrice();
    }
}
