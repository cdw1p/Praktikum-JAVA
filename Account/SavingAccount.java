package account;

/**
 *
 * @author CahyoDwi
 */
public class SavingAccount extends Account {
    private double interestRate;
    
    public SavingAccount(double balance, double interest_rate) {
        super(balance);
        interestRate = interest_rate;
    }
}
