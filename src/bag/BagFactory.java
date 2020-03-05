package bag;

import interfaces.IBag;
import interfaces.IBagFactory;

public class BagFactory implements IBagFactory {

	@Override
	public IBag makeBag(String type) {
		switch (type.toUpperCase()) {
		case "RANDOM":
			return new BagRandom();
		case "FIFO":
			return new BagFifo();
		case "LIFO":
			return new BagLifo();
		default:
			return new BagRandom();
		}
	}

}
