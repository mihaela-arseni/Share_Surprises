package bag;

import interfaces.ISurprise;

public class BagFifo extends Bag {

	@Override
	public ISurprise takeOut() {

		if (super.getSurprises().isEmpty()) {
			System.out.println("Unfortunately, there are no surprises in the bag.");
			return null;
		}

		return super.getSurprises().remove(0);
	}

	@Override
	public String toString() {
		return "BagFifo = " + super.getSurprises();
	}

}
