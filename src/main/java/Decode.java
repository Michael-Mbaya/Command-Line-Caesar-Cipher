public class Decode {
    public static  String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public static String getData(String newText,int newKey){
        String decodedText = "";
        for (int i = 0; i< newText.length(); i++){
            int charPosition = ALPHABET.indexOf(newText.charAt(i));
            int keyval = (charPosition - newKey) % 26;
            if (keyval < 0){
                keyval= ALPHABET.length() + keyval;
            }
            char finalChar = ALPHABET.charAt(keyval);
            decodedText += finalChar;
        }

        return decodedText;
    }
}