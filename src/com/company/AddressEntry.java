package com.company;

/**
 * AddressEntry class, describes contents of a single AddressEntry for use in AddressBook
 */
public class AddressEntry {
    // All fields in AddressEntry are Strings with intuitive characteristics
    String firstName, lastName, street, city, state, zip, phone, email;

    /**
     * default Constructor defines generic AddressEntry
     */
    public AddressEntry()
    {
        firstName = "Allison";
        lastName = "Jennings";
        street = "Monrovia Ave";
        city = "Cincinnati";
        state = "Washington";
        zip = "97202";
        phone = "555-321-9876";
        email = "a.jennings.1994@gmail.com";
    }

    /**
     * Constructor allows for initialization of all AddressEntry fields
     * @param fn
     * @param ln
     * @param str
     * @param ci
     * @param sta
     * @param zc
     * @param pn
     * @param em
     */
    public AddressEntry( String fn, String ln, String str, String ci, String sta, String zc, String pn, String em )
    {
        firstName = fn;
        lastName = ln;
        street = str;
        city = ci;
        state = sta;
        zip = zc;
        phone = pn;
        email = em;
    }

    /**
     * returns data from this object as neatly formatted String
     * @return
     */
    public String toString()
    {
        return lastName + ", " + firstName + '\n' + street + '\n' + city + ", " + state + ", " + zip
                + '\n' + phone + '\n' + email;
    }

    // Setters defined below for all String fields of AddressEntry
    public void setFirstName( String str )
    {
        firstName = str;
    }
    public void setLastName( String str )
    {
        lastName = str;
    }
    public void setStreet( String str )
    {
        street = str;
    }
    public void setCity( String str )
    {
        city = str;
    }
    public void setState( String str )
    {
        state = str;
    }
    public void setZip( String str )
    {
        zip = str;
    }
    public void setPhone( String str )
    {
        phone = str;
    }
    public void setEmail( String str )
    {
        email = str;
    }

    // Getters defined below for all String fields in AddressEntry
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public String getStreet()
    {
        return street;
    }
    public String getCity()
    {
        return city;
    }
    public String getState()
    {
        return state;
    }
    public String getZip()
    {
        return zip;
    }
    public String getPhone()
    {
        return phone;
    }
    public String getEmail()
    {
        return email;
    }

}
