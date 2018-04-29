package com.sv.java8.collections;
import java.util.HashMap;
import java.util.Map;
/**
 * Java 8 introduces the getOrDefault() method, which allows to get the current value and if this is not found in the map to return a default value.
 * @author venkat
 *
 */
public class MapOrDefault {
    public static void main(String[] args) {

        Map<String,Integer> map = createMap();
        map.put("Android", 1 + map.getOrDefault("Android", 0));

        // write to command line
        map.forEach((k, v) -> System.out.printf("%s %s%n", k, v));
    }

    private static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Eclipse IDE", 0);
        map.put("Eclipse RCP", 0);
        map.put("Git", 0);
        return map;
    }
}