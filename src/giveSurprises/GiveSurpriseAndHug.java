package giveSurprises;

public class GiveSurpriseAndHug extends AbstractGiveSurprises {

	public GiveSurpriseAndHug(String containerType, int waitTime) {
		super(containerType, waitTime);
	}

	@Override
	protected void giveWithPassion() {
		System.out.println("Warm wishes and a big hug!");

	}

	@Override
	public String toString() {
		return "GiveSurpriseAndHug  = " + super.getBag();
	}

}
