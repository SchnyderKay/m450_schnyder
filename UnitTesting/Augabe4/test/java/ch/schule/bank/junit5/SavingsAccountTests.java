package ch.schule.bank.junit5;

import ch.schule.Bank;
import ch.schule.SavingsAccount;



/**
 * Tests f�r die Klasse SavingsAccount.
 *
 * @author Roger H. J&ouml;rg
 * @version 1.0
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/**
 * Tests für die Klasse SavingsAccount.
 *
 * @author XXX
 * @version 1.0
 */
public class SavingsAccountTests
{
	@Test
	public void test()
	{
		long deposit = 19753;
		long withdraw = 723;
		Bank bank = new Bank();

		String id = bank.createSavingsAccount();
		bank.deposit(id, 12, deposit);
		bank.withdraw(id, 13, withdraw);

		assertEquals(deposit-withdraw, bank.getBalance(id));
	}
}

