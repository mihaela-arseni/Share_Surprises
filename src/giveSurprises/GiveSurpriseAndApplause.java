package giveSurprises;

public class GiveSurpriseAndApplause extends AbstractGiveSurprises {

	public GiveSurpriseAndApplause(String containerType, int waitTime) {
		super(containerType, waitTime);
	}

	@Override
	protected void giveWithPassion() {
		System.out.println("Loud applause to you… For it is in giving that we receive.");
	}

	@Override
	public String toString() {
		return "GiveSurpriseAndApplause =" + super.getBag();
	}

}
