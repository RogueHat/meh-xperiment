import java.util.Arrays;


public class Prime {
	private int limit;
	private int list[];
	
	public Prime(int lim){
		limit=lim;
		list=new int[lim];
		list[0]=2;
	}
	public int[] calc(){
		int count=1, testNum=3;
		while(count<limit){
			if(isPrime(testNum/*,count*/)){
				list[count]=testNum;
				//System.out.println(testNum);
				count++;
			}
			testNum+=2;
		}
		return list;
	}
	private boolean isPrime(int x){
		//for(int y=0;list[y+1]!=0;y++)
		//	if(x%list[y]==0)return false;
		for(int y=2;y<=Math.sqrt(x);y++)
			if(x%y==0)return false;
		return true;
	}
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = (int) System.currentTimeMillis();
		Prime meh = new Prime(1000000);
		meh.calc();
		//System.out.println(Arrays.toString(meh.calc()));
		
		a = (int) System.currentTimeMillis()- a;
		System.out.println(a);
		
		
	}

}
