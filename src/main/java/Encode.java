public class Encode {

    public static String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    DataProperties dataProperties = new DataProperties();

    public static String getDataProperties(String newText, int newKey) {
        String encrypted = "";
        for (int i = 0; i < newText.length(); i++) {
            int charPosition = ALPHABET.indexOf(newText.charAt(i));

            int newShiftKey = (charPosition + newKey) % 26;
            char newChar = ALPHABET.charAt(newShiftKey);

            encrypted = encrypted + newChar;
        }

        return encrypted;

    }
}