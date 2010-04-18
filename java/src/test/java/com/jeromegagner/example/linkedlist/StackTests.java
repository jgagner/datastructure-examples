package com.jeromegagner.example.linkedlist;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by IntelliJ IDEA.
 * User: jgagner
 * Date: Apr 18, 2010
 * Time: 9:59:57 AM
 * To change this template use File | Settings | File Templates.
 */
public class StackTests {

    @Test
    public void testPush(){
        Element head = new Element(0);
        Stack stack = new Stack(head);
        Element second = new Element(1);
        stack.push(second);
        assertEquals(head,second.next);
        assertEquals(second,stack.head);
    }

    @Test
    public void testPop(){
        Element head = new Element(0);
        Stack stack = new Stack(head);
        Element second = new Element(1);
        stack.push(second);
        assertEquals(second,stack.pop());
    }
}
