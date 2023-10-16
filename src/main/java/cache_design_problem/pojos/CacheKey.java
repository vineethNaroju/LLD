package cache_design_problem.pojos;

public abstract class CacheKey<K> {
    private final K key;

    public CacheKey(K key) {
        this.key = key;
    }

    public K get() {
        return key;
    }
}
