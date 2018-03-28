
package Model.Bank;

//import java.sql.Date;
//import java.util.Date;
public class Owner 
{
    private String sFirstName;
    private String sLastName;
    private String sPesel;
    private String sStreet;
    private String sHouseNumber;
    private int iPostalCode;
    private String sCity;
//    private Date sBirthDate;
    
    public Owner()
    {
        
    }
    public Owner(String sFirstName,String sLastName,String sPesel, String sStreet, String sHouseNumber,int iPostalCode, String sCity)
    {
        this.sFirstName = sFirstName;
        this.sLastName = sLastName;
        this.sPesel = sPesel;
        this.sStreet = sStreet;
        this.sHouseNumber = sHouseNumber;
        this.iPostalCode = iPostalCode;
        this.sCity = sCity;
//        this.sBirthDate = sBirthDate;
    }
    public String getsFirstName() 
    {
        return sFirstName;
    }

    public void setsFirstName(String sFirstName) 
    {
        this.sFirstName = sFirstName;
    }

    public String getsLastName() 
    {
        return sLastName;
    }

    public void setsLastName(String sLastName) 
    {
        this.sLastName = sLastName;
    }

    public String getsPesel() 
    {
        return sPesel;
    }

    public void setsPesel(String sPesel) 
    {
        this.sPesel = sPesel;
    }

    public String getsStreet() 
    {
        return sStreet;
    }

    public void setsStreet(String sStreet) 
    {
        this.sStreet = sStreet;
    }

    public String getsHouseNumber() 
    {
        return sHouseNumber;
    }

    public void setsHouseNumber(String sHouseNumber) 
    {
        this.sHouseNumber = sHouseNumber;
    }

    public int getiPostalCode() 
    {
        return iPostalCode;
    }

    public void setiPostalCode(int iPostalCode) 
    {
        this.iPostalCode = iPostalCode;
    }

    public String getsCity() 
    {
        return sCity;
    }

    public void setsCity(String sCity) 
    {
        this.sCity = sCity;
    }
}
