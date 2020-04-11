import main.Dice;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class DiceTest {

    @Test
    public void testFaceValueIsInRightRange(){
        Dice dice = new Dice();
        dice.roll();
        assertTrue(dice.getFaceValue() >= 1 && dice.getFaceValue() <= 6);
    }
}
