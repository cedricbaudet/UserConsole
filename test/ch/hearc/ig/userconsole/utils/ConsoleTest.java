package ch.hearc.ig.userconsole.utils;

import org.junit.jupiter.api.Test;

/**
 * @author cedric.baudet
 */
class ConsoleTest {
    @Test
    void test() {
        Console console = new Console();
        console.setEntry("First entry (1)");
        console.setEntry("Second entry (2)");
        assert (!console.getEntries().isEmpty());
        console.printMenu();
    }
}