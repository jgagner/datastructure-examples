package com.jeromegagner.example.trees.binary;

/**
 * Created by IntelliJ IDEA.
 * User: jgagner
 * Date: Apr 18, 2010
 * Time: 1:28:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class Node {
    private Node left;
    private Node right;
    private int value;

    public Node(Node left, Node right, int value) {
        this.left = left;
        this.right = right;
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public int getValue() {
        return value;
    }

    public void setLeft(Node left){
       this.left = left;
    }
    
    public void setRight(Node right){
        this.right = right;
    }
}
