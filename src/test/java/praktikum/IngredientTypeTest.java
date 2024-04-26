package praktikum;

import static org.junit.Assert.*;

public class IngredientTypeTest {
    public void testEnumValuesShowsOk(){
        assertEquals(IngredientType.SAUCE, IngredientType.valueOf("SAUCE"));
        assertEquals(IngredientType.FILLING, IngredientType.valueOf("FILLING"));
    }

}