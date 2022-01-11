package collections;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class DemoHashMap {
	public static void main(String[] args) {
		HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
		hashMap.put(1, "yash");
		hashMap.put(2, "ram");
		hashMap.put(3, "lakshman");
		hashMap.put(2, "bheem");
		
		Set<Integer> keySet = hashMap.keySet();
		for(Integer i:keySet) {
			System.out.println("keys:"+i+"     "+"values:"+hashMap.get(i));
			
		}
		
		Set<Entry<Integer, String>> entrySet = hashMap.entrySet();
		for(Entry<Integer,String> s:entrySet) {
			System.out.println(s);
		}
	}

}
