import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println(" Enter Plain Text:");
    String plainInput= scanner.nextLine();
    System.out.println(" Enter Key:");
    String keyInput = scanner.nextLine();
    Vigenere vigenere = new Vigenere(plainInput,keyInput);
    String key = Vigenere.keyBuilder();
    String cipherText = Vigenere.cipherText();
    System.out.println("Extended key: " + key);
    System.out.println(" Cypher Text: " + cipherText);
    String decryptedText= Vigenere.decrypt;
    System.out.println(" Decrypted Text: " + decryptedText);


    }
}


