import java.io.Console;

public class App {
    public static void main(String[] args){
        Boolean programRun = true;
    while (programRun) {
        DataProperties dataProperties = new DataProperties();

        Console optionConsole = System.console();
        System.out.println("Choose an option 'e' or 'd' or 'q': ");
        System.out.println("e/E. To Encrypt");
        System.out.println("d/D. To Decrypt");
        System.out.println("q/Q. Exit\n");

        String option = optionConsole.readLine();

        if (option.equals("e") || option.equals("E")) {
            System.out.println("Enter word or letter to Encrypt\"\n");
            Console optionOneConsole = System.console();
            String OptionOne = (optionOneConsole.readLine()).toLowerCase().replaceAll("[^\\p{L}\\p{Z}]", "").replaceAll(" ", "");
//            System.out.println(OptionOne);

            System.out.println("Enter key number between (1-26) to encrypt\n");
            Console optionTwoConsole = System.console();
            String chosenNumber = optionTwoConsole.readLine();
            int chosenInt = Integer.parseInt(chosenNumber);

            dataProperties.setChosenMyText(OptionOne);
            dataProperties.setChosenInt(chosenInt);
            String enc = Encode.getDataProperties(OptionOne, chosenInt);
//            String dec = Decode.getDataProperties(OptionOne, chosenInt);

            System.out.println("Original Text: " + dataProperties.getChosenText().toUpperCase());
            System.out.println("Encrypted: " + enc.toUpperCase() + "\n");
            System.out.println("( *Encrypted Text has spaces and Punctuations removed from Original text )");
            //           System.out.println("Decrypted: " + dec);

        }
        else if (option.equals("d") || option.equals("D")) {
            System.out.println("Enter word or letter to Decrypt");
            Console optionTwoConsole = System.console();
            String optionTwo = (optionTwoConsole.readLine()).toLowerCase().replaceAll("[^\\p{L}\\p{Z}]", "").replaceAll(" ", "");
            //            System.out.println(optionTwo.toUpperCase());
            //            String optionTwo = scanner.nextLine();

            System.out.println("Enter the Shift key number (1-26) used to Encrypt the Word/Letter \n");
            Console shiftKeyConsole = System.console();
            String chosenKeyNumber = shiftKeyConsole.readLine();
            int choseInt = Integer.parseInt(chosenKeyNumber);

            dataProperties.setChosenMyText(optionTwo);
            dataProperties.setChosenInt(choseInt);
            String dec = Decode.getDataProperties(optionTwo, choseInt);
            System.out.println("Decrypted: " + dec);

        }
        else if (option.equals("q") || option.equals("Q")) {
            programRun = false;
        } else {
            System.out.println("Wrong Option, Try Again!\n");
        }
    }

    }
}
