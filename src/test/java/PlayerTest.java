
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class PlayerTest {

    private Board board = new Board();
    private Dice[] dices = {new Dice(), new Dice()};
    private Cup cup = new Cup(dices);

    @Test
    void getPlayerName(){
        Player player = new Player("Nico le poireau", board, cup);
        assertEquals(player.getName(), "Nico le poireau");
    }

    @Test
    void getPlayerPieceAndSetPlayerPiece(){
        Piece piece = new Piece("chaussure", new Square(0, "JE_SUIS_UN_SQUARE"));
        Player player = new Player("Nico le poireau", board, cup);
        player.setPiece(piece);
        assertEquals(player.getPiece(), piece);
    }

    @Test
    void testTakeTurn(){
        Piece piece = new Piece("chaussure", board.getSquare(0));
        Player player = new Player("Nico le poireau", board, cup);
        player.setPiece(piece);

        Square actualSquare = player.getPiece().getLocation();
        player.takeTurn();
        Square newSquare = player.getPiece().getLocation();

        assertNotEquals(actualSquare,newSquare);
    }



}
