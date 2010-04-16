package com.jeromegagner.example.linkedlist;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by IntelliJ IDEA.
 * User: jgagner
 * Date: Apr 15, 2010
 * Time: 7:11:25 PM
 * To change this template use File | Settings | File Templates.
 */

public class LinkedListOperationsTests {

    @Test
    public void findTest() {
       ListItem head = LinkedListOperations.createList(10);
       assertEquals(LinkedListOperations.find(head,5).data,5);
    }

    @Test
    public void findTestWithNonExistentElement()
    {
       ListItem head = LinkedListOperations.createList(10);
       assertNull(LinkedListOperations.find(head,11));
    }

    @Test
    public void sizeTest(){
        ListItem head = LinkedListOperations.createList(100);
        assertEquals(100,head.length());
    }
}
