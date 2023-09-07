package ch.schule.bank.junit5;

import ch.schule.Bank;
import ch.schule.PromoYouthSavingsAccount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * Tests für das Promo-Jugend-Sparkonto.
 *
 * @author XXXX
 * @version 1.0
 */
public class PromoYouthSavingsAccountTests
{
	/**
	 * Der Test.
	 */
	@Test
	public void test()
	{
		long deposit = 19753;
		Bank bank = new Bank();

		String id = bank.createPromoYouthSavingsAccount();
		bank.deposit(id, 12, deposit);

		assertEquals(deposit + deposit/100, bank.getBalance(id));
	}
}
