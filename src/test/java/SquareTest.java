import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SquareTest {

    @Test
    void getSquareName(){
        Square square = new Square(0,"square");
        assertEquals(square.getName(), "square");
    }
}