

public class Test {

	public static void main(String[] args) {
		System.out.println("GitHub for Life");
		System.out.println("Git git git");
		System.out.println("Summer feeling");
		
		Destination destination = new Destination("Miami", "car", 90);
		destination.costTripToDestination();
		
		System.out.println("Where are you going?");
		System.out.println("To " + destination.getCity() + " of course :)");
	}

}
