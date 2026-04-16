package lektion16;

import lektion16.Stack.StackImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

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

    @Test
    public void testpop() {
        StackImpl stack2 = new StackImpl();
        stack2.push(testA);
        stack2.push(testB);
        Object vergleich = stack2.get(1);
        Assertions.assertEquals(vergleich, stack2.pop());
        vergleich = stack2.get(0);
        Assertions.assertEquals(vergleich, stack2.pop());
    }

    @Test
    public void testEmpty() {
        StackImpl stack3 = new StackImpl();
        try{
            stack3.pop();
            fail("Runtime Exception erwartet");
        }
        catch(RuntimeException e){
            String errorMessage = e.getMessage();
            assertEquals("Der Stack ist leer.", errorMessage);
        }
    }
}
