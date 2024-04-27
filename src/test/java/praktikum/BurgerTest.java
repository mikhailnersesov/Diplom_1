package praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static praktikum.IngredientType.SAUCE;

@RunWith(MockitoJUnitRunner.class)
public class BurgerTest {
    @Mock
    private List<Ingredient> ingredients;
    @Mock
    private Ingredient ingredient;
    @Mock
    private Bun bun;
    @Test
    public void setBunsSpecificBunShowsOk() {
        Burger burger = new Burger(bun, ingredients);
        burger.setBuns(bun);
        assertEquals(bun, burger.getBun());
    }

    @Test
    public void addIngredientSpecificIngedientShowsOk() {
        Burger burger = new Burger(bun, ingredients);
        burger.addIngredient(ingredient); // call the method
        verify(ingredients).add(ingredient); // verify that the method was called with correct parameter
    }

    @Test
    public void removeIngredientSpecificIngedientShowsOk() {
        Burger burger = new Burger(bun, ingredients);
        burger.removeIngredient(5);
        verify(ingredients).remove(5);
    }

    @Test
    public void moveIngredientSpecificIngedientShowsOk() {
        Burger burger = new Burger(bun, ingredients);
        burger.moveIngredient(10, 15);// call the method
        verify(ingredients).add(15,ingredients.remove(10));
    }

    @Test
    public void getPrice() {
        List<Ingredient> ingredients = List.of(ingredient); // mocking the line: " for (Ingredient ingredient : ingredients) {"
        Burger burger = new Burger(bun, ingredients);
        float expectedPrice = 50.F;
        when(bun.getPrice()).thenReturn(expectedPrice); // mocking the line: "float price = bun.getPrice() * 2;"
        when(ingredient.getPrice()).thenReturn(expectedPrice); // mocking the line: "price += ingredient.getPrice();"

        float actualPrice = burger.getPrice() / 3; // mocking "return price;" return function -> getter
        assertEquals(expectedPrice, actualPrice, 0); // compare
    }

    @Test
    public void getReceipt() {
        List<Ingredient> ingredients = List.of(ingredient);
        Burger burger = new Burger(bun, ingredients);
        when(bun.getName()).thenReturn("Ciabatta");
        IngredientType type = SAUCE;
        when(ingredient.getType()).thenReturn(type);
        String expectedReceipt = "(==== Ciabatta ====)\n" +
                "= sauce null =\n" +
                "(==== Ciabatta ====)\n" +
                "\n" +
                "Price: 0,000000\n";
        String actualReceipt = burger.getReceipt();
        assertEquals(expectedReceipt,actualReceipt);
    }

    @Test
    public void getBunSpecificBunShowsOk() {
        Burger burger = new Burger(bun, ingredients);
        Bun actualBun = burger.getBun();
        assertEquals(bun, actualBun);
    }
}