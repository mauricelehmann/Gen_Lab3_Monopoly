

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PieceTest {


    @Test
    void movePiece(){
        Piece piece = new Piece("Moris la malice", new Square(0));
        piece.movement(4);
        assertEquals(piece.getLocation().getId(), 4);
    }
    @Test
    void circularMove(){
        Piece piece = new Piece("Moris la malice", new Square(39));
        piece.movement(2);
        assertEquals(piece.getLocation().getId(), 1);
    }
}
