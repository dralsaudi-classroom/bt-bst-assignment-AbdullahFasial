package com.example.project;

public class TreeUser {
    public static <T> int countLeaves(BT<T> bt) {
    // i had to look at the toturial for this one
	    if(bt.empty())
    	 return 0;
     
    	bt.find(Relative.Root);
     
     
    	 return helpCountLeaves( bt);
		// Write the method countLeafs that should return the number of leaf nodes in the tree. A leaf node is a node that has no children.
        // assume the following method exists in the ADT: isLeaf (boolean flag): requires: Binary tree is not empty.
        // input: None. results: if the current node of the binary tree is a leaf then flag is set to true otherwise it is set to false. output: flag.
        // you can't call countLeaves from BT.java
    }
    private static <T> int helpCountLeaves(BT<T> bt) {
    	if(bt.isLeaf())
       	 return 1;
        int count =0;
        if(bt.find(Relative.LeftChild)) {
       	 count += helpCountLeaves(bt);
       	 bt.find(Relative.Parent);
       	 }
        if(bt.find(Relative.RightChild)) {
       	 count += helpCountLeaves(bt);
       	 bt.find(Relative.Parent);
       	 }
        return count;
    }
    
}
