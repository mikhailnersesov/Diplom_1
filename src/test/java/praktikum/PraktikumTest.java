package praktikum;

import org.junit.Test;
import org.mockito.Mock;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class PraktikumTest {
@Mock
Database database;
@Mock
Burger burger;
@Mock
List<Bun> buns;
    @Test
    public void main() {
        //List<Bun> buns = database.availableBuns();
        when(database.availableBuns()).thenReturn(buns);
        //verify(buns).database.availableBuns();
        assertEquals(buns,database.availableBuns());

    }
}