import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Scanner;

public class App {
    public static void main(String[] args){

        DataProperties dataProperties = new DataProperties();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an option");
        System.out.println("1. Encrypt and Decrypt");
        System.out.println("2. Decryption\n");

        String option = scanner.nextLine();

        if ("1".equals(option)) {
            System.out.println("Enter word or letter to Encrypt and Decrypt\"\n");
            String Optionone = scanner.nextLine();
            System.out.println("Enter key number between (1-26) to encrypt\n");
            String chosenNumber =scanner.nextLine();
            int chosenInt = Integer.parseInt(chosenNumber);
            dataProperties.setChosenMyText(Optionone);
            dataProperties.setChosenInt(chosenInt);
            String enc = Encode.getDataProperties(Optionone, chosenInt);
            String dec = Decode.getDataProperties(Optionone, chosenInt);
            System.out.println("Encrypted: " + enc);
            System.out.println("Decrypted: " + dec);

        } else if ("2".equals(option)) {
            System.out.println("Enter word or letter to Decrypt");
            String Optiontwo = scanner.nextLine();
            System.out.println("Enter key number between (1-26) to encrypt\n");
            String chosenNumber = scanner.nextLine();
            int choseInt = Integer.parseInt(chosenNumber);
            dataProperties.setChosenMyText(Optiontwo);
            dataProperties.setChosenInt(choseInt);
            String dec = Decode.getDataProperties(Optiontwo, choseInt);
            System.out.println("Decrypted: " + dec);

        } else {
            System.out.println("Only words or letters allowed. Wrong Choice");
        }

    }
}
