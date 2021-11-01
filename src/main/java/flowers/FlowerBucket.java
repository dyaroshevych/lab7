package flowers;

import java.util.ArrayList;

public class FlowerBucket extends Item {
    FlowerPack[] flowerPacks;
    CalculateFlowerBucketPrice calculatePrice;

    public FlowerBucket(FlowerPack[] flowerPacks) {
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

    @Override
    public double price() {
        return this.calculatePrice.calculate(this.flowerPacks);
    }

    @Override
    public String getDescription() {
        ArrayList<String> packsInfo = new ArrayList<String>();

        for (FlowerPack pack: flowerPacks) {
            packsInfo.add(pack.getDescription());
        }

        return "Bucket with following packs:\n" + String.join("\n", packsInfo);
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
