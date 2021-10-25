import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {
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
    private  FlowerBucket flowerBucket1 = new FlowerBucket(flowerPacks1);
    private  FlowerBucket flowerBucket2 = new FlowerBucket(flowerPacks2);
    private FlowerBucket[] flowerBuckets1 = {flowerBucket1, flowerBucket2};
    private FlowerBucket[] flowerBuckets2 = {flowerBucket2};
    private  Store store1 = new Store(flowerBuckets1);
    private  Store store2 = new Store(flowerBuckets2);

    @Test
    void search() {
        assertTrue(store1.search(flowerBucket1));
        assertFalse(store2.search(flowerBucket1));
    }
}
