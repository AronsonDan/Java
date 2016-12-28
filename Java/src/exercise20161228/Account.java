/**
 * 
 */
package exercise20161228;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dan Aronson
 *
 */
public class Account {

    private double balance;
    private List<String> log = new ArrayList<String>();

    /**
     * @return the balance
     */
    public double getBalance() {
	return this.balance;
    }

    /**
     * @return the log
     */
    public List<String> getLog() {
	return this.log;
    }

    /**
     * @param balance
     *            the balance to set
     */
    private void setBalance(double balance) {
	this.balance = balance;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return String.format("Account [balance=%s, log=%s]", this.balance, this.log);
    }

    /**
     * Receives an double and increment the balance member
     * 
     * @param amount
     *            - the amount that the balance will be incremented by
     */
    public void deposit(double amount) {
	this.setBalance(this.getBalance() + amount);
	String s = String.format("Deposit[%s]", amount);
	this.log.add(s);
    }

    /**
     * Receives an double and decrease the balance member
     * 
     * @param amount
     *            - the amount that the balance will be decreased by
     */
    public void withdraw(double amount) {
	this.balance -= amount;
	String s = String.format("withdraw[%s]", amount);
	this.log.add(s);
    }
}
