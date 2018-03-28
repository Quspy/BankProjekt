
package Model.Bank;

public class PersonalAccount extends BankAccount implements Savings
{
    private final double dInterest = 0.01;
    private final int PersonalAccountId;
    public PersonalAccount()
    {
        super();
        this.PersonalAccountId = 01;
    }

    public double getdInterest() {
        return dInterest;
    }

    public int getPersonalAccountId() {
        return PersonalAccountId;
    }
    
    @Override
    public void addInterest() 
    {
        double balance = this.getdBalance();
        double multi = balance*this.dInterest;
        this.deposite(multi);
    }
    
}
