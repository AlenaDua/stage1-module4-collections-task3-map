package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    //Implement the program which gets `Map<Integer, String>`as parameter and returns a `Map<String,
    // Integer>` where the keys and values are swapped.
    // If in the source map `Map<Integer, String>`there are the same values for different keys,
    // in the new `Map<String, Integer>` this value should map to a smaller key value.
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {

        Map<String, Integer> targetMap = new HashMap<>();

        for (Map.Entry<Integer, String> entry : sourceMap.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();

            if (!targetMap.containsKey(value)) {
                targetMap.put(value, key);
            } else {
                Integer existingKey = targetMap.get(value);
                if (key < existingKey) {
                    targetMap.put(value, key);
                }
            }
        }
        return targetMap;
    }
}
