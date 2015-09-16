import java.util.ArrayList;
import java.util.Collections;

public class Board
	{
		public static BoardSpace [][] board=new BoardSpace [4][4];
		static ArrayList <String> animals = new ArrayList <String>();

		public static void createBoard()
			{
			fillBoard(); 
			for(int i=0; i<4; i++)
				{
				for(int j=0; j<4; j++)
					{
					board[i][j] = new BoardSpace(animals.get(0), " x  ", false, false, i , j); 
					animals.remove(0); 
					}
				}
			}
		static void displayBoard()
		{
				System.out.println("      1     2       3      4");
				System.out.println("  ----------------------------");
				System.out.println("A | " + board[0][0].getDisplay() + " | "  + board[0][1].getDisplay() + " | " + board[0][2].getDisplay() + " | " + board[0][3].getDisplay() +  " | ");
				System.out.println("  ----------------------------");
				System.out.println("B | " + board[1][0].getDisplay() + " | "  + board[1][1].getDisplay() + " | " + board[1][2].getDisplay() + " | " + board[1][3].getDisplay() +  " | " ); 	
				System.out.println("  ----------------------------");
				System.out.println("C | " + board[2][0].getDisplay() + " | "  + board[2][1].getDisplay() + " | " + board[2][2].getDisplay() + " | " + board[2][3].getDisplay() +  " | ");
				System.out.println("  ----------------------------");
				System.out.println("D | " + board[3][0].getDisplay() + " | "  + board[3][1].getDisplay() + " | " + board[3][2].getDisplay() + " | " + board[3][3].getDisplay() +  " | " );
				System.out.println("  ----------------------------");
				System.out.println("");
				
			}
		static void fillBoard()
			{
				animals.add("Dogs");
				animals.add("Cats");
				animals.add("Crab");
				animals.add("Fish");
				animals.add("Wasp");
				animals.add("Goat");
				animals.add("Lion");
				animals.add("Toad");
				animals.add("Dogs");
				animals.add("Cats");
				animals.add("Crab");
				animals.add("Fish");
				animals.add("Wasp");
				animals.add("Goat");
				animals.add("Lion");
				animals.add("Toad");	
				Collections.shuffle(animals);
				
			}
		
		public static void checkMatch(BoardSpace one, BoardSpace two) throws InterruptedException
			{
			if((one.getRow() == two.getRow()) && one.getCol()==two.getCol())
				{
				System.out.println("Can't choose the same spot silly.");
				System.out.println("Try again!");
				board[one.getRow()][one.getCol()].setDisplay(" x  ");
				board[two.getRow()][two.getCol()].setDisplay(" x  ");
				
				}
			else if(one.getWord().equals(two.getWord()))
				{
				System.out.println("Nice Match!");
//				board[one.getRow()][one.getCol()].setDisplay(board[one.getRow()][one.getCol()].getWord());
//				board[two.getRow()][two.getCol()].setDisplay(board[two.getRow()][two.getCol()].getWord());
				}
			
			else
				{
				Thread.sleep(1500);
				System.out.println("Try again!");
				board[one.getRow()][one.getCol()].setDisplay(" x  ");
				board[two.getRow()][two.getCol()].setDisplay(" x  ");

				}
			displayBoard(); 
			}
		
		public static boolean checkGameOver()
			{
			for(int i=0; i<4; i++)
				{
				for(int z=0; z<4; z++)
					{
					if(board[i][z].getDisplay().equals(" x  "))
						{
						return false; 
						}
					}
				}
			return true; 
			}
	}