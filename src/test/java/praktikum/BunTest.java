package praktikum;

import org.junit.Test;
import praktikum.Bun;

import static org.junit.Assert.assertEquals;

public class BunTest {
    private static final int BUN_PRICE = 5;
    private static final String BUN_NAME = "Baguette";

    @Test
    public void getNameCiabattaShowsOk() {
        String expectedName = "Ciabatta";
        Bun bun = new Bun(expectedName, BUN_PRICE);
        String actualName = bun.getName();
        assertEquals(expectedName, actualName);
    }

    @Test
    public void getPriceTenShowsOk() {
        float expectedPrice = 10.0F;
        Bun bun = new Bun(BUN_NAME, expectedPrice);
        float actualPrice = bun.getPrice();
        assertEquals(expectedPrice, actualPrice,0);
    }
}