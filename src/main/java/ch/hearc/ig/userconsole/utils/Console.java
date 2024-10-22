package ch.hearc.ig.userconsole.utils;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author cedric.baudet
 */

public class Console {

    private static Console instance;

    private Set<String> entries;
    private Console() {
        entries = new TreeSet<>();
    }

    private Console(Set<String> entries) {
        this.entries = entries;
    }

    public static Console getInstance() {
        if (instance == null) {
            instance = new Console();
        }
        return instance;
    }

    public static Console getInstance(Set<String> entries) {
        if (instance == null) {
            instance = new Console(entries);
        }
        return instance;
    }

    public Set<String> getEntries() {
        return entries;
    }

    public void setEntries(Set<String> entries) {
        this.entries = entries;
    }

    public void setEntry(String entry) {
        this.entries.add(entry);
    }

    public void printMenu() {
        System.out.println("=====================================================");
        for (String entry : entries) {
            System.out.println(entry);
        }
        System.out.println("=====================================================");
    }
}
