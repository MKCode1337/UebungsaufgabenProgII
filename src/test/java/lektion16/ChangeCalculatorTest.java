package lektion16;

import lektion16.Muenzautomat.BetterChangeCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChangeCalculatorTest {
    int[] testbetrag1 = {1,1,1,1,1,1,1,1};// 3,88€
    int[] testbetrag2 = {1,0,1,0,1,0,1,0}; // 1,26€
    int[] testbetrag3 = {1,0,1,0,1,1,0,18}; // 36,76€
    int[] testbetrag4 = {0,0,0,0,0,0,0,0}; // 0,00€;
    BetterChangeCalculator bc = new BetterChangeCalculator();

    @Test
    public void testChangeCalculator1() {
        Assertions.assertArrayEquals(testbetrag1, bc.getChange(3,88));
    }
    @Test
    public void testChangeCalculator2() {
        Assertions.assertArrayEquals(testbetrag2, bc.getChange(1,26));
    }
    @Test
    public void testChangeCalculator3() {
        Assertions.assertArrayEquals(testbetrag3, bc.getChange(36,76));
    }
    @Test
    public void testChangeCalculator4() {
        Assertions.assertArrayEquals(testbetrag4, bc.getChange(0,0));
    }
}