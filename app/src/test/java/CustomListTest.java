import static org.junit.Assert.*;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {

    static CustomList list;

    @Before
    public void setup() {
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest() {
        City c = new City("Edmonton", "AB");
        int size = list.getCount();
        list.addCity(c);
        assertEquals(size+1, list.getCount());
    }

    @Test
    public void hasCityTest() {
        City c = new City("Edmonton", "AB");
        assertFalse(list.hasCity(c));
        list.addCity(c);
        assertTrue(list.hasCity(c));
    }

    @Test
    public void deleteCityTest() {
        City c = new City("Edmonton", "AB");
        assertEquals(0, list.getCount());
        list.addCity(c);
        assertEquals(1, list.getCount());
        list.deleteCity(c);
        assertEquals(0, list.getCount());
    }

}
