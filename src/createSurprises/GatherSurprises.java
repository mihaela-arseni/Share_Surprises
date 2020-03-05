package createSurprises;

import java.util.Random;

import interfaces.ISurprise;
import surprises.Candies;
import surprises.FortuneCookie;
import surprises.MinionToy;

public final class GatherSurprises {

	private static GatherSurprises gatherSurprises = null;

	private GatherSurprises() {}

	public static GatherSurprises getInstance() {
		if (gatherSurprises == null) {
			gatherSurprises = new GatherSurprises();
		}
		return gatherSurprises;
	}

	public static ISurprise gather() {
		Random random = new Random();
		int randomNumber = random.nextInt(3) + 1;
		return createARandomSurprise(randomNumber);
	}

	public static ISurprise[] gather(int n) {

		ISurprise[] surprises = new ISurprise[n];

		for (int i = 0; i < surprises.length; i++) {
			surprises[i] = gather();
		}

		return surprises;
	}

	private static ISurprise createARandomSurprise(int randomNumber) {
		ISurprise surprise;
		switch (randomNumber) {
		case 1:
			surprise = Candies.generate();
			break;
		case 2:
			surprise = FortuneCookie.generate();
			break;
		case 3:
			surprise = MinionToy.generate();
			break;
		default:
			System.out.println("We don't have this type of surprise.");
			surprise = null;
			break;
		}

		return surprise;
	}
	
}
