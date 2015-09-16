
public class GameRunner {
 static int counter=0; 
 static boolean gameWon; 
	public static void main(String[] args) throws InterruptedException 
		{
		gameWon=false; 
		Introduction.askNameToPlay();
		Board.createBoard();
		Board.displayBoard();
		while(!gameWon)
			{
			BoardSpace one = Player.move(); 
			BoardSpace two = Player.move(); 
			Board.checkMatch(one, two);
			counter++; 
			gameWon = Board.checkGameOver();
			}
		
		System.out.println("Congrats! You have won! It took you " + counter + " tries!");

		}
}
