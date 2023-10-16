package cache_design_problem.pojos;

public abstract class ICache<K, V> {

    protected final ICacheEvictionStrategy<K, V> evictionStrategy;
    protected final ICacheStorage<K, V> cacheStorage;

    public ICache(ICacheStorage<K, V> cacheStorage, ICacheEvictionStrategy<K, V> evictionStrategy) {
        this.cacheStorage = cacheStorage;
        this.evictionStrategy = evictionStrategy;
    }

    public abstract V get(K key);

    public abstract void set(K key, V value);
}
