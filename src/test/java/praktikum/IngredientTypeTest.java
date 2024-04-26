package praktikum;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.*;

public class IngredientTypeTest {
    @Test
    public void sauceEnumValueShowsOk(){
        assertEquals(IngredientType.SAUCE, IngredientType.valueOf("SAUCE"));
    }
    @Test
    public void fillingEnumValueShowsOk(){
        assertEquals(IngredientType.FILLING, IngredientType.valueOf("FILLING"));
    }

}