/**
 * @author Emmanuel Gallegos
 * @version "%I%, %G%"
 */
package com.company;

/**
Menu class with several prompt methods for various messages
 */
public class Menu {
    /**
     *
     * @param toPrint takes String and prints it to standard output with terminating newline character
     */
    private static void PRINT( String toPrint ) { System.out.println( toPrint ); }

    /**
     * Prints message to prompt for first name
     */
    public static void prompt_FirstName() { PRINT( "First Name: " ); }

    /**
     * Prints message to prompt for last name
     */
    public static void prompt_LastName() { PRINT( "Last Name: " ); }

    /**
     * Prints message to prompt for street name
     */
    public static void prompt_Street() {
        PRINT( "Street: " );
    }

    /**
     * Prints message to prompt for city name
     */
    public static void prompt_City() {
        PRINT( "City: " );
    }

    /**
     * Prints message to prompt for state name
     */
    public static void prompt_State() {
        PRINT( "State: " );
    }

    /**
     * Prints message to prompt for zip code
     */
    public static void prompt_Zip() {
        PRINT( "ZIP Code: " );
    }

    /**
     * Prints message to prompt for telephone number
     */
    public static void prompt_Telephone() {
        PRINT( "Telephone #: " );
    }

    /**
     * Prints message to prompt for email address
     */
    public static void prompt_Email() {
        PRINT( "Email Address: " );
    }
}
