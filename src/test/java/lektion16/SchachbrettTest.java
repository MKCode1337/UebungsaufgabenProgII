package lektion16;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SchachbrettTest {
    TurmImpl turm = new TurmImpl(3, 4);
    LaeuferImpl laeufer = new LaeuferImpl(3, 4);
    Dame dame = new Dame(3, 4);

    @Test
    public void testkombiniertesBrett(){
        Brett kombiniertesBrett = dame.gibErlaubteFelder();
        Brett turmBrett = turm.gibErlaubteFelder();
        Brett laeuferBrett = laeufer.gibErlaubteFelder();
        for (int j = 1; j <= 8; j++)
        {
            for (int i = 1; i <= 8; i++)
            {
                if (turmBrett.gibFeld(j, i) || laeuferBrett.gibFeld(j, i)){
                    Assertions.assertTrue(kombiniertesBrett.gibFeld(j, i));
                }
            }
        }
    }
}