public class Vigenere {
    private String key;

    public Vigenere(String key) {
        this.key = key;
    }

    public String encrypt(String plaintext) {
        StringBuilder ciphertext = new StringBuilder();
        int keyLength = key.length();
        for (int i = 0; i < plaintext.length(); i++) {
            char p = plaintext.charAt(i);
            char k = key.charAt(i % keyLength);
            char c = (char) (((p - 'A') + (k - 'A')) % 26 + 'A');
            ciphertext.append(c);
        }
        return ciphertext.toString();
    }

    public String decrypt(String ciphertext) {
        StringBuilder plaintext = new StringBuilder();
        int keyLength = key.length();
        for (int i = 0; i < ciphertext.length(); i++) {
            char c = ciphertext.charAt(i);
            char k = key.charAt(i % keyLength);
            char p = (char) (((c - 'A') - (k - 'A') + 26) % 26 + 'A');
            plaintext.append(p);
        }
        return plaintext.toString();
    }
}
public static void main(String[] args) {
        Vigenere vigenere = new Vigenere("LEMON");
        String plaintext = "ATTACKATDAWN";
        String ciphertext = vigenere.encrypt(plaintext);
        System.out.println("Ciphertext: " + ciphertext);
        String decryptedText = vigenere.decrypt(ciphertext);
        System.out.println("Decrypted Text: " + decryptedText);
}
