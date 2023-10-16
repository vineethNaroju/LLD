package cache_design_problem.storages;

import cache_design_problem.exceptions.StorageFullException;
import cache_design_problem.pojos.ICacheStorage;

import java.util.HashMap;

public class SimpleHashMap<K, V> implements ICacheStorage<K, V> {

    private final HashMap<K, V> mp = new HashMap<>();


    @Override
    public V get(K key) {
        return mp.get(key);
    }

    @Override
    public void set(K key, V value) {

        if(mp.size() + 1 >= 3) {
            throw new StorageFullException();
        }


        mp.put(key, value);
    }

    @Override
    public void remove(K key) {
        mp.remove(key);
    }
}
