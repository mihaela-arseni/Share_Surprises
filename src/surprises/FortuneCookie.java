package surprises;

import java.util.Random;

import interfaces.ISurprise;

public class FortuneCookie implements ISurprise {
	private static final String[] fortuneCookies = { "Age is of no importance unless you’re a cheese.” – Billie Burke",
			"Never put off until tomorrow what you can do the day after tomorrow.” – Mark Twain",
			"A clear conscience is a sure sign of a bad memory.” – Mark Twain",
			"Always remember that you are unique – just like everybody else.” - Margaret Mead",
			"Bad decisions make good stories.” – Ellis Vidler",
			"People often say that motivation doesn’t last. Well, neither does bathing — that’s why we recommend it daily.” – Zig Ziglar",
			"You must learn from the mistakes of others. You can’t possibly live long enough to make them all yourself.” – Sam Levenson",
			"By working faithfully eight hours a day you may eventually get to be boss and work twelve hours a day.” – Robert Frost",
			"The difference between genius and stupidity is; genius has its limits.” – Albert Einstein",
			"Even a stopped clock is right twice every day. After some years, it can boast of a long series of successes.” – Marie von Ebner-Eschenbach",
			"If you think you are too small to make a difference, try sleeping with a mosquito.“ - Dalai Lama",
			"Learn the rules like a pro, so you can break them like an artist.“ - Pablo Picasso",
			"It takes sunshine and rain to make a rainbow. There would be no rainbows without sunshine and rain.“ - Roy T. Bennett",
			"It takes less time to do things right than to explain why you did it wrong.“ - Henry Wadsworth",
			"Failure is the condiment that gives success its flavor.“ - Truman Capote",
			"The key to success is not through achievement, but through enthusiasm.“ - Malcolm Forbes",
			"Whoever said, ‘It’s not whether you win or lose that counts,’ probably lost.“ - Martina Navratilova",
			"Wisdom comes from experience. Experience is often a result of lack of wisdom.” – Terry Pratchett",
			"Remember, today is the tomorrow you worried about yesterday.” – Dale Carnegie",
			"A mind is like a parachute. It doesn’t work if it is not open.” – Frank Zappa" };

	private static final Random random = new Random();
	private String message;
	private static int positionOfMessage;

	public FortuneCookie(int positionOfMessage) {
		FortuneCookie.positionOfMessage = positionOfMessage;
		this.message = fortuneCookies[positionOfMessage];
	}

	public static FortuneCookie generate() {
		positionOfMessage = random.nextInt(fortuneCookies.length);
		FortuneCookie fortuneCookie = new FortuneCookie(positionOfMessage);
		fortuneCookie.enjoy();
		return fortuneCookie;
	}

	public String getMessage() {
		return this.message;
	}

	@Override
	public void enjoy() {
		System.out.println("Congratulations, your fortune cookie is \"" + this.message + ".");

	}

	@Override
	public String toString() {
		return "FortuneCookie [message=" + this.message + "]";
	}

}
