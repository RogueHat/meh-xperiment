package map;

import java.awt.Color;

public class HexCell {
	private int x,y;
	private boolean isEvenRow;
	private Color clr;
	
	public HexCell(int xp,int yp){
		x=xp;
		y=yp;
		clr=Color.white;
		
		if(y%2==0)isEvenRow=true;
		else isEvenRow=aflse;
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
	
	public HexCell left(HexCell[][] meh){
		return meh[x-1][y];
	}
	public HexCell right(HexCell[][] meh){
		return meh[x+1][y];
	}
}
