
package Model.Bank;

import java.sql.Date;
import java.util.Calendar;

public class Transaction 
{
    private final Date sendDate;
    private String receiverName;
    private String receiverLastName;
    private String receiverAccountNumber;
    private double sendAmount;
    private double balanceAfterSend;
    
    public Transaction()
    {
        sendDate = new java.sql.Date(Calendar.getInstance().getTime().getTime());
    }

    public String getReceiverName() 
    {
        return receiverName;
    }

    public void setReceiverName(String receiverName) 
    {
        this.receiverName = receiverName;
    }
    
    public Date getDate()
    {
        return sendDate;
    }
    public String getReceiverLastName() 
    {
        return receiverLastName;
    }

    public void setReceiverLastName(String receiverLastName) 
    {
        this.receiverLastName = receiverLastName;
    }

    public String getReceiverAccountNumber()
    {
        return receiverAccountNumber;
    }

    public void setReceiverAccountNumber(String receiverAccountNumber)
    {
        this.receiverAccountNumber = receiverAccountNumber;
    }

    public double getSendAmount() 
    {
        return sendAmount;
    }

    public void setSendAmount(double sendAmount) 
    {
        this.sendAmount = sendAmount;
    }

    public double getBalanceAfterSend() 
    {
        return balanceAfterSend;
    }

    public void setBalanceAfterSend(double balanceAfterSend) 
    {
        this.balanceAfterSend = balanceAfterSend;
    }
    
    
}
