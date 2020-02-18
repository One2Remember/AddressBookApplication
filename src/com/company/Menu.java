/**
 * @author Emmanuel Gallegos
 * @version "%I%, %G%"
 */
package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
Menu class with several prompt methods for various messages
 */
public class Menu {
    /**
     * Wrapper around System.out.println() method for shorter name
     * @param toPrint takes String and prints it to standard output with terminating newline character
     */
    private static void PRINT( String toPrint ) { System.out.println( toPrint ); }

    /**
     * Displays the main menu and returns user's choice from menu (case insensitive)
     * a : Loading from file
     * b : Adding an entry
     * c : Remove entry from system
     * d : Find an entry in the system
     * e : List all entries in system
     * f : Quit
     * x : Default (invalid entry)
     * @return char representing the user's choice
     */
    public static char getMenuChoice() {
        Scanner in = new Scanner( System.in );  // for reading user input
        char choice = 'x';  // for holding user choice
        // display menu
        PRINT( "******************************************************\n"
                + "Please enter in your menu selection:\na) Loading from a file\n"
        + "b) Addition\nc) Removal\nd) Find\ne) Listing\n\nf) Quit"
        + "\n******************************************************\n");
        // read user choice
        choice = in.next().charAt(0);
        // return user choice if valid, o/w return 'x'
        return     choice == 'a' || choice == 'A'
                || choice == 'b' || choice == 'B'
                || choice == 'c' || choice == 'C'
                || choice == 'd' || choice == 'D'
                || choice == 'e' || choice == 'E'
                || choice == 'f' || choice == 'F'
                ?  Character.toLowerCase( choice ) : 'x';
    }

    /**
     * Prints message to prompt for first name
     * @return string first name
     */
    public static String prompt_FirstName() {
        PRINT( "First Name: " );
        Scanner in = new Scanner( System.in );
        return in.nextLine();
    }

    /**
     * Prints message to prompt for last name
     * @return string
     */
    public static String prompt_LastName() {
        PRINT( "Last Name: " );
        Scanner in = new Scanner( System.in );
        return in.nextLine();
    }

    /**
     * Prints message to prompt for street name
     * @return string
     */
    public static String prompt_Street() {
        PRINT( "Street: " );
        Scanner in = new Scanner( System.in );
        return in.nextLine();
    }

    /**
     * Prints message to prompt for city name
     * @return string
     */
    public static String prompt_City() {
        PRINT( "City: " );
        Scanner in = new Scanner( System.in );
        return in.nextLine();
    }

    /**
     * Prints message to prompt for state name
     * @return string
     */
    public static String prompt_State() {
        PRINT( "State: " );
        Scanner in = new Scanner( System.in );
        return in.nextLine();
    }

    /**
     * Prints message to prompt for zip code, validates input data type as int
     * @return int
     */
    public static int prompt_Zip() {
        PRINT( "ZIP Code: " );
        Scanner in = new Scanner( System.in );
        int ret = -1;   // default return value
        while( ret == -1 )
        {
            try{
                ret = in.nextInt();
            }
            catch( InputMismatchException n ) {
                PRINT( "Invalid input, please enter an integer" );
                ret = -1;
            }
        }
        return ret;
    }

    /**
     * Prints message to prompt for telephone number
     * @return string
     */
    public static String prompt_Telephone() {
        PRINT( "Telephone #: " );
        Scanner in = new Scanner( System.in );
        return in.nextLine();
    }

    /**
     * Prints message to prompt for email address
     * @return string
     */
    public static String prompt_Email() {
        PRINT( "Email Address: " );
        Scanner in = new Scanner( System.in );
        return in.nextLine();
    }
}
