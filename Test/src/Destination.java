
public class Destination {

	private String city;
	private String transportation;
	private int distance;

	public Destination() {

	}
	
	public Destination(String city, String transportation, int distance) {
		this.city = city;
		this.transportation = transportation;
		this.distance = distance;

	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getTransportation() {
		return transportation;
	}

	public void setTransportation(String transportation) {
		this.transportation = transportation;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public int costTripToDestination() {
		int cost = 0;
		if (this.getTransportation().equals("flight")) {
			cost = this.getDistance() * 50;
		} else {
			cost = this.getDistance() * 30;
		}
		System.out.println("Your trip to this destination will cost: " + cost + "SEK");
		return cost;
	}

}
