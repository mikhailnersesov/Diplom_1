package com.food;

import org.junit.Test;
import praktikum.Bun;

import static org.junit.Assert.assertEquals;

public class BunTest {
    @Test
    public void getNameIvanShowsOk() {
        String expectedName = "Ivan";
        Bun bun = new Bun(expectedName, 5);
        String actualName = bun.getName();
        assertEquals(expectedName, actualName);
    }

    @Test
    public void getPriceTenShowsOk() {
        float expectedPrice = 10.0F;
        Bun bun = new Bun("Igor", expectedPrice);
        float actualPrice = bun.getPrice();
        assertEquals(expectedPrice, actualPrice);
    }
}