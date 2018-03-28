
package Controller.DB;

import Controller.Account.SavingAccountController;
import Controller.Account.TransactionController;
import Controller.Owner.OwnerController;
import Model.DB.DBConnection;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class DBConnectionController 
{
    
    DBConnection dbao;

    public DBConnectionController()
    {
        dbao = new DBConnection();
    }
    public void connectShowTable(String pesel)
    {
        dbao.connectShowInTable(pesel);
    }
    public void connectGetTransactAccountData(TransactionController trans)
    {
        dbao.connectGetTransactAccountData(trans);
    }
    public void connectSaveTransaction(TransactionController trans,String pesel)
    {
        dbao.connectSaveTransaction(trans,pesel);
    }
    public void connectGetAccountData(SavingAccountController sac,String login)
    {
        dbao.connectGetAccountData(sac, login);
    }
    public void connectSaveOwnerBalanceTransaction(TransactionController trans,String accNumb)
    {
        dbao.connectSaveOwnerBalanceTransaction(trans, accNumb);
    }
    public void connectWithdrawOwnerMoney(SavingAccountController sac,String pesel)
    {
        dbao.connectWithdrawOwnerMoney(sac, pesel);
    }
    public void connectSaveOwnerBalance(SavingAccountController sac,String pesel)
    {
        dbao.connectSaveOwnerBalance(sac,pesel);
    }
    public void connectAccountGetBalanceAndNumber(SavingAccountController sac,JTextField AccountPeselTxtbox)
    {
        dbao.connectAccountGetBalanceAndNumber(sac, AccountPeselTxtbox);
    }
    public void connectGetOwnerData(OwnerController o, String pesel)
    {
        dbao.connectGetOwnerData(o, pesel);
    }
    public void connectAccountDelete(JTextField AccountPeselTxtbox)
    {
        dbao.connectAccountDelete(AccountPeselTxtbox);
    }
    public DBConnection connectSaveOwnerAccount(JTextField RegisterPESELTxtbox,JTextField RegisterPostalCodeTxtbox,
    JTextField RegisterFirstNameTxtbox,int AccountType,JTextField RegisterLoginTxtbox,JPasswordField RegisterPasswordTxtbox)
    {
        dbao.connectSaveOwnerAccount(RegisterPESELTxtbox, RegisterPostalCodeTxtbox, RegisterFirstNameTxtbox, AccountType, RegisterLoginTxtbox, RegisterPasswordTxtbox);
        return null;
    }
    public boolean checkUser(JTextField LoginUsernameTextbox,JPasswordField LoginPasswordTextbox,JTextField LoginPeselTxtbox1)
    {
        return dbao.checkUeser(LoginUsernameTextbox, LoginPasswordTextbox,LoginPeselTxtbox1);
    }
}
