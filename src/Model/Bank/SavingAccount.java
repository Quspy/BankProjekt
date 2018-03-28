
package Model.Bank;

public class SavingAccount extends BankAccount implements Savings
{
    private double dInterest = 0.05;
    private int SavingAccountId;

    
    public SavingAccount()
    {
        super();
        this.SavingAccountId = 1;
    }

    public double getdInterest() 
    {
        return dInterest;
    }
    public void setdInterest(double interest)
    {
        this.dInterest =interest;
    }
    public int getSavingAccountId() 
    {
        return SavingAccountId;
    }
    
    @Override
    public void addInterest() 
    {
       double bal =this.getdBalance();
       double interest = bal*dInterest;
       this.setdBalance(interest);
    }
}
