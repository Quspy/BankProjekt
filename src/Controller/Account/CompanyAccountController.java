
package Controller.Account;

import Model.Bank.CompanyAccount;
import Model.Exceptions.NotEnoughMoneyEx;
import Model.Bank.Owner;
import javax.swing.JTextField;

public class CompanyAccountController 
{
    CompanyAccount ca;
    
    public CompanyAccountController()
    {
        ca = new CompanyAccount();
    }
    //**************************************************GETTERY I SETTERY**************************************************//
    //**************************************************GETTERY I SETTERY**************************************************//
    //**************************************************GETTERY I SETTERY**************************************************//
    //**************************************************GETTERY I SETTERY**************************************************//
    
    
    public void setOwner(Owner o)
    {
        ca.setO(o);
    }
    public Owner getOwner(Owner o)
    {
        return ca.getO();
    }
    public void setTypeId(int id)
    {
        ca.setiAccountTypeId(id);
    }
    public int getTypeId()
    {
        return ca.getiAccountTypeId();
    }
    public void setBalance(double balance)
    {
        ca.setdBalance(balance);
    }
    public double getBalance()
    {
        return ca.getdBalance();
    }
    public void setLogin(int login)
    {
        ca.setiLogin(0);
    }
    public int getLogin()
    {
        return ca.getiLogin();
    }
    public void setPassword(String password)
    {
        ca.setsPassword(password);
    }
    public String getPassword()
    {
        return ca.getsPassword();
    }
    public void setBankAccountNumber(String number)
    {
        ca.setsBankAccountNumber(number);
    }
    public String getBankAccountNumber()
    {
        return ca.getsBankAccountNumber();
    }
    public double getInterest()
    {
        return ca.getdInterest();
    }
    
    //*******************************************************METODY*******************************************************//
    //*******************************************************METODY*******************************************************//
    //*******************************************************METODY*******************************************************//
    //*******************************************************METODY*******************************************************//
    
    
    public void CreateAccountNumber(JTextField RegisterPESELTxtbox,JTextField RegisterPostalCode)
    {
        ca.createAccountNumber(RegisterPESELTxtbox,RegisterPostalCode);
    }
    public void deposite(double amount)
    {
        ca.deposite(amount);
    }
    public void withdraw(double amount) throws NotEnoughMoneyEx
    {
        ca.withdraw(amount);
    }
    public void transaction(TransactionController trans) throws NotEnoughMoneyEx
    {
        ca.transaction(trans);
    }
    
}
