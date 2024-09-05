import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class DiceScoreTest {
    private Ide de = Mockito.mock(Ide.class);


    @Test
    public void testDiceScoreWhenDiceIsSameThenResultScoreByTwoMoreTen(){

        Mockito.when(de.getRoll()).thenReturn(3,3);

        int diceScore =DiceScore.getScore();

        Assertions.assertEquals(diceScore,16);

    }
}
