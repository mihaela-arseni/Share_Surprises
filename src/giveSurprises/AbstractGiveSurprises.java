package giveSurprises;

import java.util.concurrent.TimeUnit;

import bag.BagFactory;
import interfaces.IBag;
import interfaces.ISurprise;

public abstract class AbstractGiveSurprises {
	private IBag bag;
	private int waitTime;

	public AbstractGiveSurprises(String containerType, int waitTime) {
		this.waitTime = waitTime;
		this.bag = new BagFactory().makeBag(containerType);
	}

	public void put(ISurprise newSurprise) {
		this.bag.put(newSurprise);
	}

	public void put(IBag surprises) {
		this.bag.put(surprises);
	}

	public boolean isEmpty() {
		return this.bag.isEmpty();
	}

	public ISurprise give() {
		ISurprise surprise = this.bag.takeOut();
		if (surprise != null) {
			giveWithPassion();
		}
		return surprise;
	}

	public void giveAll() {
		while (!this.bag.isEmpty()) {
			give();
			System.out.println("The surprise was taken out from the bag.");
			// Sleep for X seconds - code snippet
			try {
				TimeUnit.SECONDS.sleep(waitTime); // number of seconds to sleep
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public IBag getBag() {
		return this.bag;
	}

	public int getWaitTime() {
		return waitTime;
	}

	protected abstract void giveWithPassion();

	@Override
	public String toString() {
		return "AbstractGiveSurprises [bag=" + this.bag + ", waitTime=" + this.waitTime + "]";
	}

}
