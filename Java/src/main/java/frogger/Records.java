package frogger;

import java.util.ArrayList;
import java.util.List;

/**
 * Refactor Task 2.
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22)
 */
public class Records {
    private final List<FroggerID> records;

    public Records() {
        this.records = new ArrayList<>();
    }

    // ANTIPATTERN: "Long Parameter List"
    public boolean addRecord(FroggerID frogger) {
        for (FroggerID id : this.records) {
            if (id.equals(frogger)) {
                return false;
            }
        }
        this.records.add(frogger);
        return true;
    }
}