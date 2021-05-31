
//public class Caesar {
//
//        public static void main(String[] args) {
//            int key = 7;
//            String text ="Welcome to my first java program";
//            char[] chars = text.toCharArray();
//            for(char c : chars){
//                c += key;
//                System.out.print(c);
//            }
//
//        }
//}
//public class Caesar{
//  public  String textMessage;
//
//  //generate constrators;
//
//    public Caesar(String textMessage, int numBy) {
//        this.textMessage = textMessage;
//        this.numBy = numBy;
//    }
//
//    //generate getter and setters for getting the massage
//    public String getTextMessage(){
//        return textMessage;
//    }
//    public  int getNumBy(){
//        return  numBy;
//    }
//    //encription logic
//    public  String encrypt() {
//        StringBuilder sb = new StringBuilder();
//
//        for (char character : textMessage.toCharArray()) {
//
//        }
//    }



//

import java.util.Scanner;

public class Caesar {

    public static void main(String[] args) {
        Scanner aScanner = new Scanner(System.in);
        String plainText;
        int shiftKey;

        System.out.println("Enter your message:");
        plainText = aScanner.nextLine();

        System.out.println("Enter shift key");
        shiftKey = aScanner.nextInt();

        System.out.println("The Encrypted Text: " + EncryptText(plainText, shiftKey));

    }

    public static String EncryptText(String message, int shiftKey) {
        final String ALPHABETS = "abcdfghijklmnopqrstuvwxyz";
        message = message.toLowerCase();

        StringBuilder caesarText = new StringBuilder();

        for (int counter = 0; counter < message.length(); counter++) {
            if (!Character.isLetter(message.charAt(counter))) {
                caesarText.append(message.charAt(counter));
            } else {
                int charPosition = ALPHABETS.indexOf(message.charAt(counter));
                int keyValue = (charPosition + shiftKey) % 26;
                char caesarValue = ALPHABETS.charAt(keyValue);
                caesarText.append(caesarValue);
            }
        }
        return caesarText.toString();
    }
}
//}

