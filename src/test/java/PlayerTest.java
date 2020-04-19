
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
        Piece piece = new Piece("chaussure", new RegularSquare(0, "JE_SUIS_UN_SQUARE"));
        Player player = new Player("Nico le poireau", board, dices);
        player.setPiece(piece);
        assertEquals(player.getPiece(), piece);
    }

    @Test
    void getInitialNetWorthTest(){
        Player p = new Player("Maurice", board, dices);

        assertEquals(Player.INITIAL_NETWORTH, p.getNetWorth());
    }

    @Test
    void addCashTest() throws Exception {
        Player p = new Player("Maurice", board, dices);
        p.addCash(1000);

        assertEquals(Player.INITIAL_NETWORTH + 1000, p.getNetWorth());
    }



}
