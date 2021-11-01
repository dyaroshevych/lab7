package flowers;

import flowers.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerBucketTest {
    private Flower flower1 = new Flower(
            Color.Red,
            Type.Rose,
            20,
            3
    );
    private Flower flower2 = new Flower(
            Color.White,
            Type.Tulip,
            15,
            4
    );
    private FlowerPack flowerPack1 = new FlowerPack(flower1,3);
    private FlowerPack flowerPack2 = new FlowerPack(flower2,5);
    private FlowerPack[] flowerPacks1 = {flowerPack1, flowerPack2};
    private FlowerPack[] flowerPacks2 = {flowerPack2};
    private FlowerBucket flowerBucket1 = new FlowerBucket(flowerPacks1);
    private  FlowerBucket flowerBucket2 = new FlowerBucket(flowerPacks2);

    @Test
    void equals() {
        assertFalse(flowerBucket1.equals(flowerBucket2));
    }

    @Test
    void price() {
        assertEquals(flowerBucket1.price(), 29);
    }
}
