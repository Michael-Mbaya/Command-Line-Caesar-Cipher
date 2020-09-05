public class Encode {

    public static  String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    DataProperties dataProperties = new DataProperties();
    public static String getDataProperties(String newText,int newKey) {
        String encrypted = "";
        for (int i=0;i<newText.length();i++){
            int charPosition =  ALPHABET.indexOf(newText.charAt(i));

            int newkey = (charPosition + newKey) % 26;
            char newChar = ALPHABET.charAt(newkey);

//            encrypted += newChar;
            encrypted = encrypted + newChar;
        }

        return encrypted ;

    }

//    static String isEncode(String bc){
//            String encrypted = "";
//            for (int i=0;i<bc.length();i++){
//               int charposition =  ALPHABET.indexOf(bc.charAt(i));
//               int newkey = (charposition + 2) % 26;
//               char newchar = ALPHABET.charAt(newkey);
//               encrypted += newchar;
//            }
//                    return encrypted ;
//        }

}