/**
 *	It contains the what each cell's type is 
 * @author Edwin
 *
 */

public class Cell 
{ 
	/**
	 * Variables 
	 */
    private int row, col; 
    private int cellType; 
  
    /**
     * Constructor, initialize each cell and giving its coordinate 
     * @param row Row for the cell
     * @param col Column for the cell
     */
    public Cell(int row, int col) 
    { 
        this.row = row; 
        this.col = col; 
    } 
  
    /**
     * it will pass back the cell type
     * @return the Cell's type, empty, Food, Snake body, or error
     */
    public String getCellType() 
    { 
    	if (cellType==0)
    		return "0"; 
    	if (cellType==1)
    		return "$";
    	if (cellType==2)
    		return "*";
    	return "Error";
    } 
    
    /**
     * it will pass back the food Cell type
     * @return food Cell type
     */
    public String getFoodCell()
    {
    	return "$";
    }
    
    /**
     * letting other class to change the cellType of the cell
     * @param cellType cell Type
     */
  
    public void setCellType(int cellType) 
    { 
        this.cellType = cellType; 
    } 
  
    /**
     * passing back the cell's row position
     * @return row
     */
    
    public int getRow() 
    { 
        return row; 
    } 
  
    /**
     * passing back the cell's column position
     * @return col
     */
    public int getCol() 
    { 
        return col; 
    } 
    
} 