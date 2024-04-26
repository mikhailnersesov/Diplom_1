package praktikum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IngredientTest {
    private static final IngredientType INGREDIENT_TYPE = null;
    private static final String INGREDIENT_NAME = "Bread";
    private static final float INGRDIENT_PRICE = 15.0F;

    @Test
    public void getPriceTenShowsOk() {
        float expectedPrice = 10.0F;
        Ingredient ingredient = new Ingredient(INGREDIENT_TYPE, INGREDIENT_NAME, expectedPrice);
        float actualPrice = ingredient.getPrice();
        assertEquals(expectedPrice, actualPrice,0);
    }

    @Test
    public void getNameMilkShowsOk() {
        String expectedName = "Milk";
        Ingredient ingredient = new Ingredient(INGREDIENT_TYPE, expectedName, INGRDIENT_PRICE);
        String actualName = ingredient.getName();
        assertEquals(expectedName, actualName);
    }

    @Test
    public void getTypeNullShowsOk() {
        IngredientType expectedType = INGREDIENT_TYPE;
        Ingredient ingredient = new Ingredient(expectedType, INGREDIENT_NAME, INGRDIENT_PRICE);
        IngredientType actualName = ingredient.getType();
        assertEquals(expectedType, actualName);
    }
}