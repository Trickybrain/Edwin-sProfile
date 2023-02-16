/*
   A class that implements the ADT directed graph.
 
   @author Frank M. Carrano
   @author Timothy M. Henry
   @version 4.0
*/
public class UndirectedGraph<T> implements GraphInterface<T>
{
   final int maxVertices = 50;
   final int maxEdges = 100;
   private int vertexCount, currentVertex;
   private Vertex<T>[] vertices;
   private Vertex<T>[] edgeList;
   private T label;
   private int edgeCount, currentEdge;
   private int eVertexCount, eCurrentVertex, eEdgeCount;

   public UndirectedGraph()
   {
     @SuppressWarnings("unchecked")
      Vertex<T>[] tempVertices = (Vertex<T>[]) new Vertex [maxEdges];
      vertices = tempVertices;
      vertexCount = 0;
      currentVertex = 0;
      currentEdge = 0;
      eVertexCount = 0;
      eCurrentVertex = 0;
   } // end default constructor

/* < Implementations of the graph operations go here. >
   . . . */


   /**  Find a vertex based on its label.
   @param vertexLabel The label to search for
   @returns Index into vertices array, or -1 if not found
   */
  int getIndexOf (T vertexLabel)
  {
      int vertexPosn = 0;
      while (vertexPosn < vertexCount && !vertices[vertexPosn].getLabel().equals(vertexLabel))
         ++vertexPosn;
      if (vertexPosn == vertexCount)
         return -1;
      else
         return vertexPosn;
  }
    
   /** Adds a given vertex to this graph.
       @param vertexLabel  An object that labels the new vertex and is
                           distinct from the labels of current vertices.
       @return  True if the vertex is added, or false if not. */
   public boolean addVertex(T vertexLabel)
   {
      if (vertexCount < maxVertices)
      {
          Vertex<T> tempVertex = new Vertex<T> (vertexLabel);
          vertices [vertexCount] = tempVertex;
          ++vertexCount;
          return true;
      }
      else
          return false;
   }

   
   /** Adds a weighted edge between two given distinct vertices that 
       are currently in this graph. The desired edge must not already 
       be in the graph. In a directed graph, the edge points toward
       the second vertex given.
       @param begin  An object that labels the origin vertex of the edge.
       @param end    An object, distinct from begin, that labels the end
                     vertex of the edge.
       @param edgeWeight  The real value of the edge's weight.
       @return  True if the edge is added, or false if not. */
   public boolean addEdge(T begin, T end, double edgeWeight)
   {
       boolean result = false;
       Vertex<T> tempVertex1, tempVertex2;

          int i = getIndexOf (begin);
       if (i>-1)
       {
          int j = getIndexOf (end);
          if (j>-1)
          {
             vertices[i].connect (vertices[j]);
             vertices[j].connect (vertices[i]);
             result = true;
          }
       }
       return result;
   }

   
   /** Adds an unweighted edge between two given distinct vertices 
       that are currently in this graph. The desired edge must not
       already be in the graph. In a directed graph, the edge points 
       toward the second vertex given.
       @param begin  An object that labels the origin vertex of the edge.
       @param end    An object, distinct from begin, that labels the end
                     vertex of the edge.
       @return  True if the edge is added, or false if not. */
   public boolean addEdge(T begin, T end)
   {
       return addEdge(begin, end, 0);
   }

   
   /** Sees whether an edge exists between two given vertices.
       @param begin  An object that labels the origin vertex of the edge.
       @param end    An object that labels the end vertex of the edge.
       @return  True if an edge exists. */
   public boolean hasEdge(T begin, T end)
   {
       boolean result = false;
       int i = getIndexOf (begin);
       if (i>-1)
       {
          int j = getIndexOf (end);
          if (j>-1)
             result = true;
       }
       return result;
       
   }

   
   /** Sees whether this graph is empty.
       @return  True if the graph is empty. */
   public boolean isEmpty()
   {
       return vertexCount == 0;
   }

   
   /** Gets the number of vertices in this graph.
       @return  The number of vertices in the graph. */
   public int getNumberOfVertices()
   {
       return vertexCount;
   }

   
   /** Gets the number of edges in this graph.
      @return  The number of edges in the graph. */
   public int getNumberOfEdges()
   {
       return edgeCount;
   }

   
   /** Removes all vertices and edges from this graph.
      */
   public void clear()
   {
       vertexCount = 0;
       edgeCount = 0;
   }
   
   
   /** Iterate through vertices of graph.  
    */
   public boolean hasVertex()
   {
       boolean result = false;
       if (currentVertex < vertexCount)
           result = true;
       else
       {
           currentVertex = 0;
           result = false;
       }
       return result;           
   }
   
   
   public T nextVertex()
   {
       return vertices [currentVertex++].getLabel();
   }
   
   
   /** Iterate through edges of graph.  
    */
   public boolean hasEdge()
   {
       boolean result = false;

       if (eCurrentVertex < vertexCount 
          && eEdgeCount < vertices[eCurrentVertex].numEdges())
           result = true;
       else
       {
           eCurrentVertex = 0;
           result = false;
       }
       return result;
   }
   
   
   /**  Lists edges incident to this vertex.
   */
   public void listEdges()
   {
	   int i;
	   i=GraphDemo.item();
	   while (i == 5)
		  {
			  System.out.println("There is no such item, can you order from the menu ");
			  i = GraphDemo.item();
		  }
	   System.out.println ("Listing Suggestion for " + (String) vertices[i].getLabel());
	   Vertex<T> tempVertex = vertices [i];
	   tempVertex.listEdges();

   }

} // end UndirectedGraph
