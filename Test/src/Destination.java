
public class Destination {

	private String city;
	private String transportation;
	private int distance;

	public Destination() {

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
		if (getTransportation().equals("flight")) {
			cost = getDistance() * 50;
		} else {
			cost = getDistance() * 30;
		}
		return cost;
	}

}
