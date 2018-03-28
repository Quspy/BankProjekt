
package Model.Bank;

import Controller.Account.TransactionController;
import Model.Exceptions.NotEnoughMoneyEx;

public interface Account 
{
    public void deposite(double amount);
    public void withdraw(double amount)throws NotEnoughMoneyEx;
    public void transaction(TransactionController trans) throws NotEnoughMoneyEx;
}
