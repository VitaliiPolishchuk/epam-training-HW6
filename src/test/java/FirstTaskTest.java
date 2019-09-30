import javafx.util.Pair;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class FirstTaskTest {

    @Test
    public void shouldReturnNullWhenInputIsNull() {
        assertEquals(null, FirstTask.count(null));
    }

    @Test
    public void shouldReturnEmptySetWhenInputIsEmpty() {
        assertEquals(new HashSet<>(), FirstTask.count(new ArrayList<>()));
    }

    @Test
    public void shouldBeEqualsWhenInputWithValue() {

        Set<Map.Entry<Integer, Integer>> expected = FirstTask.count(Arrays.asList(4,5,-6,4,5,3,4,2,4,5,7));

        Set<Map.Entry<Integer, Integer>> actual = new HashSet<>(Arrays.asList(
                new AbstractMap.SimpleEntry<>(-6, 1),
                new AbstractMap.SimpleEntry<>(2, 1),
                new AbstractMap.SimpleEntry<>(3, 1),
                new AbstractMap.SimpleEntry<>(4, 4),
                new AbstractMap.SimpleEntry<>(5, 3),
                new AbstractMap.SimpleEntry<>(7, 1)));

        assertEquals(actual, expected);
    }
}