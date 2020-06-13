package account;

/**
 *
 * @author CahyoDwi
 */
public class CheckingAccount extends Account {
    protected double defaultValue = 1.0;
    private double overdraftProtection, saldo;
    
    public CheckingAccount(double balance) {
        this(balance, -0.1);
    }
    
    public CheckingAccount(double balance, double protect) {
        super(balance);
        overdraftProtection = balance;
        saldo = balance + overdraftProtection;
    }
    
    @Override
    public boolean withdraw(double amt) {
        if ((getBalance()-amt)>=0.0) {
            super.withdraw(amt);
            return true;
        } else {
            if (overdraftProtection == 1.0) {
                return false;
            } else {
                setBalance(0.0);
                overdraftProtection = amt - getBalance();
                return true;
            }
        }
    }
}
