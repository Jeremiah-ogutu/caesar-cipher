

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
        final String ALPHABETS = "abcdfghijklmnopqrstuvwxyz.";
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

