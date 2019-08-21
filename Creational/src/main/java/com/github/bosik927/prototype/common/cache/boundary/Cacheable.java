package com.github.bosik927.prototype.common.cache.boundary;

public interface Cacheable<T> {
    T put(String key, T object);
    T get(String key);
    void remove(String key);
}