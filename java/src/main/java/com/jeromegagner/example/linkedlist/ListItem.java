package com.jeromegagner.example.linkedlist;

/**
 * Created by IntelliJ IDEA.
 * User: jgagner
 * Date: Apr 15, 2010
 * Time: 7:05:10 PM
 *  This class represents a ListItem
 */
public class ListItem {
    Object data;
    
    ListItem head;
    ListItem next;

    /**
     * Creates a list item assuming that itself is the head. 
     * @param data
     */
    public ListItem(Object data){
       this.data = data;
       this.head = this;
    }

    public ListItem(Object data, ListItem head){
        this.data = data;
        this.head = head;
    }

    /**
     * The length of the list
     * @return
     */
    public int length(){
      int i = 0;
      ListItem curHead = head;
      while(curHead != null){
         i++;
          curHead = curHead.next;
      }
        return i;
    }

}
