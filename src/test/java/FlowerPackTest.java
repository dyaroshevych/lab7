import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerPackTest {
    private FlowerPack flowerPack = new FlowerPack(
            new Flower(
                Color.Red,
                Type.Rose,
                20,
                3
            ),
            5
    );

    @Test
    void equals() {
        assertTrue(flowerPack.equals(
                new FlowerPack(
                    new Flower(
                            Color.Red,
                            Type.Rose,
                            20,
                            3
                    ),
                    5
                    )
                )
        );
        assertFalse(flowerPack.equals(
                        new FlowerPack(
                                new Flower(
                                        Color.Red,
                                        Type.Rose,
                                        20,
                                        3
                                ),
                                4
                        )
                )
        );
        assertFalse(flowerPack.equals(
                        new FlowerPack(
                                new Flower(
                                        Color.Red,
                                        Type.Rose,
                                        10,
                                        3
                                ),
                                5
                        )
                )
        );
    }

    @Test
    void price() {
        assertEquals(flowerPack.price(), 15);
    }
}
