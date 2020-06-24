package question14;

public class PieceWorker extends Employee {
	private double wage; //store the employee’s wage per piece
	private int pieces; //to store number of pieces produced

	public PieceWorker(String firstName, String lastName, String socialSecurityNumber, Date birthday, double wage, int pieces) {
		super(firstName, lastName, socialSecurityNumber, birthday);
		this.wage = wage;
		this.pieces = pieces;
	}

	public int getPieces() {
		return pieces;
	}

	public void setPieces(int pieces) {
		this.pieces = pieces;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}
	
	@Override
	public double earnings() {
		return getWage() * getPieces();
	}
	
	@Override
	public String toString() {
		return String.format("%s%n%s%nNumber of pieces: %d%nWage rate: %.2f", "Piece-Worker", super.toString(), getPieces(), getWage());
	}
}
