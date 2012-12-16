import java.util.Arrays;

public class Prime {
	private static int limit, sq, count, testNum;
	private static int list[];

	public Prime(int lim) {
		reset(lim);
	}
	public void reset(int lim){
		limit = lim;
		list = new int[lim];
		list[0] = 2;
		list[1] = 3;
		sq = (int) Math.sqrt(5);
		count = 2;
		testNum=5;
	}

	public void calc() {
		// int count = 1, testNum = 3;
		while (count < limit) {
			if (isPrime()) {
				list[count] = testNum;
				count++;
			}
			testNum += 2;
			sq = (int) Math.sqrt(testNum);
		}
	}

	private boolean isPrime() {

		// for (int y = 3; y <= sq; y += 2)
		// if (x % y == 0) return false;
		for (int y = 1; y < count && list[y] <= sq; y++)
			if (testNum % list[y] == 0)
				return false;
		return true;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int ha = (int) 1E8;
		Prime meh = new Prime(ha);
		
		//while(true){
			long a =  System.currentTimeMillis();
			meh.calc();
			a = (System.currentTimeMillis() - a)/1000/60;
			System.out.println(a + "\t");
			// System.out.println(Arrays.toString(list));
			meh.reset(ha);
		//}
	}
}
