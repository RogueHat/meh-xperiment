package map;

import java.awt.Color;

public class HexCell {
	private int x,y;
	private Color clr;
	
	public HexCell(int xp,int yp){
		x=xp;
		y=yp;
		clr=Color.white;
	}
	public HexCell(int xp,int yp,Color color){
		this(xp,yp);
		setClr(color);
	}
	public void setClr(Color color){
		clr=color;
	}
	public Color getClr(){
		return clr;
	}
}
