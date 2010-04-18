package com.jeromegagner.example.trees.binary;
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;
         
/**
 * Created by IntelliJ IDEA.
 * User: jgagner
 * Date: Apr 18, 2010
 * Time: 1:31:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class BinaryTreeTest {

    BinaryTree testTree;

    @Before
    public void setUp()
    {
        testTree = BinaryTree.createTree(new int[]{50,75,39,14,76});
    }

    @Test
    public void findNode(){
       Node nodeToFind = testTree.root.getRight().getRight(); //76
       assertEquals(nodeToFind,testTree.findNode(76));
    }

    @Test
    public void testFindNodeNodeUnfound(){
        assertNull(testTree.findNode(42));
    }

    @Test
    public void testCreateTree(){
        BinaryTree tree = BinaryTree.createTree(new int[]{50,75,39,14,76});
        assertNotNull(tree.root);
        assertEquals(50,tree.root.getValue());


        /*Produced tree should look like
        *                  50
        *          39             75
        *       14  null     null    76
        *
        */

        //walk the tree a bit and test values. ghetto but oh well, need to make sure this method works...
        //Lets do the left first
        Node left = tree.root.getLeft();
        assertEquals(39,left.getValue());
        assertNull(left.getRight());
        assertEquals(14,left.getLeft().getValue());
        assertNull(left.getLeft().getLeft());
        assertNull(left.getLeft().getRight());

        //now lets do the right side
        Node right = tree.root.getRight();
        assertEquals(75,right.getValue());
        assertEquals(null,right.getLeft());
        assertEquals(76,right.getRight().getValue());
        assertNull(right.getRight().getRight());
        assertNull(right.getRight().getLeft());


    }

    
}
