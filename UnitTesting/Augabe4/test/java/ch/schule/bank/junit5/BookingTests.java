package ch.schule.bank.junit5;

import ch.schule.Booking;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Tests für die Klasse Booking.
 *
 * @author Luigi Cavuoti
 * @version 1.1
 */
public class BookingTests
{
	/**
	 * Tests f�r die Erzeugung von Buchungen.
	 */
	@Test
	public void testInitialization()
	{
		int date = 16;
		long amount = 17000;
		Booking booking = new Booking(date, amount);

		assertEquals(date, booking.getDate());
		assertEquals(amount, booking.getAmount());
	}

	/**
	 * Experimente mit print().
	 */
	@Test
	public void testPrint()
	{
		int date = 16;
		long amount = 17000;
		Booking booking = new Booking(date, amount);

		booking.print(100);
	}
}
