package com.company;

/**
Menu class with several prompt methods for various
 */
public class Menu {
    private static void PRINT( String toPrint ) { System.out.println( toPrint ); }
    public static void prompt_FirstName() { PRINT( "First Name: " ); }
    public static void prompt_LastName() { PRINT( "Last Name: " ); }
    public static void prompt_Street() {
        PRINT( "Street: " );
    }
    public static void prompt_City() {
        PRINT( "City: " );
    }
    public static void prompt_State() {
        PRINT( "State: " );
    }
    public static void prompt_Zip() {
        PRINT( "ZIP Code: " );
    }
    public static void prompt_Telephone() {
        PRINT( "Telephone #: " );
    }
    public static void prompt_Email() {
        PRINT( "Email Address: " );
    }
}
