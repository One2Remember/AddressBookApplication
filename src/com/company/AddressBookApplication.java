package com.company;

/**
 * Outlines main class, containing address book application. As of now, main method
 * merely creates a new instance of address book, and calls an init method to test
 * the address book by creating two dummy entries and adding them to the book
 */
public class AddressBookApplication {

    /**
     * creates instance of addressBook and intializes it to contain two sorted entries
     * @param args
     */
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        addressBook.init( "AddressInputDataFile.txt" );
        addressBook.list();
    }


    /**
     * Creates two instances of AddressEntries and adds them to param ab using ab's add method
     * @param ab
     */
    public static void initAddressBookExercise( AddressBook ab )
    {
        // create two instances of AddressEntries then add them to ab using the add method
        AddressEntry entry1 = new AddressEntry( "Emmanuel", "Gallegos", "Bermuda Ave", "San Leandro",
                "CA", "94577", "510-566-9569", "oh_bother@att.net" );
        AddressEntry entry2 = new AddressEntry( "Fina", "Perez", "Bermuda Ave", "San Leandro", "CA",
                "94577", "510-919-9520", "fi4integrity@gmail.com" );

        // add two entries to given address book (unsorted last names, to demonstrated add sorts properly)
        ab.add( entry2 );
        ab.add( entry1 );

        // call ab.list()
        ab.list();
    }
}
