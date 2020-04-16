import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BoardTest {

    private Board board = new Board();

    @Test
    void testGetSquare(){
        testGetSquareOutOfBound(-4);
        testGetSquareOutOfBound(40);
    }

    private void testGetSquareOutOfBound(int pos){
        Exception exception = assertThrows(IndexOutOfBoundsException.class, () -> {
            board.getSquare(pos);
        });

        String expectedMessage = "This square is out of the board";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.equals(expectedMessage));
    }

    // TODO : tester getSquare in bound ?

}
