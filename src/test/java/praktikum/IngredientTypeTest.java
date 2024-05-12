package praktikum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IngredientTypeTest {
    // this test ensures, that if enum is deleted - code will not even compile and we will be informed about problems
    // enum itself are tested when they are used in the tests
    @Test
    public void sauceEnumValueShowsOk() {
        assertEquals(IngredientType.SAUCE, IngredientType.valueOf("SAUCE"));
    }

    @Test
    public void fillingEnumValueShowsOk() {
        assertEquals(IngredientType.FILLING, IngredientType.valueOf("FILLING"));
    }

}