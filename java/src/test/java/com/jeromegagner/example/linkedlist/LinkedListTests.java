package com.jeromegagner.example.linkedlist;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by IntelliJ IDEA.
 * User: jgagner
 * Date: Apr 18, 2010
 * Time: 9:54:16 AM
 * To change this template use File | Settings | File Templates.
 */
public class LinkedListTests {

     @Test
    public void findTest() {
       LinkedList list = LinkedList.createList(10);
       assertEquals(list.find(5).data,5);
    }

    @Test
    public void findTestWithNonExistentElement()
    {
       LinkedList list = LinkedList.createList(10);
       assertNull(list.find(11));
    }

    @Test
    public void sizeTest(){
        LinkedList list = LinkedList.createList(100);
        assertEquals(100,list.length());
    }


    @Test
    public void findTailTest(){
        LinkedList list = LinkedList.createList(100);
        assertEquals(99,list.findTail().data);

       //Test to make sure that tail is properly set on construction
       /** memory leak?? **/
       list = LinkedList.createList(50);
       assertEquals(49,list.tail.data);
    }
}
