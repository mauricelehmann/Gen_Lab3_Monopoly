package java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {

    @Test
    void getPlayerName(){
        Player player = new Player("Nico le poireau");
        assertEquals(player.getName(), "Nico le poireau");
    }

    @Test
    void getPlayerPieceAndSetPlayerPiece(){
        Piece piece = new Piece("chaussure", new Square(0));
        Player player = new Player("Nico le poireau");
        player.setPiece(piece);
        assertEquals(player.getPiece(), piece);
    }



}
