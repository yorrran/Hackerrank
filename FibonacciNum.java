import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int i = 0; i<tc; i++){
		    int m = sc.nextInt();
		    Integer[] arr = new Integer[m];
		    for(int j=0; j<m; j++){
		        arr[j]=sc.nextInt();
		    }
		    List<Integer> fib = new ArrayList<Integer>();
		    fib = findFib(arr);
		    for(Integer n: fib){
		        System.out.print(n+" ");
		    }
		    System.out.println("");
		    
		}
	}
	public static List<Integer> findFib(Integer[] arr){
	    if (arr == null) return null;
	    Integer max = Collections.max(Arrays.asList(arr));
	    List<Integer> fib = new ArrayList<Integer>();
	    List<Integer> res = new ArrayList<Integer>();
	    
	    Integer i = 0;
	    Integer j = 1;
	    while(i<=max){
	        Integer n = i+j;
	        i=j;
	        j=n;
	        fib.add(n);
	    }
	    
	    for(Integer m: arr){
	        if(fib.contains(m)){
	            res.add(m);
	        }
	    }
	    return res;
	    
	}
}
