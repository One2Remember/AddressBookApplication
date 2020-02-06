package com.company;

import java.util.*; // for list class utility

/**
Class AddressBook defines a list of AddressEntries as well as methods to
add new entries, as well as list all current entries
 */
public class AddressBook {
    // defines list of addressEntries
    List<AddressEntry> addressEntryList = new ArrayList<>();


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
