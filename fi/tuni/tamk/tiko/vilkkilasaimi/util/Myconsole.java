package fi.tuni.tamk.tiko.vilkkilasaimi.util;

import java.io.Console;

public class Myconsole {

    Console c = System.console();

    public static int readInt(int min, int max, String errorMessageNonNumeric, String errormessageNonMinAndMax) {

        Console c = System.console();
        boolean validInput = false;
        int userInput = 0;
        System.out.println("Give a number between " + min + " and " + max);
        while (validInput == false) {
            try {
                userInput = Integer.parseInt(c.readLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println(errorMessageNonNumeric);
            }
            if (userInput < min || userInput > max) {
                validInput = false;
                System.out.println(errormessageNonMinAndMax + "[" + min + "," + max + "]");
            }
        } return userInput;
    }
}