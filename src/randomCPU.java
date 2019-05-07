import java.util.Random;

public class randomCPU extends Player {

	public randomCPU() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Roshambo generateRoshambo() {
		// TODO Auto-generated method stub
		Roshambo RPS = null;
		Random rand = new Random();
		int hand = rand.nextInt(3);
		if (hand == 0) {
			RPS = Roshambo.ROCK;
		}
		if (hand == 1) {
			RPS = Roshambo.PAPER;
		}
		if (hand == 2) {
			RPS = Roshambo.SCISSORS;
		}
		return RPS;
	}

}
