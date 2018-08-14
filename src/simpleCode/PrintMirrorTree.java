package simpleCode;

//Java program to convert binary tree into its mirror

/* Class containing left and right child of current
Node1 and key value*/
class Node1
{
 int data;
 Node1 left, right;

 public Node1(int item)
 {
     data = item;
     left = right = null;
 }
}

public class PrintMirrorTree {
	static Node1 root;
	
	void inOrder(Node1 Node1)
    {
        if (Node1 == null)
            return;
 
        inOrder(Node1.left);
        System.out.print(Node1.data + " ");
 
        inOrder(Node1.right);
    }
	
	Node1 mirror(Node1 Node1)
    {
        if (Node1 == null)
            return null;
 
        else{
        	Node1 temp = Node1.left;
        	Node1.left = Node1.right;
        	Node1.right = temp; 
        	mirror(Node1.left);
        	mirror(Node1.right);
        	return Node1;
        }
		
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintMirrorTree tree = new PrintMirrorTree();
        tree.root = new Node1(1);
        tree.root.left = new Node1(2);
        tree.root.right = new Node1(3);
        tree.root.left.left = new Node1(4);
        tree.root.left.right = new Node1(5);
        
        /* print in order traversal of the input tree */
        System.out.println("InOrder traversal of input tree is :");
        tree.inOrder(root);
        System.out.println("");
 
        /* convert tree to its mirror */
        tree.mirror(root);
 
        /* print inorder traversal of the minor tree */
        System.out.println("Inorder traversal of binary tree is : ");
        tree.inOrder(root);
	}

}
