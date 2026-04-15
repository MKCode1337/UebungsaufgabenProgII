package lektion16;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StackTest {
    StackImpl stack = new StackImpl();
    Object testA = new Object();
    Object testB = new Object();

    @Test
    public void testpush() {
        stack.push(testA);
        Assertions.assertEquals(testA, stack.get(0) );
        stack.push(testB);
        Assertions.assertEquals(testB, stack.get(1));
    }

    public void pop() {
        Object vergleich = stack.get(1);
        Assertions.assertEquals(vergleich, stack.pop());
        vergleich = stack.get(0);
        Assertions.assertEquals(vergleich, stack.pop());
    }
}
