
package Controller.Account;

import Model.Bank.Transaction;
import java.sql.Date;

public class TransactionController 
{
    Transaction t;
    
    public TransactionController()
    {
        t = new Transaction();
    }
    public Date getDate()
    {
        return t.getDate();
    }
     public String getReceiverName() 
     {
        return t.getReceiverName();
    }

    public void setReceiverName(String receiverName) 
    {
        t.setReceiverName(receiverName);
    }

    public String getReceiverLastName() 
    {
        return t.getReceiverLastName();
    }

    public void setReceiverLastName(String receiverLastName) 
    {
        t.setReceiverLastName(receiverLastName);
    }

    public String getReceiverAccountNumber()
    {
        return t.getReceiverAccountNumber();
    }

    public void setReceiverAccountNumber(String receiverAccountNumber) 
    {
        t.setReceiverAccountNumber(receiverAccountNumber);
    }

    public double getSendAmount() 
    {
        return t.getSendAmount();
    }

    public void setSendAmount(double sendAmount) 
    {
        t.setSendAmount(sendAmount);
    }

    public double getBalanceAfterSend() 
    {
        return t.getBalanceAfterSend();
    }

    public void setBalanceAfterSend(double balanceAfterSend) 
    {
        t.setBalanceAfterSend(balanceAfterSend);
    }
}
