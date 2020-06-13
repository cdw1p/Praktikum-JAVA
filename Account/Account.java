package account;

/**
 *
 * @author CahyoDwi
 */
public class Account {
    private double balance;
    
    public Account(double initbalance) {
        balance = initbalance;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public boolean deposit(double amt) {
        balance = balance + amt;
        return true;
    }
    
    public boolean withdraw(double amt) {
        balance = balance - amt;
        return true;
    }
    
    public boolean setBalance(double amt) {
        balance = amt;
        return true;
    }
}
