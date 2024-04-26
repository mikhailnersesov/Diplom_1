package praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class BurgerTest {
    @Mock
    private List<Ingredient> ingredients;
    @Mock
    private Ingredient ingredient;
    @Mock
    private Bun bun;
    @Mock
    Burger burger;
    float price;

    @Test
    public void setBunsSpecificBunShowsOk() {
        Burger burger = new Burger(bun, ingredients);
        burger.setBuns(bun);
        assertEquals(bun,burger.getBun());
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
        burger.moveIngredient(10,15);// call the method
         //TODO verify that the method was called with correct parameter
    }

    @Test
    public void getPrice() {
        when(bun.getPrice()).thenReturn(price); //TODO
    }

    @Test
    public void getReceipt() {
    }

    @Test
    public void getBunSpecificBunShowsOk() {
        Burger burger = new Burger(bun, ingredients);
        Bun actualBun = burger.getBun();
        assertEquals(bun, actualBun);
    }
}