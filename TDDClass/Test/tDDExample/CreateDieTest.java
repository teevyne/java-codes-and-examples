package tDDExample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CreateDieTest {

	@Test
	void createPlaneTest() 
	{
		CreateDie dreamliner = new CreateDie();
		dreamliner.setName("Semicolon Dreamliner");
		assertNotNull(dreamliner.getName());
		assertEquals("Semicolon Dreamliner", dreamliner.getName());
	}

	@Test
	void createPlaneWithName() 
	{
		CreateDie airbus = new CreateDie("Semicolon Airbus");
		assertNotNull(airbus.getName());
		assertEquals("Semicolon Airbus", airbus.getName());
	}
	
//	@Test
//	void createPlaneWithNameAndSeats() {
//		CreateDie newAirBus = new CreateDie("Semicolon Place", )
//	}
	
	@Test
	void reserveSeat() 
	{
		CreateDie airPeace = new CreateDie("Air Peace");
		Passenger john = new Passenger();
		ReservationManager agent = new ReservationManager();
		agent.reserveSeat(john, airPeace);
		//john.setSeatNumber(1);
		assertEquals(1, john.getSeatNumber());		
	}
	
	@Test
	void isSeatAvailableWithEmptyPlaneTest() 
	{
		ReservationManager agent = new ReservationManager();
		CreateDie airPeace = new CreateDie("Air Peace");
		int[] planeSeats = new int[5];
		airPeace.setSeats(planeSeats);
		boolean result = agent.isSeatAvailable(airPeace);
		assertTrue(result);
	}
	
	@Test
	void isSeatAvailableWithFullPlaneTest() 
	{
		ReservationManager agent = new ReservationManager();
		CreateDie airPeace = new CreateDie("Air Peace");
		int[] planeSeats = { 1, 1, 1, 1, 1 };
		airPeace.setSeats(planeSeats);
		boolean result = agent.isSeatAvailable(airPeace);
		assertFalse(result);
	}
	
	@Test
	void isSeatAvailableWithPartialAvalaibility() 
	{
		ReservationManager agent = new ReservationManager();
		CreateDie airPeace = new CreateDie("Air Peace");
		int[] planeSeats = { 1, 1, 0, 1, 1 };
		airPeace.setSeats(planeSeats);
		boolean result = agent.isSeatAvailable(airPeace);
		assertFalse(result);
	}
	
	@Test
	void isSeatAvailableWithNullSeat() 
	{
		ReservationManager agent = new ReservationManager();
		CreateDie airPeace = new CreateDie("Air Peace");
		boolean result = agent.isSeatAvailable(airPeace);
		assertFalse(result);	
	}
}
