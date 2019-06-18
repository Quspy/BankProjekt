
package Model.DB;

import Controller.Account.SavingAccountController;
import Controller.Account.TransactionController;
import Controller.Owner.OwnerController;
import static View.RegisterFrame.RegisterCityTxtbox;
import static View.RegisterFrame.RegisterHouseNumberTxtbox;
import static View.RegisterFrame.RegisterLastNameTxtbox;
import static View.RegisterFrame.RegisterStreetTxtbox;
import static View.TransactionHistory.table;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;




public class DBConnection 
{
    
    
    
    
    public void connectShowInTable(String pesel)
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_projekt","root","pass");
            
            String query = "select * from banktransaction where OwnerPesel ='"+pesel+"'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next())
            {     
                String AccountNumber =rs.getString("AccountNumber");
                String OwnerName = rs.getString("OwnerName");
                String OwnerLastName = rs.getString("OwnerLastName");
                String SendedAmount = rs.getString("SendedAmount");
                String BalanceAfterTransaction = rs.getString("BalanceAfterTransaction");
                String SendDate = rs.getString("SendDate");
                Object[] content = {AccountNumber,OwnerName,OwnerLastName,SendedAmount,BalanceAfterTransaction,SendDate};
                DefaultTableModel model = (DefaultTableModel)table.getModel();
                model.addRow(content);
            } 
        } 
        catch (ClassNotFoundException | SQLException ex) 
        {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void connectSaveTransaction(TransactionController trans,String pesel)
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_projekt","root","pass");
            
            PreparedStatement pstmt = con.prepareStatement("Insert into banktransaction values(?,?,?,?,?,?,?)");
            pstmt.setString(1,trans.getReceiverAccountNumber());
            pstmt.setString(2,trans.getReceiverName());
            pstmt.setString(3,trans.getReceiverLastName());
            pstmt.setString(4,String.valueOf(trans.getSendAmount()));
            pstmt.setString(5,String.valueOf(trans.getBalanceAfterSend()));
            pstmt.setString(6,String.valueOf(trans.getDate()));
            pstmt.setString(7,pesel);
            
            pstmt.execute();
        } 
        catch (SQLException | ClassNotFoundException ex) 
        {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void connectGetTransactAccountData(TransactionController trans)
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_projekt","root","pass");
            String accNumb =String.valueOf(trans.getReceiverAccountNumber());
            String query = "select * from bankaccount join accountowner on(bankaccount.OwnerPesel = accountowner.OwnerPesel)where bankaccount.AccountNumber = '"+accNumb+"'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next())
            {     
                trans.setReceiverName(rs.getString("OwnerName"));
                trans.setReceiverLastName(rs.getString("OwnerLastName"));
            }
            st.close();
        } 
        catch (SQLException | ClassNotFoundException ex) 
        {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void connectGetAccountData(SavingAccountController sac,String login)
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_projekt","root","pass");
            
            String query = "Select*from bankaccount where OwnerPesel ='"+login+"'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next())
            {     
                sac.setBalance(Double.parseDouble(rs.getString("AccountBalance")));
                sac.setTypeId(Integer.parseInt(rs.getString("AccountTypeId")));
            }
            st.close();
        } 
        catch (SQLException | ClassNotFoundException ex) 
        {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void connectWithdrawOwnerMoney(SavingAccountController sac,String login)
    {
        try
        {
            double balance = sac.getBalance();
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_projekt","root","pass");
            PreparedStatement pstmt = con.prepareStatement("UPDATE bankaccount SET AccountBalance = ? WHERE OwnerPesel = '"+login+"'");
            pstmt.setString(1,String.valueOf(balance));
            pstmt.execute();
        } 
        catch (ClassNotFoundException | SQLException ex) 
        {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void connectSaveOwnerBalance(SavingAccountController sac,String pesel)
    {
        try 
        {
            double balance =sac.getBalance();
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_projekt","root","pass");
            PreparedStatement pstmt = con.prepareStatement("UPDATE bankaccount SET AccountBalance = AccountBalance+ ? WHERE OwnerPesel = '"+pesel+"'");
            pstmt.setString(1,String.valueOf(balance));
            pstmt.execute();
        } 
        catch (ClassNotFoundException | SQLException ex) 
        {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    public void connectSaveOwnerBalanceTransaction(TransactionController trans,String accNumb)
    {
        try 
        {
            double balance =trans.getSendAmount();
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_projekt","root","pass");
            PreparedStatement pstmt = con.prepareStatement("UPDATE bankaccount SET AccountBalance = AccountBalance+ ? WHERE AccountNumber = '"+accNumb+"'");
            pstmt.setString(1,String.valueOf(balance));
            pstmt.execute();
        } 
        catch (ClassNotFoundException | SQLException ex) 
        {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    public void connectGetOwnerData(OwnerController o,String pesel)
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_projekt","root","pass");
            
            String query = "Select*from accountowner where OwnerPesel ='"+pesel+"'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next())
            {     
                o.setsFirstNameController(rs.getString("OwnerName"));
                o.setsLastNameController(rs.getString("OwnerLastName"));
                o.setsPeselController(rs.getString("OwnerPesel"));
                o.setsStreetController(rs.getString("OwnerStreet"));
                o.setsHouseNumberController(rs.getString("OwnerHouseNumber"));
                o.setiPostalCodeController(rs.getInt("OwnerPostalCode"));
                o.setsCityController(rs.getString("OwnerCity"));

            }
            st.close();
        } 
        catch (SQLException | ClassNotFoundException ex) 
        {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void connectAccountGetBalanceAndNumber(SavingAccountController sac,JTextField AccountPeselTxtbox1)
    {
        try
        {
            String pesel = AccountPeselTxtbox1.getText();
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_projekt","root","pass");

            String query ="select*from bankaccount where OwnerPesel = '"+pesel+"' ";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next())
            {     
                sac.setBalance(rs.getDouble("AccountBalance"));
                sac.setBankAccountNumber(rs.getString("AccountNumber"));
            }
            st.close();
        } 
        catch (ClassNotFoundException | SQLException ex) 
        {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void connectAccountDelete(JTextField AccountPeselTxtbox)
    {
        try
        {
            String pesel = AccountPeselTxtbox.getText();
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_projekt","root","pass");

            PreparedStatement pstmt = con.prepareStatement("delete from accountowner where OwnerPesel = '"+pesel+"' ");
            pstmt.executeUpdate();
        } 
        catch (ClassNotFoundException | SQLException ex) 
        {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
  public void connectSaveOwnerAccount(JTextField RegisterPESELTxtbox,JTextField RegisterPostalCodeTxtbox,
  JTextField RegisterFirstNameTxtbox,int AccountType,JTextField RegisterLoginTxtbox,JPasswordField RegisterPasswordTxtbox)
  {
      
        String ban = "1111401560"+RegisterPESELTxtbox.getText()+RegisterPostalCodeTxtbox.getText();
        try
        {
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_projekt","root","pass");
            PreparedStatement pstmt = con.prepareStatement("INSERT INTO accountowner VALUES(?,?,?,?,?,?,?)");
            pstmt.setString(1,RegisterFirstNameTxtbox.getText());
            pstmt.setString(2,RegisterLastNameTxtbox.getText());
            pstmt.setString(3,String.valueOf(RegisterPESELTxtbox.getText()));
            pstmt.setString(4,RegisterStreetTxtbox.getText());
            pstmt.setString(5,String.valueOf(RegisterHouseNumberTxtbox.getText()));
            pstmt.setString(6,String.valueOf(RegisterPostalCodeTxtbox.getText()));
            pstmt.setString(7,RegisterCityTxtbox.getText());
            pstmt.execute();
                           
            String insertIntoAccount = "INSERT INTO bankaccount VALUES(?,?,?,?,?,?)";
            pstmt = con.prepareStatement(insertIntoAccount);
            pstmt.setString(1,String.valueOf(RegisterPESELTxtbox.getText()));
            pstmt.setString(2,String.valueOf(AccountType));
            pstmt.setString(3,String.valueOf(0.00));
            pstmt.setString(4,RegisterLoginTxtbox.getText());
            pstmt.setString(5,String.valueOf(RegisterPasswordTxtbox.getPassword()));
            pstmt.setString(6,ban);
            pstmt.execute();
        }
        catch(HeadlessException | ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
  
  
  public boolean checkUeser(JTextField LoginUsernameTextbox,JPasswordField LoginPasswordTextbox,JTextField LoginPeselTxtbox1)
  {
       String login = LoginUsernameTextbox.getText();
       String password = String.valueOf(LoginPasswordTextbox.getPassword());
       String pesel = LoginPeselTxtbox1.getText();
        try 
        {
          Class.forName("com.mysql.jdbc.Driver");
          Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_projekt","root","pass");
          
          PreparedStatement pstmt = con.prepareStatement("select * from bankaccount where AccountLogin =? and AccountPassword=? and OwnerPesel = ?");
          pstmt.setString(1, login);
          pstmt.setString(2, password);
          pstmt.setString(3, pesel);
          pstmt.execute();
          while(pstmt.getResultSet().next())
          {
             
              return true;
          }
           con.close();
        }
        catch (ClassNotFoundException | SQLException ex) 
        {
          Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
         
        }
        return false;
    }
}
