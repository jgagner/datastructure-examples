package com.jeromegagner.example.linkedlist;

/**
 * Created by IntelliJ IDEA.
 * User: jgagner
 * Date: Apr 18, 2010
 * Time: 9:49:28 AM
 * To change this template use File | Settings | File Templates.
 */
public class LinkedList {
    Element head;

    public LinkedList(Element head) {
        this.head = head;
    }

    public Element find( Object data) {
        Element head = this.head;
        while (head != null && head.data != data) {
            head = head.next;
        }
        return head;
    }


    /**
     * utility for creating linked list of a certain size *
     */
    public static LinkedList createList(int numberOfItems) {
        Element head = new Element(0);
        Element previous = head;
        for (int i = 1; i < numberOfItems; i++) {
            Element item = new Element(i);
            previous.next = item;
            previous = item;
        }
        return new LinkedList(head);
    }

    public int length() {
        int i = 0;
        Element head = this.head;
        while (head != null) {
            head = head.next;
            i++;
        }
        return i;
    }
}
