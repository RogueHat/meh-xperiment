
public class Prime {
	private int limit;
	private int list[];
	public Prime(int lim){
		limit=lim;
		list=new int[lim+1];
		list[0]=1;
		list[1]=2;
	}
	private void calc(){
		int count=0;
		while(count<lim){
			if(isPrime(Count))
		}
	}
	private boolean isPrime(int x){
		for(int x=0;x<list.length;x++)
			if(x%list[x]==0)return false;
		return true;
	}
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
