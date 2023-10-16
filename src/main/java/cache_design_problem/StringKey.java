package cache_design_problem;

import cache_design_problem.pojos.CacheKey;

public class StringKey extends CacheKey<String> {
    public StringKey(String key) {
        super(key);
    }
}
