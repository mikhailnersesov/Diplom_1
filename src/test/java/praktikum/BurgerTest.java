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

    @Test
    public void setBuns() {
    }

    @Test
    public void addIngredientSpecificIngedientShowsOk() {
        Burger burger = new Burger(bun, ingredients);
        burger.addIngredient(ingredient);
        verify(ingredients).add(ingredient);
    }

    @Test
    public void removeIngredientSpecificIngedientShowsOk() {
        Burger burger = new Burger(bun, ingredients);
        burger.removeIngredient(5);
        verify(ingredients).remove(5);
    }

    @Test
    public void moveIngredient() {
    }

    @Test
    public void getPrice() {
    }

    @Test
    public void getReceipt() {
    }
}