package GuessMyNumber;

import java.util.Scanner;
import java.util.Random;

public class AD_GuessMyNumber {
	
	private static Scanner scan = new Scanner(System.in);
	private static Random rand = new Random();
	
	public static void main(String[] args) {
		System.out.println("I have a number between 1 and 100. Can you guess my number? Please type your first guess!");
		
		int correct = rand.nextInt(99);
		int guesses = 0;
		
		while (true) {
			int guess = 0;
			
			if (scan.hasNextInt()) {
				guess = scan.nextInt();
			}
			else {
				System.out.println("Invalid Input!");
				System.out.println("Guess again!");
				scan.next();
				continue;
			}
			
			if (guess >= 1 && guess <= 100) {
				guesses++;
			}
			else {
				System.out.println("Invalid guess! my number is between 1 and 100!");
				continue;
			}
			
			if (guess == correct) {
				System.out.println("You win!");
				System.out.println("You got it in " + guesses + " guesses!");
				System.out.println("Do you want to play again? y/n");
				if (scan.next().equals("y")) {
					main(null);
				}
				else {
					break;
				}
				
			}
			else if (guess < correct) {
				System.out.println("Too low! Try again!");
			}
			else {
				System.out.println("Too high! Try again!");
			}
			
		}
		
	}
}
