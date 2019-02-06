import java.io.*;
import java.util.*;

public static void solution() {
		int[] arr = new int[] {0, -1, 2, -3, 1};
		List<List<Integer>> res = new ArrayList<List<Integer>>(); 
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < arr.length; i++) {
			map.put(arr[i], arr[i]);
		}
		for (int i = 0; i<arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				int b = 0-(arr[i]+arr[j]);
				if(map.containsKey(b)) {
					List<Integer> cur = new ArrayList<Integer>();
					cur.add(map.get(b));
					cur.add(arr[i]);
					cur.add(arr[j]);
					res.add(cur);
			}
				
		}
	}
		HashSet<List<Integer>> set = new HashSet<List<Integer>>();
		for(List li: res) {
			Collections.sort(li);
			set.add(li);
		}
		res.clear();
		res.addAll(set);
		System.out.println("the triplet:"+ res);
	
	 }
