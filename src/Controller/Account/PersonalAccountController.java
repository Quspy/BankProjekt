
package Controller.Account;

import Model.Exceptions.NotEnoughMoneyEx;
import Model.Bank.Owner;
import Model.Bank.PersonalAccount;
import javax.swing.JTextField;

public class PersonalAccountController 
{
    PersonalAccount pa;
    
    public PersonalAccountController()
    {
        pa = new PersonalAccount();
    }
    //**************************************************GETTERY I SETTERY**************************************************//
    //**************************************************GETTERY I SETTERY**************************************************//
    //**************************************************GETTERY I SETTERY**************************************************//
    //**************************************************GETTERY I SETTERY**************************************************//
    
    
    public void setOwner(Owner o)
    {
        pa.setO(o);
    }
    public Owner getOwner(Owner o)
    {
        return pa.getO();
    }
    public void setTypeId(int id)
    {
        pa.setiAccountTypeId(id);
    }
    public int getTypeId()
    {
        return pa.getiAccountTypeId();
    }
    public void setBalance(double balance)
    {
        pa.setdBalance(balance);
    }
    public double getBalance()
    {
        return pa.getdBalance();
    }
    public void setLogin(int login)
    {
        pa.setiLogin(0);
    }
    public int getLogin()
    {
        return pa.getiLogin();
    }
    public void setPassword(String password)
    {
        pa.setsPassword(password);
    }
    public String getPassword()
    {
        return pa.getsPassword();
    }
    public void setBankAccountNumber(String number)
    {
        pa.setsBankAccountNumber(number);
    }
    public String getBankAccountNumber()
    {
        return pa.getsBankAccountNumber();
    }
    public double getInterest()
    {
        return pa.getdInterest();
    }
    
    //*******************************************************METODY*******************************************************//
    //*******************************************************METODY*******************************************************//
    //*******************************************************METODY*******************************************************//
    //*******************************************************METODY*******************************************************//
    
    
    public void CreateAccountNumber(JTextField RegisterPESELTxtbox,JTextField RegisterPostalCode)
    {
        pa.createAccountNumber(RegisterPESELTxtbox,RegisterPostalCode);
    }
    public void deposite(double amount)
    {
        pa.deposite(amount);
    }
    public void withdraw(double amount) throws NotEnoughMoneyEx
    {
        pa.withdraw(amount);
    }
    public void transaction(TransactionController trans) throws NotEnoughMoneyEx
    {
        pa.transaction(trans);
    }
    
}
