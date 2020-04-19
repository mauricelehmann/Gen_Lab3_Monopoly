import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CupTest {

    private final Dice[] dices = {new Dice(), new Dice()};

    @RepeatedTest(10)
    public void testTotalValueIsInRightRange() {
        Cup cup = new Cup(dices);
        cup.roll();
        assertTrue(cup.getTotal() >= 2 && cup.getTotal() <= 12);
    }
}