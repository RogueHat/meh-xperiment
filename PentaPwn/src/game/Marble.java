package game;

public class Marble {
	public int state = 0;
	public int loc[];
	
	public Marble(int x, int y){
		setLoc(x,y);
	}
	public Marble(int x, int y, int s){
		setLoc(x,y);
		setState(s);
	}
	
	public void setLoc(int x, int y){
		int temp[]={x,y};
		loc=temp;
	}
	public void setState(int s){
		state=s;
	}
	
	public boolean isLoc(int x,int y){
		int temp[]={x,y};
		return isLoc(temp);
	}
	public boolean isLoc(int []testLoc){
		return loc[0]==testLoc[0] && loc[1]==testLoc[1];
	}
	public int getState(){
		return state;
	}
	public int[] getLoc(){
		return loc;
	}
}
