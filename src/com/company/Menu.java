/**
 * @author Emmanuel Gallegos
 * @version "%I%, %G%"
 */
package com.company;

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
     * Prints message to prompt for zip code
     * @return int
     */
    public static int prompt_Zip() {
        PRINT( "ZIP Code: " );
        Scanner in = new Scanner( System.in );
        return in.nextInt();
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
