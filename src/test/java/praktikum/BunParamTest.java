package praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BunParamTest {
    @Parameterized.Parameter(0)
    public String bunName;
    @Parameterized.Parameter(1)
    public float bunPrice;

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][]{
                {"Ciabatta", 10.0F},
                {"Baguetteddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd", 10.0F},
                {"", 10.0F},
                {null, 10.0F},
                {"&%$§)=", 10.0F},
                {"Ciabatta", -10.0F},
                {"Ciabatta", 0},
                {"Ciabatta", Float.MAX_VALUE},
                {"Ciabatta", Float.MIN_VALUE},
        };
    }

    @Test
    public void getNameParameterisedNameShowsOk() {
        String expectedName = bunName;
        Bun bun = new Bun(expectedName, bunPrice);
        String actualName = bun.getName();
        assertEquals(expectedName, actualName);
    }

    @Test
    public void getPriceParameterisedPriceShowsOk() {
        float expectedPrice = bunPrice;
        Bun bun = new Bun(bunName, expectedPrice);
        float actualPrice = bun.getPrice();
        assertEquals(expectedPrice, actualPrice,0);
    }
}