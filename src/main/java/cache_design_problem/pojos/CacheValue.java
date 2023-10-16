package cache_design_problem.pojos;

public class CacheValue<V> {
    private final V value;

    public CacheValue(V value) {
        this.value = value;
    }

    public V get() {
        return value;
    }
}
