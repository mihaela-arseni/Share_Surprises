package surprises;

import java.util.ArrayList;
import java.util.Arrays;

import interfaces.ISurprise;

public class MinionToy implements ISurprise {

	private static final ArrayList<String> minions = new ArrayList<String>(
			Arrays.asList("Dave", "Carl", "Kevin", "Stuart", "Jerry", "Tim"));
	private String minionName;
	private static int counter = 0;

	public MinionToy(String minionName) {
		this.minionName = minionName;
	}

	public static MinionToy generate() {
		if (counter >= minions.size()) {
			System.out.println("Unfortunately, there are no minions in the bag.");
			return null;
		}

		MinionToy minion = new MinionToy(minions.get(counter));
		counter++;
		minion.enjoy();
		return minion;
	}

	@Override
	public void enjoy() {
		System.out.println("Congratulations, you have received a minion toy " + this.minionName + "!");

	}

	@Override
	public String toString() {
		return "MinionToy [minionName=" + this.minionName + "]";
	}

}
