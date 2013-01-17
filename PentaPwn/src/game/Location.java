package game;

import java.awt.Color;

public class Location {
	private Color col;
	//empty loc. If white, not filled.
	public Location(){
		col=Color.white;
	}
	public Location(Color color){
		setCol(color);
	}
	public void setCol(Color color){
		col=color;
	}
	public Color getCol(){
		return col;
	}
}
