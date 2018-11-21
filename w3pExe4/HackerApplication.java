package w3pExe4;

public class HackerApplication {

    public static void main(String[] args) {

        Messenger messenger=new Messenger();
        String text="I am thinking so I am exist. And I am 36 years old that is 18*2.";

        String encrypted=messenger.send(text);
        String decrypted=messenger.receive(encrypted);

        System.out.println("Original text:    "+text);
        System.out.println("Encrypted text:   "+encrypted);
        System.out.println("Decrypted text:   "+decrypted);
    }
}
