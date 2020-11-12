/*Programmer: Austin Parker  Date: Oct. 30, 2020
 * Description: The user will enter two separate strings. The program
 * will compare both strings and determine if second string is a
 * substring of first string. Then display if it is or not.*/

import java.util.Scanner;

public class PatternMatching {
    public static void main(String[] args) {
        /*welcomes user*/
        System.out.println("\nWelcome to the Pattern Matching application. The program will ask you to enter two separate strings.\n" +
                "If the second string you enter happens to be a substring match of the first string, \nthe program will output " +
                "where the substring starts. Otherwise, \nthe program will notify you there is no match." +
                "\n\nIf you would like to start the program, input \"y\" below followed by enter, otherwise input \"n\" and enter.");
        /*declare scanner*/
        Scanner input = new Scanner(System.in);
        String startProgram = input.nextLine().toLowerCase();

        if (startProgram.equals("y")) {
            /*ask user for first string*/
            System.out.println("Enter first String:  ");
            /*stores user input to str1*/
            String str1 = input.nextLine();
            /*ask user for second string*/
            System.out.println(" Enter second String:  ");
            /*stores user input to str2*/
            String str2 = input.nextLine();
            /*stores return value of matchString to stringMatched variable*/
            int stringMatched = matchString(str1, str2);
            /*if statement to confirm stringMatched var is not equal to zero*/
            if (stringMatched != 0) {
                System.out.println("Matched at index " + stringMatched);
            } else System.out.println("Second String is not a substring match of first String.");
        } else {
            /*exits program early if user does not enter "y" to start program*/
            System.out.println("Thanks for opening my application. Have a Great Day!");
            System.exit(0);
        }
    }/*end of main*/

    public static int matchString(String string1, String string2) {
        /*loop iterates from zero to length of string1*/
        for (int k = 0; k < string1.length(); k++) {
            int j = 0;
            /*loop iterates from k to length of string1*/
            for (int i = k; i < string1.length(); i++) {
                /*compares j to string2 length*/
                if (j == string2.length()) {
                    return (i - string2.length());
                } else {
                    /*compares the i value of string1 to j value from string2 for equality*/
                    if (string1.charAt(i) == string2.charAt(j)) {
                        j++;
                    }
                    /*else breaks out of the loop*/
                    else {
                        break;
                    }
                }
            }/*end of inner for loop*/
        }/*end of outer for loop*/
        return 0;
    }/*end of method*/
}/*end of PatternMatching class*/