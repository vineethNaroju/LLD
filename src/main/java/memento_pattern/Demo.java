package memento_pattern;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.LinkedList;

class WriteOpx {
    final String key;
    final int val;

    WriteOpx(String key, int val) {
        this.key = key;
        this.val = val;
    }
}


class Database {
    private HashMap<String, Integer> mp = new HashMap<>();

    public SnapshotMemento getSnapshot() {
        return new SnapshotMemento(mp);
    }

    public void loadSnapshot(SnapshotMemento snapshot) {
        synchronized (this) {
            this.mp = snapshot.getMp();
        }
    }

    public int getValue(String key) {
        return mp.getOrDefault(key, 0);
    }

    public void set(String key, int val) {
        mp.put(key, val);
    }


    @Getter
    protected static final class SnapshotMemento {

        private final HashMap<String, Integer> mp;

        SnapshotMemento(HashMap<String, Integer> mp) {
            this.mp = new HashMap<>(mp);
        }
    }
}


public class Demo {
    public static void main(String[] args) {
        Database db = new Database();

        db.set("hello", 10);
        db.set("meow", 999);

        Database.SnapshotMemento snapshot1 = db.getSnapshot();

        db.set("hello", 20);

        System.out.println(db.getValue("hello"));


        db.loadSnapshot(snapshot1);

        System.out.println(db.getValue("hello"));

    }
}
