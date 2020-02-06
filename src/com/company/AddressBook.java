package com.company;

import java.util.*; // for list class utility
import java.io.*;   // for file I/O

/**
Class AddressBook defines a list of AddressEntries as well as methods to
add new entries, as well as list all current entries
 */
public class AddressBook {
    // defines list of addressEntries
    List<AddressEntry> addressEntryList = new ArrayList<>();

    /**
     * reads in data from the specified file to initialize the addressEntryList
     * for use in the AddressBookApplication
     * @param filename
     */
    void init(String filename)
    {
        // buffers for AddressEntry fields
        String firstName, lastName, street, city, state, zip, phone, email;
        boolean badData;    // bool to track if data has been properly read from file

        /*
        Try to open file and generate buffered reader to take input from filename
        then read in data from file to initialize addressEntryList
         */
        try {
            // create new buffered reader from filename parameter
            BufferedReader br = new BufferedReader(new FileReader( filename ));
            // attempt to read entries from file
            do {
                // attempt to read in data for each field
                firstName = br.readLine();
                lastName = br.readLine();
                street = br.readLine();
                city = br.readLine();
                state = br.readLine();
                zip = br.readLine();
                phone = br.readLine();
                email = br.readLine();
                // detect if any fields have not been properly read (data is bad OR eof encountered)
                badData = firstName == null ||
                        lastName == null ||
                        street == null ||
                        city == null ||
                        state == null ||
                        zip == null ||
                        phone == null ||
                        email == null;
                // if ALL fields have been read, use them to create a new AddressEntry and add it to the list
                if( !badData )
                {
                    add( new AddressEntry( firstName, lastName, street, city, state, zip, phone, email ) );
                }
            } while( !badData );    // continue as long as there may be more data
        } catch(FileNotFoundException fe) {
            System.out.println( "File not found: “+ args[0]" );
        } catch (IOException e) {
            System.out.println( "Can't read from file:" + filename );
        }
    }
    /**
     * iterate through addressEntryList and for each item call toString and print
     */
    public void list()
    {
        for (AddressEntry addressEntry : addressEntryList) {
            System.out.println(addressEntry.toString() + '\n');
        }
    }

    /**
     * add entry to list
     * @param entry
     */
    public void add( AddressEntry entry )
    {
        int indexToAdd = 0;
        /*
        while we haven't fallen off array and our entry's last name is lexicographically greater than our
        current search index's last name, advance to next index
        */
        while( indexToAdd < addressEntryList.size() &&
                entry.lastName.compareTo( addressEntryList.get( indexToAdd ).getLastName() ) > 0 )
        {
            indexToAdd++;
        }
        /*
        if we haven't hit the end of the list, and the two last names are identical,
        search according to first name as well
        */
        if( indexToAdd != addressEntryList.size() &&
                entry.lastName.compareTo( addressEntryList.get( indexToAdd ).getLastName() ) == 0 )
        {
            while( indexToAdd < addressEntryList.size() &&
                    entry.firstName.compareTo( addressEntryList.get( indexToAdd ).getFirstName() ) > 0 )
            {
                indexToAdd++;
            }
        }
        // once appropriate position has been found, add entry to addressBook
        addressEntryList.add( indexToAdd, entry );
    }
}
