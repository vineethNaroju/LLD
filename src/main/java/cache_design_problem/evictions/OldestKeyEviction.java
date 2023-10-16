package cache_design_problem.evictions;

import cache_design_problem.pojos.CacheKey;
import cache_design_problem.pojos.CacheValue;
import cache_design_problem.pojos.ICacheEvictionStrategy;

import java.util.*;

public class OldestKeyEviction<K, V> implements ICacheEvictionStrategy<K, V> {

    private final LinkedList<K> dll = new LinkedList<>();
    private final HashMap<K, Integer> keyPosition = new HashMap<>();

    @Override
    public void setRecentlyAccessedKey(K key) {
        if(keyPosition.containsKey(key)) {
            dll.remove(keyPosition.get(key));
        }

        dll.addLast(key);
        keyPosition.put(key, dll.size() - 1);
    }

    @Override
    public K getEvictionKey() {
        K key = dll.getFirst();
        keyPosition.remove(key);
        return key;
    }
}
