package bag;

import java.util.Random;

import interfaces.ISurprise;

public class BagRandom extends Bag {

	private static final Random random = new Random();

	@Override
	public ISurprise takeOut() {

		if (super.getSurprises().isEmpty()) {
			System.out.println("Unfortunately, there are no surprises in the bag.");
			return null;
		}

		int a = random.nextInt(getSurprises().size());

		return super.getSurprises().remove(a);
	}

	@Override
	public String toString() {
		return "BagRandom = " + super.getSurprises();
	}

}
