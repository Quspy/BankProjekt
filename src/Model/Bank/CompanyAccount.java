
package Model.Bank;

public class CompanyAccount extends BankAccount implements Savings
{
    private final double dInterest = 0.03;
    private final int CompanyAccountId;

  
    public CompanyAccount()
    {
        super();
        this.CompanyAccountId = 3;
    }
    
    public double getdInterest() {
        return dInterest;
    }

    public int getCompanyAccountId() {
        return CompanyAccountId;
    }
    
    @Override
    public void addInterest() 
    {
        double balance = this.getdBalance();
        double multi = balance*this.dInterest;
        this.deposite(multi);
    }
    
}
