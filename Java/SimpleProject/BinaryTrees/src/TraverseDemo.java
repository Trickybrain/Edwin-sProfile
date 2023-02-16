

//  Main class to test tree traversals

public class TraverseDemo
{

   public static void main (String [] args)
   {
	   
	   BinaryTree tree = new BinaryTree(); 
	   tree.root = new BinaryNode(1); 
	   tree.root.leftChild = new BinaryNode(2); 
	   tree.root.rightChild = new BinaryNode(3); 
	   tree.root.leftChild.leftChild = new BinaryNode(4);
	   tree.root.leftChild.rightChild = new BinaryNode(5); 
       System.out.println("Preorder traversal of binary tree is "); 
       tree.Preorder(); 
 
       System.out.println("\nInorder traversal of binary tree is "); 
       tree.Inorder(); 
 
       System.out.println("\nPostorder traversal of binary tree is "); 
       tree.Postorder(); 
	   

   }
   

}
