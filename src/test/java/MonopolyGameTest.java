import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MonopolyGameTest {


    @BeforeAll
    static void constructorTest(){
        MonopolyGame game = new MonopolyGame(5);
        assertNotNull(game.getBoard());
        assertNotNull(game.getDices());
        assertNotNull(game.getPlayers());
    }

    @Test
    void numberOfPlayerInArray(){
        int numberOfPlayer = 5;
        MonopolyGame game = new MonopolyGame(numberOfPlayer);
        assertSame(game.getPlayers().length,numberOfPlayer);
    }





}
