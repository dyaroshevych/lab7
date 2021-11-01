package flowers;

public class Store {
    FlowerBucket[] flowerBuckets;

    Store(FlowerBucket[] flowerBuckets) {
        this.flowerBuckets = flowerBuckets;
    }

    public boolean search(FlowerBucket flowerBucketToSearch) {
        for (FlowerBucket flowerBucket: this.flowerBuckets) {
            if (flowerBucket.equals(flowerBucketToSearch)) {
                return true;
            }
        }
        return false;
    }
}
