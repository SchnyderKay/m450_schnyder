package ch.schule.bank.junit5;

import ch.schule.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


/**
 * Tests für die Klasse Account.
 *
 * @author xxxx
 * @version 1.0
 */
public class AccountTests {
    /**
     * Tested die Initialisierung eines Kontos.
     */
    @Test
    public void testInit() {
        Bank bank = new Bank();
        String savingId = bank.createSavingsAccount();
        String youthId = bank.createSalaryAccount(1000);
        String salaryId = bank.createPromoYouthSavingsAccount();

        assertNotEquals(salaryId, youthId, savingId);
    }

    /**
     * Testet das Einzahlen auf ein Konto.
     */
    @Test
    public void testDeposit() {
        long deposit = 10000;
        Bank bank = new Bank();
        String id = bank.createSavingsAccount();

        bank.deposit(id, 12, deposit);

        assertEquals(deposit, bank.getBalance(id));
    }

    /**
     * Testet das Abheben von einem Konto.
     */
    @Test
    public void testWithdraw()
    {
        long deposit = 19753;
        long withdraw = 723;
        Bank bank = new Bank();

        String id = bank.createSavingsAccount();
        bank.deposit(id, 12, deposit);
        bank.withdraw(id, 13, withdraw);

        assertEquals(deposit-withdraw, bank.getBalance(id));
    }

    /**
     * Tests the reference from SavingsAccount
     */
    @Test
    public void testReferences() {
        Bank bank = new Bank();

        String id = bank.createSavingsAccount();
        Account account = new PromoYouthSavingsAccount(id);

        assertEquals(account.getId(), id);
    }

    /**
     * teste the canTransact Flag
     */
    @Test
    public void testCanTransact()
    {
        Bank bank = new Bank();

        String id = bank.createSavingsAccount();
        Account account = new PromoYouthSavingsAccount(id);

        assertTrue(account.canTransact(12));
    }

    /**
     * Experimente mit print().
     */
    @Test
    public void testPrint()
    {
        long deposit = 19753;
        Bank bank = new Bank();

        String id = bank.createSavingsAccount();
        bank.deposit(id, 12, deposit);

        bank.print(id);
    }

    /**
     * Experimente mit print(year,month).
     */
    @Test
    public void testMonthlyPrint()
    {
        long deposit = 19753;
        Bank bank = new Bank();

        String id = bank.createSavingsAccount();
        bank.deposit(id, 200, deposit);

        bank.print(id, 2005, 12);
    }

}
