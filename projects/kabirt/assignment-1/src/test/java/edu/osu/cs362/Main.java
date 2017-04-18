import org.junit.Test;
import static org.junit.Assert.*;

public class Main{
    @Test
    public void test1(){
        Stack newStack = new Stack(15);
        newStack.push(10);
        assertEquals(newStack.peek(), 10);
        long value = newStack.pop();
        assertEquals(value, 10);
    }
    @Test
    public void test2(){
        Stack newStack = new Stack(5);
        newStack.push(10);
        assertEquals(newStack.isEmpty(), false);    //should return false because of bug
        newStack.push(12);
        assertEquals(newStack.isEmpty(), false);    //should return true, overrides bug
        newStack.push(14);
        newStack.push(16);
        newStack.push(18);
        assertEquals(newStack.isFull(), true);      //should return false because of bug
    }
    @Test
    public void test3(){
        int mySize = 5;
        Stack newStack = new Stack(mySize);
        newStack.push(6);
        newStack.push(8);
        assertEquals(newStack.size, mySize);
    }

}