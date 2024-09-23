import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class PascalTriangleTest {

    @Test
    public void testGeneratePascalTriangle() {
        List<List<Integer>> result = PascalTriangle.generate(5);
        assertEquals(5, result.size());
        assertEquals(List.of(1), result.get(0));
        assertEquals(List.of(1, 1), result.get(1));
        assertEquals(List.of(1, 2, 1), result.get(2));
        assertEquals(List.of(1, 3, 3, 1), result.get(3));
        assertEquals(List.of(1, 4, 6, 4, 1), result.get(4));
    }
}