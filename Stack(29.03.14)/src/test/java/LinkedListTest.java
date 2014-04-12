import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;

/**
 * Created by okashinR on 12/04/14.
 */
public class LinkedListTest {

    LinkedList<Integer> list;

    @Test
    public void testAdd() throws Exception {
     list = new LinkedList<Integer>();
        list.add(12);
        Assert.assertEquals(list.peek().intValue(), 12);
    }

    @Test
    public void testSize() throws Exception {
        list = new LinkedList<Integer>();
        for(int i = 0;i < 5; i++)
        list.add(i*i);
        Assert.assertEquals(list.size(), 5);
    }

    @Test
    public void testPeek() throws Exception {

        list = new LinkedList<Integer>();
        for(int i = 0;i < 5; i++)
            list.add(i);
        Assert.assertEquals(list.peek().intValue(), 4);
    }

    @Test
    public void testRemove() throws Exception {
        list = new LinkedList<Integer>();
        for(int i = 0;i < 5; i++)
            list.add(i*i);
        list.remove();
        Assert.assertEquals(list.size(), 4);
    }
}
