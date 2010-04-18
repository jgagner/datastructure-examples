package com.jeromegagner.example.trees.binary;

/**
 * Created by IntelliJ IDEA.
 * User: jgagner
 * Date: Apr 18, 2010
 * Time: 1:30:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class BinaryTree {
    Node root;

    public Node findNode(int value){
        return null;
    }


    public BinaryTree(Node root){
        this.root = root;
    }

    /**
     * Utility for creating a binary tree with an array of numbers.
     * @param members members[0] will be the root node. 
     * @return
     */
    public static BinaryTree createTree(int[] members){
        Node root = new Node(null,null,members[0]);
        for(int i = 1; i < members.length; i++){
            insertNode(root, members[i]);
        }
        return new BinaryTree(root);
    }

    /**
     * @param root
     * @param value
     * @return
     */
    public static void insertNode(Node root, int value){
       if(root.getValue() >= value){
          if(root.getLeft() == null){
              root.setLeft(new Node(null,null,value));
          }else{
              insertNode(root.getLeft(),value);
          }
       }else{
          if(root.getRight() == null){
              root.setRight(new Node(null,null,value));
          }else{
              insertNode(root.getRight(),value);
          }
       }
    }
}
