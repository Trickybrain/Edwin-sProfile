//  package TreePackage;
import java.util.EmptyStackException;
import java.util.NoSuchElementException;
// import StackAndQueuePackage.*;

/**
   A class that implements the ADT binary tree.
   
   @author Frank M. Carrano
   @author Timothy M. Henry
   @version 4.0
*/
public class BinaryTree<T> implements BinaryTreeInterface<T>
{
   public BinaryNode<T> root;

   public BinaryTree()
   {
      root = null;
   } // end default constructor

   public BinaryTree(T rootData)
   {
      root = new BinaryNode<>(rootData);
   } // end constructor

   public BinaryTree(T rootData, BinaryTree<T> leftTree, 
                                 BinaryTree<T> rightTree)
   {
      privateSetTree(rootData, leftTree, rightTree);
   } // end constructor

   public void setTree(T rootData)
   {
      root = new BinaryNode<>(rootData);
   } // end setTree

   public void setTree(T rootData, BinaryTreeInterface<T> leftTree,
                                   BinaryTreeInterface<T> rightTree)
   {
      privateSetTree(rootData, (BinaryTree<T>)leftTree, 
                               (BinaryTree<T>)rightTree);
   } // end setTree

   private void privateSetTree(T rootData, BinaryTree<T> leftTree, 
                               BinaryTree<T> rightTree)
   {
      // < FIRST DRAFT - See Segments 24.4 - 24.7 for improvements. >
      root = new BinaryNode<T>(rootData);
      
      if (leftTree != null)
         root.setLeftChild(leftTree.root);
      
      if (rightTree != null)
         root.setRightChild(rightTree.root);
   } // end privateSetTree

/*  < Implementations of getRootData, getHeight, getNumberOfNodes, isEmpty, clear,
      and the methods specified in TreeIteratorInterface are here. >
   . . . */
   public T getRootData()
   {
//      if (isEmpty())
//         throw new EmptyTreeException();
//      else
           return root.getData();
   } // end getRootData
   
   public int getHeight()
   {
      return root.getHeight();
   } // end getHeight
   
   public int getNumberOfNodes()
   {
      return root.getNumberOfNodes();
   } // end getNumberOfNodes
   // Version 4.0
   
   public boolean isEmpty()
   {
      return root == null;
   } // end isEmpty
   
   public void clear()
   {
      root = null;
   } // end clear
   
   protected void setRootData(T rootData)
   {
      root.setData(rootData);
   } // end setRootData
   
   protected void setRootNode(BinaryNode<T> rootNode)
   {
      root = rootNode;
   } // end setRootNode
   
   protected BinaryNode<T> getRootNode()
   {
      return root;
   } // end getRootNode
   // Version 4.0

   //print in order
   private void Inorder(BinaryNode node) 
   { 
       if (node == null) 
           return; 

       // first recur on left subtree 
       Inorder(node.leftChild); 
       
       // now deal with the node 
       System.out.print(node.data + " "); 

       // then recur on right subtree 
       Inorder(node.rightChild); 
   }

   public void Inorder()  {     Inorder(root);  } 
   
   //print pre order
   private void Preorder(BinaryNode node) 
   { 
       if (node == null) 
           return; 

       // now deal with the node 
       System.out.print(node.data + " "); 
       
       // first recur on left subtree 
       Preorder(node.leftChild); 
       
       // then recur on right subtree 
       Preorder(node.rightChild); 
   }

   public void Preorder()  {     Preorder(root);  } 

   //print post order
   private void Postorder(BinaryNode node) 
   { 
       if (node == null) 
           return; 

       // first recur on left subtree 
       Postorder(node.leftChild); 

       // then recur on right subtree 
       Postorder(node.rightChild); 

       // now deal with the node 
       System.out.print(node.data + " "); 
   }

   public void Postorder()  {     Postorder(root);  } 

} // end BinaryTree
 
