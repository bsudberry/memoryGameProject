import java.util.Scanner;

public class Player 
	{
	public static BoardSpace move() throws InterruptedException
		{
		System.out.println("Please pick a coordinate pair to reveal the card"); 
		Scanner userMove = new Scanner(System.in); 
		String move = userMove.nextLine().toLowerCase(); 
		int y; 
		int x; 
		if(move.substring(0, 1).equals("a"))
			{
			y=0; 
			}
		else if (move.substring(0, 1).equals("b"))
			{
			y=1;
			}
		else if (move.substring(0, 1).equals("c"))
			{
			y=2;
			}
		else
			{
			y=3;
			}
		
		if(move.substring(1).equals("1"))
				{
				x=0; 
				}
		
		else if(move.substring(1).equals("2"))
			{
			x=1; 
			}
		else if(move.substring(1).equals("3"))
			{
			x=2; 
			}
		else
			{
			x=3; 
			}
		
		Board.board[y][x].setDisplay(Board.board[y][x].getWord());
		Board.displayBoard(); 
		return Board.board[y][x]; 

		}
	}
