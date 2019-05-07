import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your name:");

		String playerName = scan.nextLine();

		System.out.println("Welcome " + playerName + ", select an opponent: \n \t \t 1: Always rock");
		System.out.println("\t \t 2: Random");
		Player opponent = null;

		int opp = validation.getInt(scan, "", 1, 2);

		if (opp == 1) {
			opponent = new alwaysRock();
		}
		if (opp == 2) {
			opponent = new randomCPU();
		}
		Player you = new humanPlayer();
		int wins = 0;
		int loses = 0;
		int games = 0;
		// loop

		String escape = "";
		do {
		Roshambo nextHand = opponent.generateRoshambo();
			System.out.println("Pick your weapon:");
		System.out.println("1: Rock \n 2: Paper \n 3: Scissors");
			int weapon = validation.getInt(scan, "", 1, 3);

		Roshambo playerHand = you.generateRoshambo(weapon);

			System.out.println("You picked: " + playerHand + "\n" + "Your opponent picked " + nextHand);

		if (nextHand == playerHand) {
				System.out.println("Tie!");
		}
		else if ((nextHand.equals(Roshambo.ROCK)) && (playerHand.equals(Roshambo.SCISSORS))) {
				System.out.println("You lose");
				loses += 1;
		}
		else if ((nextHand.equals(Roshambo.PAPER)) && (playerHand.equals(Roshambo.ROCK))) {
				System.out.println("You lose");
				loses += 1;
		}
		else if ((nextHand.equals(Roshambo.SCISSORS)) && (playerHand.equals(Roshambo.PAPER))) {
				System.out.println("You lose");
				loses += 1;
		} else {
				System.out.println("You win");
			wins += 1;
		}
		games +=1;
			System.out.println("Continue? (y/n)");
			escape = scan.next();
//end loop
		} while (!escape.equalsIgnoreCase("n"));



		System.out.println("You won " + wins + " times and lost " + loses + " times, out of " + games + " games.");
	}


}
