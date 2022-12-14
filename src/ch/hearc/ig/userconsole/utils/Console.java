package ch.hearc.ig.userconsole.utils;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author cedric.baudet
 */

public class Console {

    private Set<String> entries;

    public Console() {
        entries = new TreeSet<String>();
    }

    public Console(Set<String> entries) {
        this.entries = entries;
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
        System.out.println("======================================================");
        for (String entry : entries) {
            System.out.println(entry);
        }
        System.out.println("======================================================");
    }
}
