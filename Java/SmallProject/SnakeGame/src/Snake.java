import java.util.LinkedList; 

/**
 * This snake class contain the movement of the snake, like when the snake move forward it will create a new head and erase its tail, and it also check if its head crash into its tail
 * @author Edwin
 *
 */
public class Snake { 
  
	/**
	 * Cell class type LinkedList
	 * @see Cell
	 */
    private LinkedList<Cell> snakePartList = new LinkedList<>(); 
    /**
     * Cell class variable
     * @see Cell
     */
    private Cell head; 
    
    /**
     * Constructor
     * 
     * @param first initialize the snake and location of where the snake will begin to move.
     * @see Cell
     */
    public Snake(Cell first) 
    { 
        head = first; 
        snakePartList.add(head);
    } 
  
    /**
     * making the snake grow
     */
    public void grow() 
    { 
        snakePartList.addFirst(head); 
        head.setCellType(2);
    } 
  
    
    /**
     * It keep track of the snake's movement, when the snake move forward, it will add a new head and erase the tail and whenever the snake eats the food it will grow
     * 
     * @param nextCell the spot where the snake will be
     * @return tells the main program whether the snake grew or not
     * @see Cell
     */
    
    public boolean move(Cell nextCell) 
    { 
    	boolean counter =false;
        System.out.println("Snake is at " + (nextCell.getRow()+1) + " " + (nextCell.getCol()+1)); 
        if (nextCell.getCellType()==nextCell.getFoodCell())
        {
        	grow();
        	counter=true;
        }
        snakePartList.addFirst(head); 
        Cell tail = snakePartList.removeLast(); 
        tail.setCellType(0); 
        head = nextCell; 
        head.setCellType(2);
        
        return counter;
    } 
    
    /**
     * 
     * @param nextCell
     * @return whether it the snake crash or not
     */
  
    public boolean checkCrash(Cell nextCell) 
    { 
        
        for (Cell cell : snakePartList) 
        { 
            if (cell == nextCell) 
            { 
            	for(int i=0;i<=5;i++)
            		System.out.println("Crashed");
            	
                return true; 
                
            } 
        } 
        
        return false; 
    } 
    
  /**
   * 	Passing the location of the head of the snake
   * @return the location of the head of the snake
   */
    public Cell getHead() 
    { 
        return head; 
    } 
  

} 