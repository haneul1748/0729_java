package com.kh.chap04.run;

import java.util.HashMap;
import java.util.Map;

public class MyProperties {
	private Map map = new HashMap();
	
	public void put(String Key, String value) {
		map.put(Key, value);
	}
	
}
