import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Tests {
    @Test
    void firstTest(){
        assertEquals(true,true);
    }

    @Test
    void getSquareName(){
        Square square = new Square("square1");
        assertEquals(square.getName(), "square1");
    }
}
