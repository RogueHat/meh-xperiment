package game;

import java.awt.Color;

public class Board {
	private Location[][] board;
	public Board(){
		board = new Location[6][6];
		clearBoard();
	}
	public void clearBoard(){
		for(int x=0;x<6;x++)
			for(int y=0;y<6;y++)
				board[x][y]=new Location();
	}
	public boolean put(int x,int y,Color col){
		if(board[x][y].getCol()==Color.white){
			board[x][y].setCol(col);
			return true;
		}
		return false;
	}
	
	public int countHoriz(int x, int y, Color col){
		if(board[x][y]==null||board[x][y].getCol()!=col)return 0;
		
		return y;
	}
}
