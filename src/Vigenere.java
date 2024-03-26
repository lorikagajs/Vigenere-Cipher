import javax.lang.model.type.ExecutableType;

public class Vigenere {
    static String plainText;
   static String key;
   static String cypher;
   static String decrypt;
    Vigenere(String plainText, String key){
        this.key=key;
        this.plainText=plainText.replaceAll("\\s","");
        this.cypher= cipherText();
        this.decrypt=decrypt();
    }



    static String keyBuilder(){
        StringBuilder extendedKey = new StringBuilder();
        int plainTextLength = plainText.length();
        int keyLength = key.length();
        for(int i=0;i<plainTextLength;i++){
            extendedKey.append(key.charAt(i %keyLength));
        }
        return extendedKey.toString();
    }

    static String cipherText(){
        char[] plainChar = plainText.toCharArray();
     char[] keyChar = keyBuilder().toCharArray();
        char[] cypherChar = new char[plainText.length()];

        for (int i=0; i< plainText.length();i++){
            plainChar[i]= Character.toUpperCase(plainChar[i]);
            keyChar[i]= Character.toUpperCase(keyChar[i]);

            cypherChar[i]= (char)(((plainChar[i]+keyChar[i])-2*'A')%26 +'A');

        }
        return String.valueOf(cypherChar);
    }
    static String decrypt(){
        char[] keyChar = keyBuilder().toCharArray();
        char[] decryptText= new char[cipherText().length()];
        char[] encryptText= cipherText().toCharArray();
        for(int i=0;i<plainText.length();i++){
            encryptText[i]=Character.toUpperCase(encryptText[i]);
            keyChar[i]=Character.toUpperCase(keyChar[i]);
            decryptText[i]=(char)(((encryptText[i]-keyChar[i])+26)%26+'A');
        }
        return String.valueOf(decryptText);
    }
}
