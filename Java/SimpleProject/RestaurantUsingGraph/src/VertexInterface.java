/**
   An interface for a vertex in a graph.
   
   @author Frank M. Carrano
   @author Timothy M. Henry
   @version 4.0
*/
public interface VertexInterface<T>
{
   /** Gets this vertex's label.
       @return  The object that labels the vertex. */
   public T getLabel();

   /** Marks this vertex as visited. */
   public void visit();

   /** Removes this vertex's visited mark. */
   public void unvisit();

   /** Sees whether the vertex is marked as visited.
       @return  True if the vertex is visited. */
   public boolean isVisited();

   public boolean hasNeighbor();

   /** Gets an unvisited neighbor, if any, of this vertex.
       @return  Either a vertex that is an unvisited neighbor or null
                if no such neighbor exists. */
   public VertexInterface<T> getUnvisitedNeighbor();

   /** Records the previous vertex on a path to this vertex.
       @param predecessor  The vertex previous to this one along a path.
   */
   public void setPredecessor(VertexInterface<T> predecessor);

   /** Gets the recorded predecessor of this vertex.
       @return  Either this vertex's predecessor or null if no predecessor
                was recorded. */
   public VertexInterface<T> getPredecessor();

   /** Sees whether a predecessor was recorded for this vertex.
       @return  True if a predecessor was recorded. */
   public boolean hasPredecessor();

   /** Records the cost of a path to this vertex.
       @param newCost  The cost of the path */
   public void setCost(double newCost);

   /** Gets the recorded cost of the path to this vertex.
       @return  The cost of the path. */
   public double getCost();


   /** Adds 1 to the edgeCount.  */
   public void addEdge();


   /** Gets the number of edges incident on vertex.
       @return  The number of edges. */
   public int numEdges();


   /** Iterator to tell if the vertex has more edges
       @return True if there is another vertex  */
   public boolean hasEdge();


} // end VertexInterface
