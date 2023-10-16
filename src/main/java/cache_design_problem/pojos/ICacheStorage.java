package cache_design_problem.pojos;

public interface ICacheStorage<K, V> {

    public V get(K key);
    public void set(K key, V value);
    public void remove(K key);

}
