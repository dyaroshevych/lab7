import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerTest {
    private Flower flower = new Flower(
            Color.Red,
            Type.Rose,
            20,
            3
    );

    @Test
    void getColor() {
        assertEquals(Color.Red, flower.getColor());
    }

    @Test
    void getType() {
        assertEquals(Type.Rose, flower.getType());
    }

    @Test
    void getSepalLength() {
        assertEquals(20, flower.getSepalLength());
    }

    @Test
    void getPrice() {
        assertEquals(3, flower.getPrice());
    }
}
