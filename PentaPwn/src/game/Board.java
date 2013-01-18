package game;

import java.awt.Color;

public class Board {
	private Location[][] board;
	private Color winner;
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

	
	public Color checkHoriz(int x, int y){
		Color col = board[x][y].getCol();
		for(int i=x;i<5+x;i++)
			if(board[i][y].getCol()!=col)return Color.white;
		return col;
	}
	public Color checkVert(int x, int y){
		Color col = board[x][y].getCol();
		for(int i=y;i<5+y;i++)
			if(board[x][i].getCol()!=col)return Color.white;
		return col;
	}
}
