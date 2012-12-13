import java.util.Arrays;

public class Prime {
	private int limit;
	private static int list[];

	public Prime(int lim) {
		limit = lim;
		list = new int[lim];
		list[0] = 2;
	}

	public void calc() {
		int count = 1, testNum = 3;
		while (count < limit) {
			if (isPrime(testNum)) {
				list[count] = testNum;
				count++;
			}
			testNum += 2;
		}
	}

	private boolean isPrime(int x) {
		int a = (int) Math.sqrt(x);
		for (int y = 3; y <= a; y += 2)
			if (x % y == 0)
				return false;
		return true;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = (int) System.currentTimeMillis();
		Prime meh = new Prime((int) 1E6);
		meh.calc();
		a = (int) System.currentTimeMillis() - a;
		System.out.print(a+"\t");
		//System.out.println(Arrays.toString(list));
	}
}
