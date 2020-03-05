package giveSurprises;

public class GiveSurpriseAndSing extends AbstractGiveSurprises {

	public GiveSurpriseAndSing(String containerType, int waitTime) {
		super(containerType, waitTime);
	}

	@Override
	protected void giveWithPassion() {
		System.out.println("Singing a nice song, full of joy and genuine excitement…");
	}

	@Override
	public String toString() {
		return "GiveSurpriseAndSing  = " + super.getBag();
	}

}
