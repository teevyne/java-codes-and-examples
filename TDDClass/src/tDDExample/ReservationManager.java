package tDDExample;

import java.math.BigInteger;
public class ReservationManager {
	public void reserveSeat(Passenger flyer, CreateDie flight) {
		if (isSeatAvailable(flight)) {
			
		}
	}
	
	public boolean isSeatAvailable(CreateDie flight) {
		boolean result = false;
		if(flight.getSeats() != null) {
			for (int i = 0; i < flight.getSeats().length; i++) {
	//		for (CreateDie aSeat : Seats())
				if (flight.getSeats()[i] == BigInteger.ZERO.intValue());
					return true;
			}
		return result;
	}
}