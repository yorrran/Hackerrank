class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc, index, m, n, z;
		long sum = 0, res = 0;

		tc = sc.nextInt();
		while (tc > 0) {
			n = sc.nextInt();
			m = sc.nextInt();
			int[] arr = new int[n];

			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			res = 0;
			if (n < m) {
				for (int i = 0; i < n; i++) {
					res = res + arr[i];
				}
				System.out.println(res);
			} else {
				for (int i = 0; i < n; i++) {
				    sum=0;
					z = i;
					for (int j = 1; j <= m; j++) {
					    sum = sum + arr[z];
						if (z == (n - 1)) {
							z=0;
						} else {
							z++;
						}
					}
					if (sum > res) {
						res = sum;
					}

				}
				System.out.println(res);

			}
			tc--;
		}
	}
}
