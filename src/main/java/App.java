//import java.io.BufferedReader;
import java.io.Console;
//import java.io.InputStreamReader;
//import java.io.StringReader;
//import java.util.Scanner;

public class App {
    public static void main(String[] args){

        DataProperties dataProperties = new DataProperties();

        Console optionConsole = System.console() ;

        System.out.println("Choose an option '1' or '2'");
        System.out.println("1. To Encrypt");
        System.out.println("2. To Decrypt\n");

        String option = optionConsole.readLine();

        if ("1".equals(option)) {
            System.out.println("Enter word or letter to Encrypt\"\n");
            Console optionOneConsole = System.console();
            String OptionOne = (optionOneConsole.readLine()).toLowerCase().replaceAll("[^\\p{L}\\p{Z}]","").replaceAll(" ","");
            System.out.println(OptionOne);

            System.out.println("Enter key number between (1-26) to encrypt\n");
            Console optionTwoConsole = System.console();
            String chosenNumber = optionTwoConsole.readLine();
            int chosenInt = Integer.parseInt(chosenNumber);

            dataProperties.setChosenMyText(OptionOne);
            dataProperties.setChosenInt(chosenInt);
            String enc = Encode.getDataProperties(OptionOne, chosenInt);
//            String dec = Decode.getDataProperties(OptionOne, chosenInt);

            System.out.println("Original Text: " + dataProperties.getChosenText().toUpperCase() );
            System.out.println("Encrypted: " + enc.toUpperCase() + "\n" );
            System.out.println("( *Encrypted Text has spaces and Punctuations removed from Original text )");
//            System.out.println("Decrypted: " + dec);

        } else if ("2".equals(option)) {
            System.out.println("Enter word or letter to Decrypt");
            Console optionTwoConsole = System.console();
            String optionTwo = (optionTwoConsole.readLine()).toLowerCase();
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
