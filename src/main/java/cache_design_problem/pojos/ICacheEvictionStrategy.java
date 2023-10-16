package cache_design_problem.pojos;

public interface ICacheEvictionStrategy<K,V> {

    public void setRecentlyAccessedKey(K key);

    public K getEvictionKey();

}
