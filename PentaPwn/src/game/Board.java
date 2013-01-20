package game;

import java.util.ArrayList;

public class Board {

	private ArrayList<Marble> board = new ArrayList<Marble>();
	private ArrayList<MiniBoard> miniBoards = new ArrayList<MiniBoard>();
	
	public Board() {
		clearBoard();
		setMiniBoards();
	}

	public void clearBoard() {
		ArrayList<Marble> temp = new ArrayList<Marble>();
		for (int x = 0; x < 6; x++)
			for (int y = 0; y < 6; y++)
				temp.add(new Marble(x, y));
		board = temp;
	}
	public void setMiniBoards(){
		for(int x=0;x<4;x++)
			miniBoards.add(new MiniBoard(x));
	}
	public void rotateMiniBoard(int quadrant,boolean turnLeft){
		miniBoards.get(quadrant).rotate(turnLeft);
	}

	public Marble getMarble(int x, int y) {
		for (Marble piece : board)
			if (piece.isLoc(x, y))
				return piece;
		return null;
	}

	public boolean isOpenLoc(int x, int y) {
		Marble piece = getMarble(x, y);
		return piece.getState() == 0;
	}
	
	public boolean placePiece(int x,int y, int player){
		if(isOpenLoc(x,y)){
			getMarble(x, y).setState(player);
			return true;
		}
		return false;
	}
}
