package cache_design_problem.caches;

import cache_design_problem.evictions.OldestKeyEviction;
import cache_design_problem.exceptions.StorageFullException;
import cache_design_problem.pojos.*;
import cache_design_problem.storages.SimpleHashMap;

public class MapCache<K, V> extends ICache<K, V> {

    public MapCache() {
        super(new SimpleHashMap<>(), new OldestKeyEviction<>());
    }

    @Override
    public V get(K key) {
        evictionStrategy.setRecentlyAccessedKey(key);
        return cacheStorage.get(key);
    }

    @Override
    public void set(K key, V value) {

        try {
            evictionStrategy.setRecentlyAccessedKey(key);
            cacheStorage.set(key, value);
        } catch (StorageFullException e) {
            cacheStorage.remove(evictionStrategy.getEvictionKey());
            cacheStorage.set(key, value);
        }

    }
}

