/**
 * it sets the board and control the flow of the game and the movement of the snake
 * @author Edwin
 *
 */

public class Game 
{ 
	
    /**
	 * variables
	 * @see Snake
	 * @see Board
	 * 
	 */
    private Snake snake; 
    private Board board; 
    /**
     * Variables
     */
    private int  right=1 , left=2 ,up=3, down=4; 
    private int direction;
    private boolean gameOver;  
    
  
    /**
     * Constructor 
     * @param snake 
     * @param board
     * @see Snake
     * @see Board
     */
    public Game(Snake snake, Board board) 
    { 
        this.snake = snake; 
        this.setBoard(board); 
    } 
    
    /**
     * passing back the variable that sets the game to be over or not
     * @return gameOver
     */
    public boolean isGameOver() 
    { 
        return gameOver; 
    } 
    
    /**
     * passing back the variable that sets movement
     * @return right
     */
    public int getRight()
    {
    	return right;
    }
    
    /**
     * passing back the variable that sets movement
     * @return left
     */
    public int getLeft()
    {
    	return left;
    }
    
    /**
     * passing back the variable that sets movement
     * @return down
     */
    public int getDown()
    {
    	return down;
    }
    
    /**
     * passing back the variable that sets movement
     * @return up
     */
    public int getUp()
    {
    	return up;
    }
    
    /**
     *  changing the value of gameOver
     *  @param gameOver
     *  
     */
    public void setGameOver(boolean gameOver) 
    { 
        this.gameOver=gameOver; 
    } 
  
  
    /**
     * setting the direction
     * @param direction
     */
    public void setDirection(int direction) 
    { 
        this.direction = direction; 
    } 
  
    /**
     * it will update all the changes in the board
     * it will update the direction of the snake in the board
     * and if the snake ate the body then it will end the program
     * and if the snake ate the food then it will generate a new food
     * @see Cell 
     */
	public void update() 
    { 
    	
        System.out.println("Updating"); 
        if (!gameOver) 
        { 
            Cell nextCell = moving(snake.getHead()); 

            if (snake.checkCrash(nextCell)) 
            { 
                gameOver = true; 
            } 
            if(snake.move(nextCell)) 
            {
            	getBoard().generateFood();
            }
    
        } 
       
    } 
  
	/**
	 * it will process the direction where the snake is moving
	 * @param currentPosition it will get the currentPosition of the snake, Row and Column
	 * @return pass the cell/position where the snake will go next
	 */
    private Cell moving(Cell currentPosition) 
    { 
        int row = currentPosition.getRow(); 
        int col = currentPosition.getCol(); 
  
        if (direction == right) { 
            col++; 
        } 
        else if (direction == left) { 
            col--; 
        } 
        else if (direction == up) { 
            row--; 
        } 
        else if (direction == down) { 
            row++; 
        } 
  
        Cell nextCell = getBoard().getCells()[row][col]; 
  
        return nextCell; 
    } //end moving

    /**
     * Passing back board
     * @return board
     * @see Board
     */
	public Board getBoard() 
	{
		return board;
	}
	
	/**
	 * setting the size of the board
	 * @param board
	 */
	public void setBoard(Board board) 
	{
		this.board = board;
	}

} 