import java.io.Console;

public class App {
    public static void main(String[] args){
        boolean programRun = true;
    while (programRun) {
        TextAndShift textAndShift = new TextAndShift();

        Console optionConsole = System.console();
        System.out.println("Choose an option 'e' or 'd' or 'q': ");
        System.out.println("e/E. To Encrypt");
        System.out.println("d/D. To Decrypt");
        System.out.println("q/Q. Exit\n");

        String option = optionConsole.readLine();

        if (option.equals("e") || option.equals("E")) {
            System.out.println("Enter word or letter to Encrypt:");
            Console optionOneConsole = System.console();
            String OptionOne = (optionOneConsole.readLine()).toLowerCase().replaceAll("[^\\p{L}\\p{Z}]", "").replaceAll(" ", "");

            System.out.println("Enter Shift Key Number to encrypt with:");
            Console optionTwoConsole = System.console();
            String chosenNumber = optionTwoConsole.readLine();
            int chosenInt = Integer.parseInt(chosenNumber);

            textAndShift.setChosenText(OptionOne);
            textAndShift.setChosenInt(chosenInt);
            String enc = Encode.getData(OptionOne, chosenInt);

            System.out.println( "Original Text: " + textAndShift.getChosenText().toUpperCase() );
            System.out.println( "Encrypted: " + enc.toUpperCase() );
            System.out.println( "( *Encrypted Text has spaces and Punctuations removed from Original text )\n" );

        }
        else if (option.equals("d") || option.equals("D")) {
            System.out.println("Enter word or letter to Decrypt:");
            Console optionTwoConsole = System.console();
            String optionTwo = (optionTwoConsole.readLine()).toLowerCase().replaceAll("[^\\p{L}\\p{Z}]", "").replaceAll(" ", "");

            System.out.println("Enter the Shift Key Number used:");
            Console shiftKeyConsole = System.console();
            String chosenKeyNumber = shiftKeyConsole.readLine();
            int choseInt = Integer.parseInt(chosenKeyNumber);

            textAndShift.setChosenText(optionTwo);
            textAndShift.setChosenInt(choseInt);
            String dec = Decode.getData(optionTwo, choseInt);

            System.out.println( "Original Text: " + textAndShift.getChosenText().toUpperCase() );
            System.out.println( "Decrypted: " + dec.toUpperCase() );
            System.out.println( "( *Encrypted Text has spaces and Punctuations removed from Original text )\n" );

        }
        else if (option.equals("q") || option.equals("Q")) {
            programRun = false;
            System.out.println("\n");
        }
        else {
            System.out.println("Wrong Option, Try Again!\n");
        }

    }

    }
}