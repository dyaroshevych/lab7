package flowers;

public class FlowerPack extends Item {
    Flower flower;
    int amount;
    CalculateFlowerPackPrice calculatePrice;

    public FlowerPack(Flower flower, int amount) {
        this.flower = flower;
        this.amount = amount;
    }

    public boolean equals(FlowerPack otherFlowerPack) {
        return this.flower.equals(otherFlowerPack.flower) &&
                this.amount == otherFlowerPack.amount;
    }

    @Override
    public double price() {
        return this.calculatePrice.calculate(this.flower, this.amount);
    }

    @Override
    public String getDescription() {
        return "Pack from" + flower.getColor() + " " + flower.getType() + " with sepal length " + flower.getSepalLength() + " x" + amount;
    }
}

class CalculateFlowerPackPrice {
    public static double calculate(Flower flower, int amount) {
        return flower.price() * amount;
    }
}
