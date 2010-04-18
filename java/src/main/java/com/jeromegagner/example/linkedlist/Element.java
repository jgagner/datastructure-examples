package com.jeromegagner.example.linkedlist;

/**
 * Created by IntelliJ IDEA.
 * User: jgagner
 * Date: Apr 15, 2010
 * Time: 7:05:10 PM
 *  This class represents a Element
 */
public class Element {
    Object data;
    Element next;

    /**
     * Creates a list item assuming that itself is the head. 
     * @param data
     */
    public Element(Object data){
       this.data = data;
    }

}
