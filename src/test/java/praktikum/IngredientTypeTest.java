package praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class IngredientTypeTest {
    @Parameterized.Parameter(0)
    public IngredientType ingredientType;
    @Parameterized.Parameter(1)
    public IngredientType ingredientTypeValueOf;


    @Parameterized.Parameters(name = "{index} - ingredientType {0}, ingredientTypeValueOf {1}")
    public static Object[][] data() {
        return new Object[][]{
                {IngredientType.SAUCE, IngredientType.valueOf("SAUCE")},
                {IngredientType.FILLING, IngredientType.valueOf("FILLING")}
        };
    }

    // this test ensures, that if enum is deleted (even not used in the test one) - code will not even compile and we will be informed about problems
    // enum itself are tested when they are used in the tests
    @Test
    public void ingredientTypeEnumValueShowsOk() {
        assertEquals(ingredientType, ingredientTypeValueOf);
    }


}