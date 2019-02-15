class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int i = 0; i<tc; i++){
		    int m = sc.nextInt();
		    int[] arr = new int[m];
		    for(int j=0; j<m; j++){
		        arr[j]=sc.nextInt();
		    }
		    List<Integer> fib = new ArrayList<Integer>();
		    fib = findFib(arr);
		    for(int i: fib){
		        System.out.print(i+" ");
		    }
		    
		}
	}
	public static List<Integer> findFib(int[] arr){
	    if (arr == null) return null;
	    int max = Collections.max(arr);
	    System.out.println("max:"+max);
	    
	}
}
