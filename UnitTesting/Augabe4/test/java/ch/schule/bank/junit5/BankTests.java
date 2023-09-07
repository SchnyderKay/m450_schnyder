package ch.schule.bank.junit5;

import ch.schule.Bank;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/**
 * Tests f�r die Klasse 'Bank'.
 *
 * @author xxxx
 * @version 1.0
 */
public class BankTests {
    /**
     * Tests to create new Accounts
     */
    @Test
    public void testCreate() {

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
    public void testDeposit()
    {
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
     * Experimente mit print(year, month).
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

    /**
     * Testet den Gesamtkontostand der Bank.
     */
    @Test
    public void testBalance()
    {
        long deposit = 19753;
        Bank bank = new Bank();

        String id = bank.createSavingsAccount();
        assertEquals(0, bank.getBalance(id));

        bank.deposit(id, 12, deposit);

        assertEquals(deposit, bank.getBalance(id));
    }

    /**
     * Tested die Ausgabe der "top 5" konten.
     */
    @Test
    public void testTop5()
    {
        long deposit = 19753;
        Bank bank = new Bank();

        String id = bank.createPromoYouthSavingsAccount();
        String id2 = bank.createSavingsAccount();
        String id3 = bank.createSavingsAccount();
        String id4 = bank.createSavingsAccount();
        String id5 = bank.createPromoYouthSavingsAccount();
        bank.deposit(id, 12, deposit-100);
        bank.deposit(id2, 12, 1);
        bank.deposit(id3, 12, deposit-20);
        bank.deposit(id4, 12, deposit+1209);
        bank.deposit(id5, 12, deposit);
        bank.printTop5();
}

    /**
     * Tested die Ausgabe der "top 5" konten.
     */
    @Test
    public void testBottom5() {

        long deposit = 19753;
        Bank bank = new Bank();

        String id = bank.createPromoYouthSavingsAccount();
        String id2 = bank.createSavingsAccount();
        String id3 = bank.createSavingsAccount();
        String id4 = bank.createSavingsAccount();
        String id5 = bank.createPromoYouthSavingsAccount();
        bank.deposit(id, 12, deposit-100);
        bank.deposit(id2, 12, 1);
        bank.deposit(id3, 12, deposit-20);
        bank.deposit(id4, 12, deposit+1209);
        bank.deposit(id5, 12, deposit);
        bank.printTop5();
    }

}
