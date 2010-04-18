package com.jeromegagner.example.linkedlist;

/**
 * Created by IntelliJ IDEA.
 * User: jgagner
 * Date: Apr 18, 2010
 * Time: 9:58:29 AM
 * To change this template use File | Settings | File Templates.
 */
public class Stack {

    Element head;
    
    public Stack(Element head){
      this.head = head;
    }

    public void push(Element elem){
        elem.next = head;
        head = elem;
    }
    
    public Element pop(){
      Element head = this.head;
      this.head = head.next;
      head.next = null;
       return head;
    }
}
