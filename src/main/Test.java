package main;

import createSurprises.GatherSurprises;
import giveSurprises.AbstractGiveSurprises;
import giveSurprises.GiveSurpriseAndApplause;
import giveSurprises.GiveSurpriseAndHug;
import giveSurprises.GiveSurpriseAndSing;
import interfaces.ISurprise;

public class Test {
	public static void main(String[] args) {
		AbstractGiveSurprises bagFifo = new GiveSurpriseAndApplause("FIFO", 3);
		AbstractGiveSurprises bagLifo = new GiveSurpriseAndSing("LIFO", 2);
		AbstractGiveSurprises bagRandom = new GiveSurpriseAndHug("Random", 1);

//		Create an Instance of GatherSurprise
		GatherSurprises.getInstance();
		System.out.println("\"Create several suprises and add them to bagFifo\"");
		ISurprise[] surprisesArray = GatherSurprises.gather(4);
		for (int i = 0; i < surprisesArray.length; i++) {
			bagFifo.put(surprisesArray[i]);
		}
		System.out.println();

		System.out.println("\"Create one surprise and add to bagFifo\"");
		bagFifo.put(GatherSurprises.gather());
		System.out.println();

		System.out.println("\"Create one surprise and add in BagRandom. Then add the bagFifo in BagRandom\"");
		bagRandom.put(GatherSurprises.gather());
		bagRandom.put(bagFifo.getBag());
		System.out.println();

		System.out.println("\"Print new bag random and new bagfifo\"");
		System.out.println(bagRandom);
		System.out.println(bagFifo);
		System.out.println(bagFifo.give());
		System.out.println("Is the bagFifo empty? " + bagFifo.isEmpty());

		bagLifo.put(bagFifo.getBag());
		System.out.println(bagLifo);
		System.out.println(bagFifo);
		System.out.println("Is the bagLifo empty? " + bagLifo.isEmpty());
		System.out.println("Is the bagFifo empty? " + bagFifo.isEmpty());
		System.out.println();

		System.out.println("\"Create surprises and add in bag Lifo");
		bagLifo.put(GatherSurprises.gather());
		bagLifo.put(GatherSurprises.gather());
		bagLifo.put(GatherSurprises.gather());
		bagLifo.put(GatherSurprises.gather());
		System.out.println(bagLifo);
		System.out.println(bagLifo.getBag().size());
		System.out.println("Is the bagLifo empty? " + bagLifo.isEmpty());
		System.out.println();

		System.out.println("Give all surprises from bagRandom and wait several seconds:");
		bagRandom.giveAll();
		System.out.println(bagRandom);
		System.out.println("Is the bagRandom empty? " + bagRandom.isEmpty());
		System.out.println(bagRandom.getBag().size());

		System.out.println("Give 1 surprise from bagLifo");
		bagLifo.give();
		System.out.println(bagLifo);
	}
}
