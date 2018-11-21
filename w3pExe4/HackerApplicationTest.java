package w3pExe4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HackerApplicationTest {

    @Test

    void testHackerApplication() {

        Messenger messenger=new Messenger();
        String actual="I am thinking so I am exist. I am 36 years old that is 18*2.";
        String encrypted=messenger.send(actual);
        String expected=messenger.receive(encrypted);

        Assertions.assertEquals(actual,expected);

    }
}