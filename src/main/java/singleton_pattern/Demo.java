package singleton_pattern;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

class Singleton {

    private static final AtomicReference<Singleton> atomicReference = new AtomicReference<>();

    private static volatile boolean updated = false;

    private Singleton() {
    }

    public static Singleton getInstance() {

        try {
            Thread.sleep((long) (Math.random() * 100));
        } catch (Exception e) {
            e.printStackTrace();
        }

        if(updated) {
            return atomicReference.get();
        }

        if(atomicReference.compareAndSet(null, new Singleton())) {
            updated = true;
        }

        return atomicReference.get();

    }

}

public class Demo {

    public static Set<Integer> s = new TreeSet<>();

    public synchronized static void add(int hashCode) {
        s.add(hashCode);
    }
    public static void main(String[] args) throws Exception {


        int n = 2;
        List<Thread> threads = new ArrayList<>();
        // AtomicReference<TreeSet<Integer>> atomicSet = new AtomicReference<>(new TreeSet<>());
        ConcurrentHashMap<Integer, Singleton> mp = new ConcurrentHashMap<>();


        for(int i=0; i<n; i++) {
            threads.add(new Thread(new Runnable() {
                @Override
                public void run() {
                    Singleton inst = Singleton.getInstance();
                    add(inst.hashCode());
                    mp.put(inst.hashCode(), inst);
                }
            },"thread-" + i));
        }

        for(Thread t : threads) {
            t.start();
        }

        for(Thread t : threads) {
            t.join();
        }

        System.out.println(mp.entrySet().size() + " | " + s.size());


    }
}
