package bag;

import java.util.ArrayList;

import interfaces.IBag;
import interfaces.ISurprise;

public abstract class Bag implements IBag {
	private ArrayList<ISurprise> surprises = new ArrayList<>();

	@Override
	public void put(ISurprise newSurprise) {
		this.surprises.add(newSurprise);
	}

	@Override
	public void put(IBag bagOfSurprises) {
		while (!bagOfSurprises.isEmpty()) {
			this.surprises.add(bagOfSurprises.takeOut());
		}
	}

	@Override
	public boolean isEmpty() {
		return size() <= 0 ? true : false;
	}

	@Override
	public int size() {
		return this.surprises.size();
	}

	public ArrayList<ISurprise> getSurprises() {
		return this.surprises;
	}

	@Override
	public String toString() {
		return "Bag [surprises=" + this.surprises + "]";
	}

}
