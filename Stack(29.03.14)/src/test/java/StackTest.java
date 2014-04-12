import org.junit.Test;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;

import javax.swing.*;

/**
 * Created by okashinR on 12/04/14.
 */
public class StackTest {
    Stack<Integer> stack;

    @Test
    public void testPush() throws Exception {
        stack = new Stack<Integer>();
        stack.push(100);
        Assert.assertEquals(stack.peek().intValue(), 100);
    }

    @Test
    public void testPop() throws Exception {
        stack = new Stack<Integer>();
        for(int i = 0;i < 5; i++)
            stack.push(i);
            stack.pop();
        Assert.assertEquals(stack.size(), 4);
        Assert.assertEquals(stack.pop().intValue(), 3);
    }

    @Test
    public void testPeek() throws Exception {
        stack = new Stack<Integer>(666);
        Assert.assertEquals(stack.peek().intValue(), 666);
    }

    @Test
    public void testSize() throws Exception {
        stack = new Stack<Integer>();
        for(int i = 0;i < 5; i++)
            stack.push(i);
        Assert.assertEquals(stack.size(), 5);
    }
}
