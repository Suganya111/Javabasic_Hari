package com.aaludra.basicprogram.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

public class HashmapEmployee<sh> {

	public static <K, V> V getKeyByValue(Map<K, V> map, String key) {
		for (Entry<K, V> entry : map.entrySet()) {
			if (Objects.equals(key, entry.getKey())) {
				return entry.getValue();
			}
		}
		return null;
	}

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("101", "Hari");
		map.put("102", "Saranya");
		map.put("103", "Babu");
		map.put("104", "Suganya");
		System.out.println(getKeyByValue(map, "101"));

	}
}
