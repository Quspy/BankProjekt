
package Model.Exceptions;

public class NotEnoughMoneyEx extends Exception 
{
    private String noMoney;
    
    public NotEnoughMoneyEx() 
    {
        
    }

    public NotEnoughMoneyEx(String msg) 
    {
        super(msg);
    }

    public String getNoMoney() {
        return noMoney;
    }

    public void setNoMoney(String noMoney) {
        this.noMoney = noMoney;
    }
    
}
