package tDDExample;

public class CreateDie {
	private String name;
	private  int[] seats;
	
	public CreateDie() {}
	
	public CreateDie(String name) {
		this.name = name;
	}
	
	public CreateDie(String name, int[] seats) {
		this(name);
		this.seats = seats;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public int[] getSeats() {
		return seats;
	}

	public void setSeats(int[] seats) {
		this.seats = seats;
	}
}
