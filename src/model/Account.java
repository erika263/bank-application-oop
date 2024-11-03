package model;

import exceptions.InsufficientAmountException;

/**
 *  @author Erika Castro
 *  Email : erika.contax@gmail.com
 */

public class Account {
    private User holder = new User();
    private double balance;

    public Account(){

    }

    public Account(User holder, double balance) {
        this.holder = holder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "holder=" + holder +
                ", balance=" + balance +
                '}';
    }

    public void deposit(double amount) throws InsufficientAmountException {
        try {
            if(amount <= 0){
                throw new InsufficientAmountException(amount);
            }
            balance += amount;
        } catch (InsufficientAmountException e) {
            System.err.println("Error: Negative or Zero Amount");
            throw e;
        }
    }

    /**
     * Withdraws a given amount from the bank account
     * matches the one given and the balance is sufficient.
     *
     * @param amount the amount to be withdrawn
     * @throws InsufficientAmountException if the amount is greater than the current balance
     * @throws InsufficientAmountException if the amount is zero or negative
     */
    public void withdraw(double amount)
            throws InsufficientAmountException {
        try {
            if(amount <= 0) throw new InsufficientAmountException(amount);
            if(amount > balance) throw new InsufficientAmountException(amount);

            balance -= amount;

        } catch (InsufficientAmountException  e){
            // Would be better to have more catch statements and have exception specific err messages
            System.err.println("Error: Insufficient balance.");
            throw e;
        }
    }
}
