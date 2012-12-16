import java.util.Arrays;


public class Fibo {

	static double list[];
	static int limit;
	public Fibo(int lim){
		limit=lim;
		list = new double[limit];
		list[0]=list[1]=1;
		calc();
	}
	public void calc(){
		int x=2;
		for(;x<limit && !Double.isInfinite(list[x-1]);x++)
			list[x]=list[x-1]+list[x-2];
	}
	public String toString(){
		return Arrays.toString(list);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a = System.currentTimeMillis();
		System.out.println(new Fibo((int) 1E1));
		System.out.println((System.currentTimeMillis()-a));
	}

}
