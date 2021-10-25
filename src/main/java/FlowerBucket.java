public class FlowerBucket {
    FlowerPack[] flowerPacks;
    CalculateFlowerBucketPrice calculatePrice;

    FlowerBucket(FlowerPack[] flowerPacks) {
        this.flowerPacks = flowerPacks;
    }

    public boolean equals(FlowerBucket otherFlowerBucket) {
        if (this.flowerPacks.length != otherFlowerBucket.flowerPacks.length) {
            return false;
        }

        for (int idx = 0; idx < this.flowerPacks.length; idx++) {
            if (!this.flowerPacks[idx].equals(otherFlowerBucket.flowerPacks[idx])) {
                return false;
            }
        }

        return true;
    }

    public int price() {
        return this.calculatePrice.calculate(this.flowerPacks);
    }

}

class CalculateFlowerBucketPrice {
    public static int calculate(FlowerPack[] flowerPacks) {
        int price = 0;
        for (FlowerPack flowerPack: flowerPacks) {
            price += flowerPack.price();
        }

        return price;
    }
}
