
public class humanPlayer extends Player {

	public humanPlayer() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Roshambo generateRoshambo(int a) {
		// TODO Auto-generated method stub
		Roshambo RPS = null;

		if (a == 1) {
			RPS = Roshambo.ROCK;
		}
		if (a == 2) {
			RPS = Roshambo.PAPER;

		}
		if (a == 3) {
			RPS = Roshambo.SCISSORS;
		}
		return RPS;
	}

	@Override
	public Roshambo generateRoshambo() {
		// TODO Auto-generated method stub
		return null;
	}


}
