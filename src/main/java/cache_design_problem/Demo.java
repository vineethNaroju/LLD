package cache_design_problem;

/*
*
*  CacheUser, CacheAdmin, CacheDaemon,
*  Cache with generic type <K,V> Key<K>, Value<V>
*  IKey<K>, IValue<V>, ICache<K,V>
*  CacheEvictionStrategy
*  CacheStorageStrategy
*
*  Data access objects
*
* */

import cache_design_problem.caches.MapCache;
import cache_design_problem.pojos.ICache;

public class Demo {
    public static void main(String[] args) {
        ICache<StringKey, IntegerValue> cache = new MapCache<>();

        StringKey yo = new StringKey("yo");
        StringKey ha = new StringKey("ha");
        StringKey pe = new StringKey("pe");

        cache.set(yo, new IntegerValue(10));
        cache.set(ha, new IntegerValue(30));
        cache.set(pe, new IntegerValue(40));

        System.out.println(cache.get(ha).get());
    }
}
