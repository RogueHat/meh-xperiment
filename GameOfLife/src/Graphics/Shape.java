package Graphics;

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Shape {
	// instance variables
	private int xPos, yPos, side, xSpd, ySpd;
	private Color color;

	/*
	 * The constructor is used to initialize all instance variables.The
	 * constructor makes the object.
	 */
	public Shape(int x, int y, int half, Color col, int xSpeed, int ySpeed) {
		xPos = x;
		yPos = y;
		side = half * 2;
		xSpd = xSpeed;
		ySpd = ySpeed;
		color = col;
	}

	/*
	 * The draw method draws the shape on the screen.
	 */
	public void draw(Graphics window) {
		window.setColor(color);
		window.fillRect(xPos, yPos, side, side);
	}

	/*
	 * This draw method will be used to erase the shape.
	 */
	public void draw(Graphics window, Color col) {
		window.setColor(col);
		window.fillRect(xPos, yPos, side, side);
	}

	public void moveAndDraw(Graphics window, int acc, int a, int b) {
		xSpd+=acc*(a-xPos)/getZ(a,b);
		ySpd+=acc*(b-yPos)/getZ(a,b);
		
		xPos+=xSpd;
		yPos+=ySpd;
		draw(window);
	}

	// add in set and get methods for xPos, yPos, xSpeed, and ySpeed
	public int getX() {
		return xPos;
	}
	public int getY() {
		return yPos;
	}
	public int getXSpeed(){
		return xSpd;
	}
	public int getYSpeed(){
		return ySpd;
	}
	
	public int getZ(int a, int b){
		a=xPos-a;
		b=yPos-b;
		b=(int)Math.sqrt(a*a+b*b);
		if(b!=0)return b;
		else return 1;
	}

	public void setX(int x) {
		// add code here
	}

	public String toString() {
		return xPos + " " + yPos + " " + side + " " + side + " " + color + " "
				+ xSpd + " " + ySpd;
	}
}
