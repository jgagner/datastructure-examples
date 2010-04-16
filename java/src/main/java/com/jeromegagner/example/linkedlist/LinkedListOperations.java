package com.jeromegagner.example.linkedlist;

/**
 * Created by IntelliJ IDEA.
 * User: jgagner
 * Date: Apr 15, 2010
 * Generic holder for methods acting upon linked lists
 */
public class LinkedListOperations {


    /**
     * Locates a specified element. This is O(n). Returns null if element not found
     * @param head
     * @param data
     * @return
     */
    public static ListItem find(ListItem head, Object data){
        while(head != null && head.data != data){
            head = head.next;
        }
        return head;
    }

    /**
     * Utility for creating a list w/ numberOfItems elements
     * @param numberOfItems
     * @return head element
     */
    public static ListItem createList(int numberOfItems){
        ListItem head = new ListItem(0);
        ListItem previous = head;
        for (int i = 1; i < 10; i++) {
            ListItem item = new ListItem(i,head);
            previous.next = item;
            previous = item;
        }
        return head;
    }
}
