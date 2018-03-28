
package Controller.Fields;

import static View.AccountFrame.mad;
import static View.AccountFrameDelete.peTooLong;
import static View.AccountFrameDelete.peTooShort;
import static View.LoginFrame.lTooLong;
import static View.LoginFrame.lTooShort;
import static View.LoginFrame.pTooLong;
import static View.LoginFrame.pTooShort;
import static View.RegisterFrame.CityLong;
import static View.RegisterFrame.CityShort;
import static View.RegisterFrame.HNumberLong;
import static View.RegisterFrame.HNumberShort;
import static View.RegisterFrame.PCodeLong;
import static View.RegisterFrame.PCodeShort;
import static View.RegisterFrame.mffntl;
import static View.RegisterFrame.mffnts;
import static View.RegisterFrame.mfntl;
import static View.RegisterFrame.mfnts;
import static View.RegisterFrame.peselLong;
import static View.RegisterFrame.peselShort;
import static View.RegisterFrame.streetLong;
import static View.RegisterFrame.streetShort;
import static View.RegisterNextFrame.LoginLong;
import static View.RegisterNextFrame.LoginShort;
import static View.RegisterNextFrame.PasswordLong;
import static View.RegisterNextFrame.PasswordShort;
import static View.RegisterNextFrame.RetypePasswordLong;
import static View.RegisterNextFrame.RetypePasswordNotEqual;
import static View.RegisterNextFrame.RetypePasswordShort;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TextFieldsCorrectnessController 
{
    private boolean good = false;
    public boolean isGood() 
    {
        return good;
    }
    
    public void chechCorrectnessDeposite(JTextField DepositeField)
    {
        if(DepositeField.getText() == null)
        {
            mad.setVisible(true);
        }
        else
        {
            good = true;
        }
    }
    public void checkCorrectnessDelete(JTextField AccountLoginTextbox,JPasswordField AccountPasswordTxtbox,JTextField AccountPeselTxtbox)
    {
        if(AccountLoginTextbox.getDocument().getLength()>8)
        {
            lTooLong.setVisible(true);
        }
        else if(AccountLoginTextbox.getDocument().getLength()<8)
        {
            lTooShort.setVisible(true);
        }
        else if(AccountPasswordTxtbox.getDocument().getLength()>8)
        {
            pTooLong.setVisible(true);
        }
        else if(AccountPasswordTxtbox.getDocument().getLength()<8)
        {
            pTooShort.setVisible(true);
        }
        else if(AccountPeselTxtbox.getDocument().getLength()>11)
        {
            peTooLong.setVisible(true);
        }
        else if(AccountPeselTxtbox.getDocument().getLength()<11)
        {
            peTooShort.setVisible(true);
        }
        else
        {
            this.good = true;
        }
    }
    
    public void checkCorrectnessLogin(JTextField LoginUsernameTextbox,JPasswordField LoginPasswordTextbox)
    {
        if(LoginUsernameTextbox.getDocument().getLength()>8)
        {
            lTooLong.setVisible(true);
        }
        else if(LoginUsernameTextbox.getDocument().getLength()<8)
        {
            lTooShort.setVisible(true);
        }
        else if(LoginPasswordTextbox.getDocument().getLength()>8)
        {
            pTooLong.setVisible(true);
        }
        else if(LoginPasswordTextbox.getDocument().getLength()<8)
        {
            pTooShort.setVisible(true);
        }
        else
        {
            this.good = true;
        }
    }
    
    public void checkCorrectnessRegister(JTextField RegisterFirstNameTxtbox,
    JTextField RegisterLastNameTxtbox,JTextField RegisterPESELTxtbox,
    JTextField RegisterStreetTxtbox,JTextField RegisterHouseNumberTxtbox,
    JTextField RegisterPostalCodeTxtbox,JTextField RegisterCityTxtbox ) 
    {     
        if(RegisterFirstNameTxtbox.getDocument().getLength()>15)
        {
            mffntl.setVisible(true);
        }
        else if(RegisterFirstNameTxtbox.getDocument().getLength()<=2)
        {
            mffnts.setVisible(true);
        }
        else if(RegisterLastNameTxtbox.getDocument().getLength()>31)
        {
            mfntl.setVisible(true);
        }
        else if(RegisterLastNameTxtbox.getDocument().getLength()<=1)
        {
            mfnts.setVisible(true);
        }
        else if(RegisterPESELTxtbox.getDocument().getLength()>11)
        {
            peselLong.setVisible(true);
        }
        else if(RegisterPESELTxtbox.getDocument().getLength()<11)
        {
            peselShort.setVisible(true);
        }
        else if(RegisterStreetTxtbox.getDocument().getLength()>63)
        {
            streetLong.setVisible(true);
        }
        else if(RegisterStreetTxtbox.getDocument().getLength()<=2)
        {
            streetShort.setVisible(true);
        }
        else if(RegisterHouseNumberTxtbox.getDocument().getLength()>7)
        {
            HNumberLong.setVisible(true);
        }
        else if(RegisterHouseNumberTxtbox.getDocument().getLength()<=0)
        {
            HNumberShort.setVisible(true);
        }
        else if(RegisterPostalCodeTxtbox.getDocument().getLength()>5)
        {
            PCodeLong.setVisible(true);
        }
        else if(RegisterPostalCodeTxtbox.getDocument().getLength()<5)
        {
            PCodeShort.setVisible(true);
        }
        else if(RegisterCityTxtbox.getDocument().getLength()>32)
        {
            CityLong.setVisible(true);
        }
        else if(RegisterCityTxtbox.getDocument().getLength()<=1)
        {
            CityShort.setVisible(true);
        }
        else
        {
           this.good = true;
        }
    }
    
    public void checkCorrectnessRegisterNextFrame(JTextField RegisterPasswordTxtbox,
    JTextField RegisterRetypePasswordTxtbox,JTextField RegisterLoginTxtbox)
    {
        String pass =RegisterPasswordTxtbox.getText();
        String retypass = RegisterRetypePasswordTxtbox.getText();
        boolean t =pass.equals(retypass);
        
        if(RegisterLoginTxtbox.getDocument().getLength()>8)
        {
            LoginLong.setVisible(true);
        }
        else if(RegisterLoginTxtbox.getDocument().getLength()<8)
        {
            LoginShort.setVisible(true);
        }
        else if(RegisterPasswordTxtbox.getDocument().getLength()>8)
        {
            PasswordLong.setVisible(true);
        }
        else if(RegisterPasswordTxtbox.getDocument().getLength()<8)
        {
            PasswordShort.setVisible(true);
        }
        else if(RegisterRetypePasswordTxtbox.getDocument().getLength()>8)
        {
            RetypePasswordLong.setVisible(true);
        }
        else if(RegisterRetypePasswordTxtbox.getDocument().getLength()<8)
        {
            RetypePasswordShort.setVisible(true);
        }
        else if(!t)
        {
            RetypePasswordNotEqual.setVisible(true);
        }
        else
        {
            this.good=true;
        }
    }
}
