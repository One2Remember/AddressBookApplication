/**
 * @author Emmanuel Gallegos
 * @version "%I%, %G%"
 */
package com.company;
import java.util.*;

/**
 * Outlines main class, containing address book application. As of now, main method
 * merely creates a new instance of address book, and calls an init method to test
 * the address book by creating two dummy entries and adding them to the book
 */
public class AddressBookApplication {

    /**
     * creates instance of addressBook and initializes it to contain two sorted entries
     * @param args  array of command line String arguments
     */
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        addressBook.readFromFile( "AddressInputDataFile.txt" );
        addressBook.list();

    }


}
