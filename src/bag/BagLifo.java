package bag;

import interfaces.ISurprise;

public class BagLifo extends Bag {

	@Override
	public ISurprise takeOut() {
		int position = super.getSurprises().size() - 1;

		if (super.getSurprises().isEmpty()) {
			System.out.println("Unfortunately, there are no surprises in the bag.");
			return null;
		}

		return super.getSurprises().remove(position);
	}

	@Override
	public String toString() {
		return "BagLifo =  " + super.getSurprises();
	}
	
	

}
