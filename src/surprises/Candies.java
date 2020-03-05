package surprises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import interfaces.ISurprise;

public class Candies implements ISurprise {

	private static final ArrayList<String> candiesType = new ArrayList<String>(
			Arrays.asList("chocolate", "jelly", "fruits", "vanilla"));
	private int candiesNumber;
	private String candyType;
	private static final Random random = new Random();

	public Candies(int candiesNumber, int candyType) {
		this.candiesNumber = candiesNumber;
		this.candyType = candiesType.get(candyType);
	}

	public static ArrayList<String> getCandiesType() {
		return candiesType;
	}

	public static Candies generate() {
		int candiesNumberRandom = random.nextInt(10) + 1;
		int positionOfRandomCandy = random.nextInt(candiesType.size());
		Candies candies = new Candies(candiesNumberRandom, positionOfRandomCandy);
		candies.enjoy();
		return candies;
	}

	@Override
	public void enjoy() {
		System.out.println("Congratulations, you have received " + this.candiesNumber + " " + this.candyType + " candies.");

	}

	@Override
	public String toString() {
		return "Candies [candiesNumber=" + this.candiesNumber + ", candyType=" + this.candyType + "]";
	}
}
