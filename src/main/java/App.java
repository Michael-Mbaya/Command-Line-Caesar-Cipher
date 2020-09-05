//import java.io.BufferedReader;
import java.io.Console;
//import java.io.InputStreamReader;
//import java.io.StringReader;
//import java.util.Scanner;

public class App {
    public static void main(String[] args){

        DataProperties dataProperties = new DataProperties();

        Console optionConsole = System.console() ;
//        new Scanner(System.in);
        System.out.println("Choose an option");
        System.out.println("1. Encrypt");
        System.out.println("2. Decryption\n");

        String option = optionConsole.readLine();

        if ("1".equals(option)) {
            System.out.println("Enter word or letter to Encrypt\"\n");
            Console optionOneConsole = System.console();
            String OptionOne = optionOneConsole.readLine();

            System.out.println("Enter key number between (1-26) to encrypt\n");
            Console optionTwoConsole = System.console();
            String chosenNumber = optionTwoConsole.readLine();
            int chosenInt = Integer.parseInt(chosenNumber);

            dataProperties.setChosenMyText(OptionOne);
            dataProperties.setChosenInt(chosenInt);
            String enc = Encode.getDataProperties(OptionOne, chosenInt);
            String dec = Decode.getDataProperties(OptionOne, chosenInt);
            System.out.println("Encrypted: " + enc);
//            System.out.println("Decrypted: " + dec);

        } else if ("2".equals(option)) {
            System.out.println("Enter word or letter to Decrypt");
            Console optionTwoConsole = System.console();
            String optionTwo = optionTwoConsole.readLine();
//            String optionTwo = scanner.nextLine();

            System.out.println("Enter the Shift key number (1-26) used to Encrypt the Word/Letter \n");
            Console shiftKeyConsole = System.console();
            String chosenKeyNumber =shiftKeyConsole.readLine();
            int choseInt = Integer.parseInt(chosenKeyNumber);

            dataProperties.setChosenMyText(optionTwo);
            dataProperties.setChosenInt(choseInt);
            String dec = Decode.getDataProperties(optionTwo, choseInt);
            System.out.println("Decrypted: " + dec);

        } else {
            System.out.println("Only words or letters allowed. Wrong Choice");
        }

    }
}
