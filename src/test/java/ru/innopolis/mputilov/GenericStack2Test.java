package ru.innopolis.mputilov;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mputilov on 02/10/16.
 */
public class GenericStack2Test {
    private GenericStack2<Integer> stack;

    @Test
    public void simpleTest() throws Exception {
        GenericStack2<Integer> stack = new GenericStack2<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        assertEquals(new Integer(4), stack.pop());
        assertEquals(new Integer(3), stack.pop());
        assertEquals(new Integer(2), stack.pop());
        assertEquals(new Integer(1), stack.pop());
    }

    @Test(expected = IllegalStateException.class)
    public void throwExceptionIfUnderflow() throws Exception {
        stack = new GenericStack2<>();
        stack.pop();
    }
}