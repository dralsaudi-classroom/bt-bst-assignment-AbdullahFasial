package com.example.project;

public class TreeUser {
    public static <T> int countLeafs(BT<T> bt, T e) {
    if (bt.empty()) {
        return 0;  
    }

   
    bt.find(Relative.Root);
    
  
    return recCountLeafs(bt);
}

private static <T> int recCountLeafs(BT<T> bt) {
    if (bt.isLeaf()) {
        return 1; 
    } else {
        int count = 0; 
        
        
        if (bt.find(Relative.LeftChild)) {
            count += recCountLeafs(bt);
            bt.find(Relative.Parent);  
        }
        
        
        if (bt.find(Relative.RightChild)) {
            count += recCountLeafs(bt);
            bt.find(Relative.Parent);  
        }
        
        return count;
    }
}

}
