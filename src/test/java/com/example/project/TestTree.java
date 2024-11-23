package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestTree {
   @Test
   public void testCountLeaves1()
   {
      BT<Integer> t = new BT<Integer>();
      assertEquals(0, t.countLeaves());
      assertEquals(0, TreeUser.countLeaves(t));
   }
   @Test
   public void testCountLeaves2()
   {
      BT<Integer> t = new BT<Integer>();
      t.insert(Relative.Root, 1);
      assertEquals(1, t.countLeaves());
      assertEquals(1, TreeUser.countLeaves(t));
   }
   @Test
   public void testCountLeaves3()
   {
      BT<Integer> t = new BT<Integer>();
      t.insert(Relative.Root, 1);
      t.insert(Relative.LeftChild, 2);
      assertEquals(1, t.countLeaves());
      assertEquals(1, TreeUser.countLeaves(t));
   }
   @Test
   public void testCountLeaves4()
   {
      BT<Integer> t = new BT<Integer>();
      t.insert(Relative.Root, 1);
      t.insert(Relative.LeftChild, 2);
      t.find(Relative.Root);
      t.insert(Relative.RightChild, 3);
      assertEquals(2, t.countLeaves());
      assertEquals(2, TreeUser.countLeaves(t));
   }
   @Test
   public void testCountLeaves5()
   {
      BT<Integer> t = new BT<Integer>();
      t.insert(Relative.Root, 1);
      t.insert(Relative.LeftChild, 2);
      t.insert(Relative.RightChild, 3);
      t.insert(Relative.LeftChild, 4);
      t.insert(Relative.RightChild, 5);
      assertEquals(1, t.countLeaves());
      assertEquals(1, TreeUser.countLeaves(t));
   }
   @Test
   public void testCountLeaves6()
   {
      BT<Integer> t = new BT<Integer>();
      t.insert(Relative.Root, 1);
      t.insert(Relative.RightChild, 2);
      t.insert(Relative.LeftChild, 3);
      t.insert(Relative.LeftChild, 4);
      t.insert(Relative.LeftChild, 5);
      assertEquals(1, t.countLeaves());
      assertEquals(1, TreeUser.countLeaves(t));
      t.find(Relative.Root);
      t.find(Relative.RightChild);
      t.find(Relative.LeftChild);
      t.find(Relative.LeftChild);
      assertEquals(t.retrieve(), 4);
      t.insert(Relative.RightChild, 10);
      assertEquals(2, t.countLeaves());
      assertEquals(2, TreeUser.countLeaves(t));
   }
   @Test
   public void testCountLeaves7()
   {
      BT<Integer> t = new BT<Integer>();
      t.insert(Relative.Root, 1);
      t.insert(Relative.LeftChild, 2);
      t.find(Relative.Parent);
      t.insert(Relative.RightChild, 3);
      t.insert(Relative.RightChild, 4);
      t.find(Relative.Parent);
      t.insert(Relative.LeftChild, 5);
      t.find(Relative.Root);
      t.find(Relative.LeftChild);
      t.insert(Relative.RightChild, 6);
      t.find(Relative.Parent);
      t.insert(Relative.LeftChild, 7);
      assertEquals(4, t.countLeaves());
      assertEquals(4, TreeUser.countLeaves(t));
   }
   @Test
   public void testCountNodesIn1() {
      BST<Integer> t = new BST<Integer>();
      assertEquals(0, t.countNodesIn(0));
   }
   @Test
   public void testCountNodesIn2() {
      BST<Integer> t = new BST<Integer>();
      t.insert(1, 1);
      assertEquals(0, t.countNodesIn(0));
   }
   @Test
   public void testCountNodesIn3() {
      BST<Character> t = new BST<Character>();
      t.insert(20, 'A');
      t.insert(10, 'B');
      t.insert(5, 'C');
      t.insert(3, 'D');
      t.insert(1, 'E');
      t.insert(2, 'F');
      t.insert(8, 'G');
      t.insert(9, 'H');
      t.insert(6, 'I');
      t.insert(7, 'J');
      t.insert(30, 'K');
      t.insert(21, 'L');
      t.insert(26, 'M');
      t.insert(23, 'N');
      t.insert(22, 'O');
      t.insert(24, 'P');
      t.insert(38, 'Q');
      t.insert(37, 'R');
      t.insert(34, 'S');
      t.insert(31, 'T');
      t.insert(35, 'U');
      t.insert(44, 'V');
      assertEquals(22, t.countNodesIn(20));
      assertEquals(5, t.countNodesIn(21));
      assertEquals(1, t.countNodesIn(24));
      assertEquals(8, t.countNodesIn(5));
      assertEquals(0, t.countNodesIn(0));
      assertEquals(0, t.countNodesIn(240));
      assertEquals(3, t.countNodesIn(34));
      assertEquals(0, t.countNodesIn(4));
   } //1
}
