
package Controller.Owner;

import Model.Bank.Owner;

public class OwnerController 
{
    Owner o;

    public OwnerController()
    {
        o = new Owner();
    }
    
    public String getsFirstNameController() 
    {
        return o.getsFirstName();
    }

    public void setsFirstNameController(String sFirstName) 
    {
        o.setsFirstName(sFirstName);
    }

    public String getsLastNameController() 
    {
        return o.getsLastName();
    }

    public void setsLastNameController(String sLastName) 
    {
        o.setsLastName(sLastName);
    }

    public String getsPeselController() 
    {
        return o.getsPesel();
    }

    public void setsPeselController(String sPesel)
    {
        o.setsPesel(sPesel);
    }

    public String getsStreetController() 
    {
        return o.getsStreet();
    }

    public void setsStreetController(String sStreet) 
    {
        o.setsStreet(sStreet);
    }

    public String getsHouseNumberController() 
    {
        return o.getsHouseNumber();
    }
    
    public void setsHouseNumberController(String iHouseNumber)
    {
        o.setsHouseNumber(iHouseNumber);
    }

    public int getiPostalCodeController()
    {
        return o.getiPostalCode();
    }

    public void setiPostalCodeController(int iPostalCode) 
    {
        o.setiPostalCode(iPostalCode);
    }

    public String getsCityController() 
    {
        return o.getsCity();
    }

    public void setsCityController(String sCity) 
    {
        o.setsCity(sCity);
    }

}
