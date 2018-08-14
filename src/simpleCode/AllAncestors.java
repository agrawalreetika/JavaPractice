package simpleCode;

//Java program to print ancestors of given Node2

class Node2 
{
 int data;
 Node2 left, right, nextRight;

 Node2(int item) 
 {
     data = item;
     left = right = nextRight = null;
 }
}

public class AllAncestors 
{
Node2 root;

 /* Driver program to test above functions */
 public static void main(String args[]) 
 {
	 AllAncestors tree = new AllAncestors();
      
     /* Construct the following binary tree
               1
             /   \
            2     3
           /  \
          4    5
         /
        7
     */
     tree.root = new Node2(1);
     tree.root.left = new Node2(2);
     tree.root.right = new Node2(3);
     tree.root.left.left = new Node2(4);
     tree.root.left.right = new Node2(5);
     tree.root.left.left.left = new Node2(7);

     tree.printAncestors(tree.root, 7);
 }

 /* If target is present in tree, then prints the ancestors
    and returns true, otherwise returns false. */
 int printAncestors(Node2 Node2, int target) 
 {
      if(Node2==null){
    	  return 0;
      }
      
      if(Node2.left.data == target || Node2.right.data == target){
    	  System.out.println(Node2.data);
    	  return 1;
      }
      
      if( printAncestors(Node2.left,target) == 1 || printAncestors(Node2.right,target) == 1){
    	  System.out.println(Node2.data);
    	  return 1;
      }
	return 0;
 }

}