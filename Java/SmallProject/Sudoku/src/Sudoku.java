import java.util.*;

public class Sudoku
{
	private int[] mat[]; 
	private int[] tempMat[];
	final private int[] finalBoard[];
	
	public Sudoku()
	{
		 mat = new int[9][9]; 
		 tempMat= new int[9][9];
		 finalBoard=new int [9][9];
	}
	
	//creating a board with the number that we put in
	public void addNew()
	{
		int[][] board = {
  			  {2,8,9,1,3,6,5,4,7},
  			  {4,1,5,2,8,7,3,6,9},
  			  {3,6,7,4,5,9,2,8,1},
  			  {1,2,6,8,7,4,9,5,3},
  			  {5,3,8,9,2,1,6,7,4},
  			  {7,9,4,3,6,5,8,1,2},
  			  {9,5,3,7,4,8,1,2,6},
  			  {6,7,1,5,9,2,4,3,8},
  			  {8,4,2,6,1,3,7,9,5},
  			};
		//copying the numbers
		 for (int r = 0; r<9; r++) 
	        { 
	            for (int c = 0; c<9; c++) 
	            {
	            	mat[r][c]=board[r][c];
	            	finalBoard[r][c]=board[r][c];
	            }
	        }
	}
	
	//remove random digits 
    public void removeDigits(int size) 
    { 
        int count = size; 
        while (count != 0) 
        { 
            int position = (int) Math.floor((Math.random()*81)); 

            // extract coordinates r  and c 
            int r = (position/9); 
            int c = position%9; 
  
            //replace it with 0
            if (mat[r][c] != 0) 
            { 
                count--; 
                mat[r][c] = 0; 
            } 
        } 
        //make a copy
        copy();
    } 
    
    //guess the number
    public int addGuess(int r, int c,int guess)
    {
    	r-=1;
    	c-=1;
    	//you can't guess the number that has a value on it already
    	if (mat[r][c]!=0)
    		return 0;
    	else
    	{
    		mat[r][c]=guess;
    		return 1;
    	}
    }
    
    //copying the board into another for reference
    public void copy()
    {
    	 for (int r = 0; r<9; r++) 
	     { 
            for (int c = 0; c<9; c++) 
            { 
            	tempMat[r][c]=mat[r][c];
            }
	     }
    }
    
    //reset
    public void reset()
    {
    	 for (int r = 0; r<9; r++) 
	     { 
            for (int c = 0; c<9; c++) 
            { 
            	mat[r][c]=tempMat[r][c];
            }
	     }
    }
    
    //find a value in a certain spot
    public int getValueIn(int r,int c)
    {
    	r-=1;
    	c-=1;
    	return finalBoard[r][c];
    }
	
    //display
    public void printSudoku() 
    { 
    	
        //displace the board
        for (int r = 0; r<9; r++) 
        { 
            for (int c = 0; c<9; c++) 
            {
                System.out.print(mat[r][c] + " "); 
                if (c==2)
                	System.out.print("| "); 	
                if (c==5)
                	System.out.print("| "); 
            }
            if (r==2)
            {
            	System.out.println();
            	System.out.print("---------------------"); 
            }
            if (r==5)
            {
            	System.out.println();
            	System.out.print("---------------------"); 
            }
            
            System.out.println(); 
        } 
        System.out.println(); 
    } 
    
   
    
    //check if the board is full or not
    public boolean isFull()
    {
    	  for (int r = 0; r<9; r++) 
          { 
              for (int c = 0; c<9; c++) 
              {
            	  if (mat[r][c]==0)
            		  return false;
              }
          }
    	  return true;
    }
	
    //check the puzzle have any violation
	public boolean checkPuzzle(){

        //flags
        int c1,c2,c3,c4,c5,c6,c7,c8,c9;

        
        // row checker

        for(int row = 0; row < 9; row++){
            //resets flags after every row
            c1=0;
            c2=0;
            c3=0;
            c4=0;
            c5=0;
            c6=0;
            c7=0;
            c8=0;
            c9=0;
            for(int col = 0; col < 9; col++){
                if(mat[row][col]==1)
                    c1++;
                if(mat[row][col]==2)
                    c2++;
                if(mat[row][col]==3)
                    c3++;
                if(mat[row][col]==4)
                    c4++;
                if(mat[row][col]==5)
                    c5++;
                if(mat[row][col]==6)
                    c6++;
                if(mat[row][col]==7)
                    c7++;
                if(mat[row][col]==8)
                    c8++;
                if(mat[row][col]==9)
                    c9++;
                if(c1>1||c2>1||c3>1||c4>1||c5>1||c6>1||c7>1||c8>1||c9>1)
                    return false;}
                }
            


                for(int col = 0; col < 9; col++){

                        c1=0;
                        c2=0;
                        c3=0;
                        c4=0;
                        c5=0;
                        c6=0;
                        c7=0;
                        c8=0;
                        c9=0;
                        for(int row = 0; row < 9; row++){
                           
                            if(mat[row][col]==1)
                                c1++;
                            if(mat[row][col]==2)
                                c2++;
                            if(mat[row][col]==3)
                                c3++;
                            if(mat[row][col]==4)
                                c4++;
                            if(mat[row][col]==5)
                                c5++;
                            if(mat[row][col]==6)
                                c6++;
                            if(mat[row][col]==7)
                                c7++;
                            if(mat[row][col]==8)
                                c8++;
                            if(mat[row][col]==9)
                                c9++;
                            if(c1>1||c2>1||c3>1||c4>1||c5>1||c6>1||c7>1||c8>1||c9>1)
                                return false;}}

                    
                            
        // // grid checker

        for(int row=0; row <9; row +=3){
           
            for(int col=0;col<9;col += 3){
                //resets the flags for every 3x3
                c1=0;
                c2=0;
                c3=0;
                c4=0;
                c5=0;
                c6=0;
                c7=0;
                c8=0;
                c9=0;
                for(int x=0;x<9;x++){
                            if(mat[row+x%3][col+x/3]==1)
                                c1++;
                            if(mat[row+x%3][col+x/3]==2)
                                c2++;
                            if(mat[row+x%3][col+x/3]==3)
                                c3++;
                            if(mat[row+x%3][col+x/3]==4)
                                c4++;
                            if(mat[row+x%3][col+x/3]==5)
                                c5++;
                            if(mat[row+x%3][col+x/3]==6)
                                c6++;
                            if(mat[row+x%3][col+x/3]==7)
                                c7++;
                            if(mat[row+x%3][col+x/3]==8)
                                c8++;
                            if(mat[row+x%3][col+x/3]==9)
                                c9++;

                            //if flags are triggered(more than one of the same digit in the 3x3, ends the method

                            if(c1>1||c2>1||c3>1||c4>1||c5>1||c6>1||c7>1||c8>1||c9>1)
                                return false;}}}
        
       

    return true;
    }
	
	//only can change the number, that the user input. it can't change the original numbers
	public boolean change(int r, int c, int value)
	{
        r-=1;
        c-=1;
		if (tempMat[r][c]==0)
		{
			mat[r][c]=value;
			return true;
		}
		else
			return false;
	}
    
    public static void main(String[] args) 
    { 
    	Scanner input = new Scanner (System.in);
    	//variables
    	int row,column, value,num=0,size;
        Sudoku sudoku = new Sudoku(); 
        //setting the board
        sudoku.addNew();
        //remove certain amount of digits
        System.out.println("How many empty spaces do you want?");
        size = Integer.parseInt(input.next());
        sudoku.removeDigits(size);
        System.out.println();
        sudoku.printSudoku(); 
        
        //keep going until the board is full
        do
        {
        	System.out.println("What do you want to do? \n1= guess, 2= to reveal a certain spot, \n3 =change, 4= check the puzzle, 5= reset");
        	num=Integer.parseInt(input.next());
        	switch(num)
	        {
	        	//case 1 is to ask the user for the row and column and value to guess
	        	case 1:
			        System.out.println("What is the row do you want to guess?");
			        row=Integer.parseInt(input.next());
			        System.out.println("What is the column do you want to guess??");
			        column=Integer.parseInt(input.next());
			        System.out.println("What is the value do you want to guess??");
			        value=Integer.parseInt(input.next());
			        //if the spot has a value in it, it wouldn't let the user replace it.
			        if (sudoku.addGuess(row, column, value)==0)
			        	System.out.println("This spot already has a value, guess another spot.");
			        else
			        	System.out.println("We have inputed your guess, here is the updated Sudoku. ");
			        System.out.println();
			        sudoku.printSudoku();
			        break;
			    //get the value in certain spot
	        	case 2:
			        System.out.println("What is the row do you want to see? ");
			        row=Integer.parseInt(input.next());
			        System.out.println("What is the column do you want to see? ");
			        column=Integer.parseInt(input.next());
			        System.out.println();
                    System.out.println("The number that is in row "+row +" and column "+ column+ " is: "+sudoku.getValueIn(row,column));			        
                    break;
			    //reset
	        
	        	case 3:
        		  	System.out.println("What is the row do you want to change?");
			        row=Integer.parseInt(input.next());
			        System.out.println("What is the column do you want to change??");
			        column=Integer.parseInt(input.next());
			        System.out.println("What is the value do you want to change??");
			        value=Integer.parseInt(input.next());
	        		if(sudoku.change(row, column, value))
	        			System.out.println("We have changed your guess, here is the updated Sudoku. ");
	        		else
	        			System.out.println("You cannot change this spot, guess another spot.");
	        		System.out.println();
			        sudoku.printSudoku();
                    break;
                //checks if the puzzle follows the rules so far.
				case 4:
					if(sudoku.checkPuzzle())
					{
						System.out.println("The puzzle is good so far.");
					}
					else
					{
						System.out.println("There is a value that does not follow the rule of Sudoku.");
					}
                    break;
                //resets the board
				case 5:
                    System.out.println("Do you really want to reset the board?\n1=yes, 2=no");
	        		num=Integer.parseInt(input.next());
	        		if (num==1)
	        		{
	        			sudoku.reset();
                        System.out.println("Here is the reset board.");
                        System.out.println();
	        			System.out.println();
	        			sudoku.printSudoku();
	        		}
	        		else if (num!=1&&num!=2)
                        System.out.println("Wrong input.");
                        System.out.println();
					break;

	        }//end switch
        	
        	if(sudoku.isFull()&&!sudoku.checkPuzzle())
        	{
        		System.out.println("Your board is full and there is an error in the board, try to fix it.");
        		System.out.println();
        	}
        }while (!sudoku.isFull()||!sudoku.checkPuzzle());
        
        
        System.out.println("Congratulation!! You finished!!");
    }
}
