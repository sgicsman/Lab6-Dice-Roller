import java.util.Scanner;

import java.util.Random;

public class Lab6DiceRoller {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		int numSides;
		int firstDie;
		int secondDie;
		String playAgain;
		
		System.out.println("Welcome to the Grand Circus Casino!\n");
		
		do {
		System.out.println("How many sides do you prefer on your dice? Please enter an integer (no decimal points.)");
		numSides = scnr.nextInt();
		scnr.nextLine();
		
			if (numSides == 0) {
				break;
			}
		
		System.out.println("Roll 1:");
		firstDie = generateRandomDieRoll(numSides) + 1;
		System.out.println(firstDie);
		secondDie = generateRandomDieRoll(numSides) + 1;
		System.out.println(secondDie);
		
			if ( (firstDie + secondDie) == 2 ) {
				System.out.println("Snake eyes! Pay the Don't Pass bettors!");
			}
		
			else if ( (firstDie + secondDie) == 3 ) {
				System.out.println("Craps! Do Not Pass pays off!");
			}
			
			else if ( (firstDie + secondDie) == 12 ) {
				System.out.println("Box cars! Nobody wins. Push the Don't Pass bettors.");
			}
			
			else if ( (firstDie + secondDie) == 7 || (firstDie + secondDie) == 11 ) {
				System.out.println("A Natural! Pass bettors win!");
			}
			
			else {
				System.out.println( (firstDie + secondDie) + "! The point is " + (firstDie + secondDie) + "! Place your bets.");
			}
		
		System.out.println("Would you like to try your luck again? (y/n)");
		playAgain = scnr.nextLine();
		
		} while ( playAgain.startsWith("y") );
		
		System.out.println("Thanks for playing, and come back soon!");
		
	}
		private static int generateRandomDieRoll(int num) {
			
			Random randGen = new Random();
			return randGen.nextInt(num);

		}
		
}
