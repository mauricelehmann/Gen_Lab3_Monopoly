
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {

    private Board board = new Board();
    private Dice[] dices = {new Dice(), new Dice()};

    @Test
    void getPlayerName(){
        Player player = new Player("Nico le poireau", board, dices);
        assertEquals(player.getName(), "Nico le poireau");
    }

    @Test
    void getPlayerPieceAndSetPlayerPiece(){
        Piece piece = new Piece("chaussure", new Square(0, "JE_SUIS_UN_SQUARE"));
        Player player = new Player("Nico le poireau", board, dices);
        player.setPiece(piece);
        assertEquals(player.getPiece(), piece);
    }



}
