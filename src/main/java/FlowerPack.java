public class FlowerPack {
    Flower flower;
    int amount;
    CalculateFlowerPackPrice calculatePrice;

    FlowerPack(Flower flower, int amount) {
        this.flower = flower;
        this.amount = amount;
    }

    public boolean equals(FlowerPack otherFlowerPack) {
        return this.flower.equals(otherFlowerPack.flower) &&
                this.amount == otherFlowerPack.amount;
    }

    int price() {
        return this.calculatePrice.calculate(this.flower, this.amount);
    }
}

class CalculateFlowerPackPrice {
    public static int calculate(Flower flower, int amount) {
        return flower.getPrice() * amount;
    }
}
