package simpleCode;

//Recursive Java program to print lca of two nodes

//A binary tree node
class Node 
{
 int data;
 Node left, right;

 Node(int item) 
 {
     data = item;
     left = right = null;
 }
}

class CommonAncestor 
{
 static Node root;

 Node lca(Node node, int n1, int n2) 
 {
	if(node==null){
		return null;
	}
	if(node.data == n1 || node.data == n2){
		return node;
	}
	
	Node left = lca(node.left,n1,n2);
	Node right = lca(node.right,n1,n2); 
	
	if(left!=null && right!=null){
		return node;
	}
	
	if(left==null && right!=null){
		return right;
	}
	
	if(left!=null && right==null){
		return left;
	}
	
	return null;

 }

 /* Driver program to test lca() */
 public static void main(String args[]) 
 {
     CommonAncestor tree = new CommonAncestor();
     tree.root = new Node(1);
     tree.root.left = new Node(2);
     tree.root.right = new Node(3);
     tree.root.left.left = new Node(4);
     tree.root.left.right = new Node(5);
     tree.root.right.left = new Node(6);
     tree.root.right.right = new Node(7);

     System.out.println("LCA(4, 1): " + tree.lca(root,4,1).data);
 }
}