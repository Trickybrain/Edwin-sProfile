import java.util.Scanner;
/**
 * Driver class for the snake game, it will let user control the movement of the snake, up, down, left right using classic control "WASD"
 * @author Edwin
 *
 */
public class Driver 
{

    public static void main(String[] args) 
    { 
  
        System.out.println("Going to start game"); 
        System.out.println("Control the snake with wasd Key, w=up, a=left, s=down, d=right");
        Cell cell = new Cell(0,0); 
        Snake snake = new Snake(cell); 
        Board board = new Board(10,10); 
        Game game = new Game(snake, board); 
        game.setGameOver(false); 
        Scanner input = new Scanner(System.in);
        game.update();
		String answer;
		game.getBoard().generateFood(); 
		game.setDirection(game.getDown());
		game.getBoard().toString();
        do
        {
        	System.out.print("Which direction do you want to move?");
        	answer=input.next();
        	switch(answer)
        	{
	        	case "w": 
	        		game.setDirection(game.getUp());
	        		break;
	        	case "s":
	        		game.setDirection(game.getDown());
	        		break;
	        	case "a":
	        		game.setDirection(game.getLeft());
	        		break;
	        	case "d":
	        		game.setDirection(game.getRight());
	        		break;
        	}

        	game.update(); 
        	game.getBoard().toString();
        	
        	
        }while(!game.isGameOver());
    } 
} 

