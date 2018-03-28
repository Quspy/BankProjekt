
package Controller.Account;

import Model.Exceptions.NotEnoughMoneyEx;
import Model.Bank.Owner;
import Model.Bank.SavingAccount;
import javax.swing.JTextField;

public class SavingAccountController 
{
    SavingAccount sa;
    
    public SavingAccountController()
    {
        sa = new SavingAccount();
    }
    
    
    //**************************************************GETTERY I SETTERY**************************************************//
    //**************************************************GETTERY I SETTERY**************************************************//
    //**************************************************GETTERY I SETTERY**************************************************//
    //**************************************************GETTERY I SETTERY**************************************************//
    
    public void setOwner(Owner o)
    {
        sa.setO(o);
    }
    public Owner getOwner(Owner o)
    {
        return sa.getO();
    }
    public void setTypeId(int id)
    {
        sa.setiAccountTypeId(id);
    }
    public int getTypeId()
    {
        return sa.getiAccountTypeId();
    }
    public void setBalance(double balance)
    {
        sa.setdBalance(balance);
    }
    public double getBalance()
    {
        return sa.getdBalance();
    }
    public void setLogin(int login)
    {
        sa.setiLogin(0);
    }
    public int getLogin()
    {
        return sa.getiLogin();
    }
    public void setPassword(String password)
    {
        sa.setsPassword(password);
    }
    public String getPassword()
    {
        return sa.getsPassword();
    }
    public void setBankAccountNumber(String number)
    {
        sa.setsBankAccountNumber(number);
    }
    public String getBankAccountNumber()
    {
        return sa.getsBankAccountNumber();
    }
    public double getInterest()
    {
        return sa.getdInterest();
    }
    public void setInterest(double interest)
    {
        sa.setdInterest(interest);
    }
    //*******************************************************METODY*******************************************************//
    //*******************************************************METODY*******************************************************//
    //*******************************************************METODY*******************************************************//
    //*******************************************************METODY*******************************************************//
    
    
    public void CreateAccountNumber(JTextField RegisterPESELTxtbox,JTextField RegisterPostalCode)
    {
        sa.createAccountNumber( RegisterPESELTxtbox,RegisterPostalCode);
    }
    public void deposite(double amount)
    {
        sa.deposite(amount);
    }
    public void withdraw(double amount) throws NotEnoughMoneyEx
    {
        sa.withdraw(amount);
    }
    public void transaction(TransactionController trans) throws NotEnoughMoneyEx
    {
        sa.transaction(trans);
    }
    public void addInterest()
    {
        sa.addInterest();
    }
}
