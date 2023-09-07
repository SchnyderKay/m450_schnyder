package ch.schule.bank.junit5;

import ch.schule.Bank;
import ch.schule.SalaryAccount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/**
 * Tests der Klasse SalaryAccount.
 *
 * @author XXX
 * @version 1.1
 */
public class SalaryAccountTests
{
	/**
	 * Der Test.
	 */
	@Test
	public void test()
	{
		long creditLimit = -20000;
		long withdraw = 7230;
		Bank bank = new Bank();

		String id = bank.createSalaryAccount(creditLimit);
		bank.withdraw(id, 13, withdraw);

		assertEquals(0-withdraw, bank.getBalance(id));

	}
}
