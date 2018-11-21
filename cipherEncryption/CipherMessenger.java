package cipherEncryption;


    public class CipherMessenger {

        private Encryptor encryptor = new Encryptor();
        //private Decryptor decryptor = new Decryptor();

        String send(String text) {
            return encryptor.encrypt(text);
        }
/*
        String receive(String encrypted) {
            return decryptor.decrypt(encrypted);
        }*/

    }






