
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner aScanner = new Scanner(System.in);

        System.out.println("Enter your message:");
       String plainText = aScanner.nextLine();

        System.out.println("Enter shift key");
       int shiftKey = aScanner.nextInt();
       Caesar caesar=new Caesar(plainText,shiftKey);
       String encryptedText=caesar.EncryptText();
       String decryptedText=caesar.DecryptText();
        System.out.println(encryptedText);
        System.out.println(decryptedText);



    }



}