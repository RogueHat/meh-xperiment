package Things;

public class Cell {

	private boolean alive;
	
	public Cell(){
		this(.5);
	}
	public Cell(double chance){
		alive = Math.random() < chance;
	}
	public Cell(boolean stat){
		alive = stat;
	}
	
	public boolean isAlive(){
		return alive;
	}
	
	public void set(boolean stat){
		alive = stat;
	}

}
