import java.io.*;
import java.util.*;

public static List<List<Integer>> solution() {
	int[] arr = new int[] {-1,0,1, 2, 4};
	HashSet<List<Integer>> res = new HashSet<List<Integer>>();
	Arrays.sort(arr);
	if (arr.length < 3) {
		return new ArrayList<>(res);
	}
	for (int i = 0; i < arr.length - 2; i++) {
		int j = i + 1;
		int k = arr.length - 1;
		while (j < k) {
			int sum = arr[i] + arr[j] + arr[k];
			if (sum == 0)
				res.add(Arrays.asList(arrr[i], arr[j++], arr[k--]));
			else if (sum < 0) {
				j++;
			} else {
				k--;
			}

		}
	}
	return new ArrayList<>(res);
	
 }
