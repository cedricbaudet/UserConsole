package ch.hearc.ig.userconsole.utils;

import org.junit.jupiter.api.Test;

/**
 * @author cedric.baudet
 */
class ConsoleTest {
    @Test
    void test() {
        Console console = new Console();
        console.setEntry("First entry");
        console.setEntry("Second entry");
        assert (!console.getEntries().isEmpty());
        console.printMenu();
    }
}