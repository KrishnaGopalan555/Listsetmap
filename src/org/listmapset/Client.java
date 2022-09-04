package org.listmapset;


import java.util.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Client {



	public static void main(String[] args) {
		List<Integer> li = new ArrayList();
		li.add(20);
		li.add(56);
		li.add(58);
		li.add(58);
		li.add(62);
		li.add(78);
		
		
		Set<String> s = new LinkedHashSet();
		s.add("krishna");
		s.add("rakesh");
		s.add("ramesh");
		s.add("khalid");
		s.add("nishath");
		s.add("haalidh");

	List<String> li1 = new ArrayList();
	li1.addAll(s);
	
	Map<String, Integer> m = new TreeMap();
	for(int i = 0; i<li.size(); i++) {
		m.put(li1.get(i), li.get(i));
	}
		System.out.println(m);

	
	}
}
	