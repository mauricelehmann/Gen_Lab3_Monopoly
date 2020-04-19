import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;


public class SquareTest {

    @Test
    void getSquareName(){
        Square square = new Square(0,"square");
        assertEquals(square.getName(), "square");
    }

    @Test
    void getSquareId(){
        Square square = new Square(0,"square");
        assertSame(square.getId(), 0);
    }
}