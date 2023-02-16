/**
 A class of vertices for a graph.
 
 @author Frank M. Carrano
 @author Timothy M. Henry
 @version 4.0
 */

class Vertex<T> implements VertexInterface<T>
{
   final int maxEdges = 20;
   private T label;
   private boolean visited;                          // True if visited
   private VertexInterface<T> previousVertex;        // On path to this vertex
   private double cost;                              // Of path to this vertex
   private int edgeCount, currentEdge;
   private Vertex<T> [] edgeList;
 
   public Vertex(T vertexLabel)
   {
      label = vertexLabel;
      visited = false;
      previousVertex = null;
      cost = 0;
      edgeCount = 0;
      @SuppressWarnings("unchecked")
      Vertex<T> [] tempEdgeList = (Vertex<T> []) new Vertex [maxEdges];
      edgeList = tempEdgeList;
   } // end constructor

/* < Implementations of the vertex operations go here. >
   . . . */

   /** Gets this vertex's label.
       @return  The object that labels the vertex. */
   public T getLabel()
   {
      return label;
   }

   /** Marks this vertex as visited. */
   public void visit()
   {
      visited = true;
   }

   /** Removes this vertex's visited mark. */
   public void unvisit()
   {
      visited = false;
   }

   /** Sees whether the vertex is marked as visited.
       @return  True if the vertex is visited. */
   public boolean isVisited()
   {
      return visited;
   }

     /** Connects this vertex and a given vertex with a weighted edge.
         The two vertices cannot be the same, and must not already
         have this edge between them. In a directed graph, the edge 
         points toward the given vertex.
         @param endVertex   A vertex in the graph that ends the edge.
         @param edgeWeight  A real-valued edge weight, if any.
         @return  True if the edge is added, or false if not. */
     public boolean connect(Vertex<T> endVertex, double edgeWeight)
     {
        boolean result = false;
  
        if (!this.equals(endVertex))  //  Avoids loops
        {
          // Check if vertices are distinct (not implemented)
           edgeList[edgeCount] = endVertex;
           result = true;
           ++edgeCount;
        } // end if
  
        return result;
     }
                           
     /** Connects this vertex and a given vertex with an unweighted 
         edge. The two vertices cannot be the same, and must not 
         already have this edge between them. In a directed graph, 
         the edge points toward the given vertex.
         @param endVertex   A vertex in the graph that ends the edge.
         @return  True if the edge is added, or false if not. */
     public boolean connect(Vertex<T> endVertex)
     {
        return connect(endVertex, 0);
     }


   /** Sees whether this vertex has at least one neighbor.
       @return  True if the vertex has a neighbor. */
   public boolean hasNeighbor()
   {
      return (previousVertex == null);
   }

   /** Gets an unvisited neighbor, if any, of this vertex.
       @return  Either a vertex that is an unvisited neighbor or null
                if no such neighbor exists. */
   public VertexInterface<T> getUnvisitedNeighbor()
   {
      return previousVertex;
   }

   /** Records the previous vertex on a path to this vertex.
       @param predecessor  The vertex previous to this one along a path.
   */
   public void setPredecessor(VertexInterface<T> predecessor)
   {
      previousVertex = predecessor;
   }

   /** Gets the recorded predecessor of this vertex.
       @return  Either this vertex's predecessor or null if no predecessor
                was recorded. */
   public VertexInterface<T> getPredecessor()
   {
       return previousVertex;
   }

   /** Sees whether a predecessor was recorded for this vertex.
       @return  True if a predecessor was recorded. */
   public boolean hasPredecessor()
   {
       return previousVertex == null;
   }

   /** Records the cost of a path to this vertex.
       @param newCost  The cost of the path */
   public void setCost(double newCost)
   {
       cost = newCost;
   }

   /** Gets the recorded cost of the path to this vertex.
       @return  The cost of the path. */
   public double getCost()
   {
       return cost;
   }

   /** Adds 1 to the edgeCount.  */
   public void addEdge()
   {
       ++edgeCount;
   }

   /** Gets the number of edges incident on vertex.
       @return  The number of edges. */
   public int numEdges()
   {
       return edgeCount;
   }

   /** Iterator to tell if the vertex has more edges
       @return True if there is another vertex  */
   public boolean hasEdge()
   {
       boolean result = false;
       if (currentEdge < edgeCount)
           result = true;
       else
       {
           currentEdge = 0;
           result = false;
       }
       return result;           
   }
   
   
   public T nextEdge()
   {
       return edgeList [currentEdge++].getLabel();
   }


   /**  Lists edges incident to this vertex.
   */
   public void listEdges()
   {
      for (int i=0; i<edgeCount; ++i)
      {
         System.out.println ((String) this.getLabel() + "-" + (String) edgeList[i].getLabel());
      }
   }
  
} // end Vertex
