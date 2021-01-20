package Module9;

/*
 * Author: Ethan Fisher
 * Date: 10/12/2020
 * School: Franklin Academy HS
 * Guessing Game Program
 * 
 * Description: Make a guessing game with 3 players
 * Difficulties: When using a scanner, I forgot to use nextLine after nextInt
 * Learned: Game launchers don't need much code, just starting another program
 */

public class GameLauncherEBF {
	
	public static void main(String[] args) {
		// create a guessing game and start it
		GuessingGame game = new GuessingGame();
		game.startGame();
	}
	 
}

/*
 * Sample Output:

Enter lower bound: 0
Enter upper bound: 10
Computer has generated a number for Player 1. (The computer generated 9)
Player 1, guess: 5
Too low, guess again: 6
Too low, guess again: 7
Too low, guess again: 8
Too low, guess again: 9
Correct! Player 1 took 5 guesses.
Player 2, would you like to play (y/n): y
Computer has generated a number for Player 2. (The computer generated 5)
Player 2, guess: 5
Correct! Player 2 took 1 guesses.
Player 2 is in the lead! Player 3, would you like to play (y/n): n

 */
