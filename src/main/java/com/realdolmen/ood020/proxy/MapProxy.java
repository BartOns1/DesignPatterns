package com.realdolmen.ood020.proxy;

import java.util.HashMap;
import java.util.Properties;

public class MapProxy implements AbstractMap {

	private String fileName;
	private HashMap<String, String> cache = new HashMap<>();

	private Map map;

	public MapProxy(String fileName) {
		this.fileName = fileName;

	}


	public String find(String key) throws Exception {
		if (cache.containsKey(key)){
			return cache.get(key);
		} else {
			String value=getMap().find(key);
			cache.put(key,value);
			return value;
		}

	}

	public void add(String key, String value) throws Exception {
		getMap().add(key,value);
		cache.put(key,value);

	}
	private Map getMap(){
		if (map==null){
			map = new Map(fileName);
		}
		return map;
	}


	private String get(String key) {
		return (String) cache.get(key);
	}

	private void put(String key, String value) {
		cache.put(key, value);
	}
}
