package Things;

public class Cell {

	private boolean alive;
	
	public Cell(){
		alive = Math.random() <.02;
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
