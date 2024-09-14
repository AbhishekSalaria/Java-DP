package org.java.dp.Creational.Prototype;

import java.util.HashMap;
import java.util.Map;

public class TreeCache {
    Map<String, Tree> cache = new HashMap<>();

    public TreeCache() {
        PineTree pineTree = new PineTree("100f", "100kg");
        NeemTree neemTree = new NeemTree("200f", "200kg", "200y");
        cache.put("PineTree", pineTree);
        cache.put("NeemTree", neemTree);
    }

    public Tree putKey(String key, Tree treeType) {
        cache.put(key,treeType);
        return treeType;
    }

    public Object getKey(String key) {
        return cache.get(key);
    }
}
