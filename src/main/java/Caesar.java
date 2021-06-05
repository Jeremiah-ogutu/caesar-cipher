
import java.util.Scanner;

public class Caesar {
    private String message;
    private int shiftKey;

    public Caesar(String message, int shiftKey ){
        this.message=message;
        this.shiftKey=shiftKey;
    }

    public String getMessage() {
        return message;
    }

    public int getShiftKey() {
        return shiftKey;
    }
    StringBuilder caesarText = new StringBuilder();
    final String ALPHABETS = "abcdfghijklmnopqrstuvwxyz";

    public  String EncryptText() {
        message = getMessage().toLowerCase();
        shiftKey=getShiftKey();


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

    public  String DecryptText() {
       String encryptedmessage =EncryptText().toLowerCase();

        StringBuilder DecryptedText = new StringBuilder();


        for (int counter = 0; counter < message.length(); counter++) {
            if (!Character.isLetter(encryptedmessage.charAt(counter))) {
                DecryptedText.append(encryptedmessage.charAt(counter));


            } else {
                int charPosition = ALPHABETS.indexOf(encryptedmessage.charAt(counter));
                int keyValue = (charPosition - shiftKey) % 26;

                char caesarValue = ALPHABETS.charAt(keyValue);
                DecryptedText.append(caesarValue);


            }
        }


        return DecryptedText.toString();

    }


}

