
package Model.Bank;

import Controller.Account.SavingAccountController;
import Controller.Account.TransactionController;
import Model.Exceptions.NotEnoughMoneyEx;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class BankAccount implements Account
{
    private Owner o;
    private int iAccountTypeId;
    private double dBalance;
    private int iLogin;
    private String sPassword;
    private String sBankAccountNumber;
    private final String sBankAccountNrFirst = "111140156";
    
    public BankAccount()
    {
        
    }
    
    public Owner getO() 
    {
        return o;
    }

    public void setO(Owner o)
    {
        this.o = o;
    }

    public int getiAccountTypeId() 
    {
        return iAccountTypeId;
    }

    public void setiAccountTypeId(int iAccountTypeId)
    {
        this.iAccountTypeId = iAccountTypeId;
    }

    public double getdBalance() 
    {
        return dBalance;
    }

    public void setdBalance(double dBalance) 
    {
        this.dBalance = dBalance;
    }

    public int getiLogin() 
    {
        return iLogin;
    }

    public void setiLogin(int iLogin) 
    {
        this.iLogin = iLogin;
    }

    public String getsPassword() 
    {
        return sPassword;
    }

    public void setsPassword(String sPassword) 
    {
        this.sPassword = sPassword;
    }

    public String getsBankAccountNumber() 
    {
        return sBankAccountNumber;
    }

    public void setsBankAccountNumber(String sBankAccountNumber)
    {
        this.sBankAccountNumber = sBankAccountNumber;
    }
    public String getsBankAccountNrFirst() 
    {
        return sBankAccountNrFirst;
    }
    
    
    //*******************************************************METODY*******************************************************//
    //*******************************************************METODY*******************************************************//
    //*******************************************************METODY*******************************************************//
    //*******************************************************METODY*******************************************************//

    
    
    @Override
    public void deposite(double amount) 
    {
        if(amount !=0)
        {
            this.dBalance = dBalance+amount;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Deposit must be more than 0!");
        }
    }

    @Override
    public void withdraw(double amount) throws NotEnoughMoneyEx
    {
        if(this.dBalance<amount)
        {
            NotEnoughMoneyEx noMoney = new NotEnoughMoneyEx();
            noMoney.setNoMoney("There is not enought money on your account!");
            throw noMoney;
        }
        else
        {
            this.dBalance = dBalance-amount;
        }
    }

     @Override
    public void transaction(TransactionController trans) throws NotEnoughMoneyEx
    {
        if(this.dBalance<trans.getSendAmount())
        {
            NotEnoughMoneyEx noMoney = new NotEnoughMoneyEx();
            noMoney.setNoMoney("There is not enought money on your account!");
            throw noMoney;
        }
        else
        {
            this.dBalance = dBalance - trans.getSendAmount();
            trans.setBalanceAfterSend(dBalance);
           
        }
    }
    
    
    
    public void createAccountNumber(JTextField RegisterPESELTxtbox,JTextField RegisterPostalCode)
    {
      
        this.sBankAccountNumber = sBankAccountNrFirst+RegisterPESELTxtbox.getText()+RegisterPostalCode.getText();
    }
    
    public void createAccountNumber(String pesel ,String postalCode)
    {
      
        this.sBankAccountNumber = sBankAccountNrFirst+pesel+postalCode;
    }

}
