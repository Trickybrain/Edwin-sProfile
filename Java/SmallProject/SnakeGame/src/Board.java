/**
 * It creates the board and generate random food position in the board
 * @author Edwin
 *
 */

public class Board { 
	  
	/**
	 * Variables 
	 */
     int rowNum, colNum; 
    /**
	 * Cell class type Double array 
	 * @see Cell 
	 */
    private Cell[][] cells; 
  
   /**
    * constructor, initializing the board, create cell for each position
    * @param rowNum
    * @param columnNum
    */
    public Board(int rowNum, int columnNum) 
    { 
        this.rowNum = rowNum; 
        this.colNum = columnNum; 
  
        cells = new Cell[this.rowNum][this.colNum]; 
        for (int row = 0; row < this.rowNum; row++) 
        { 
            for (int column = 0; column < this.colNum; column++) 
            { 
                cells[row][column] = new Cell(row, column); 
            } 
        } 
    } 
    
    /**
     * pass the board of the game
     * @return the board
     */
    public Cell[][] getCells() 
    { 
        return cells; 
    } 
  
    /**
     * generate food at random position
     */
  
    public void generateFood() 
    { 
        System.out.println("Generating food"); 
        int position = (int) Math.floor((Math.random()*81)); 
        // extract coordinates r  and c 
        int row = (position/rowNum); 
        int col = position%colNum; 
        cells[row][col].setCellType(1); 
        System.out.println("Food is generated at: " + (row+1) + " " + (col+1)); 
    }
    
    /**
     * Printing out the board 
     */
    
    public String toString()
    {
    	for (int row = 0; row < rowNum; row++) 
    	{ 
            for (int column = 0; column < colNum; column++) 
            { 
            	System.out.print(cells[row][column].getCellType());
            	System.out.print("| ");
            }
            
            System.out.println(); 
            System.out.print("-----------------------------"); 
            System.out.println(); 
    	}
    	System.out.println();
    	return "";
    }
} 
