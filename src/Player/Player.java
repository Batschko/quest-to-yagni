package Player;
import Board.Board;;

public class Player {

	String name;
	int xPos,yPos;
	Board board = null;
	int width=0;
	boolean[] walls=null;
	
	/**
	 * sets starting position on the board
	 * @param xPos
	 * @param yPos
	 */
	public Player(String name,int xPos,int yPos,Board board) {
		this.xPos=xPos;
		this.yPos=yPos;
		this.name=name;
		walls=board.changePosition(width*yPos+xPos);
		this.board= board;
		this.width=board.getX();
	}
	

	/**
	 * moves x,y in given direction and saves walls at position
	 * @param direction
	 * @return true if move is possible
	 */
	public boolean move(String direction) {
		
		if(direction.toLowerCase().equals("north")&& walls[0]==true) {
			yPos+=1;
			walls=board.changePosition(width*yPos+xPos);
			return true;
		}
		else if(direction.toLowerCase().equals("south")&& walls[1]==true) {
			yPos-=1;
			walls=board.changePosition(width*yPos+xPos);
			return true;
		}	
		else if(direction.toLowerCase().equals("west")&& walls[2]==true) {
			xPos-=1;
			walls=board.changePosition(width*yPos+xPos);
			return true;
		}	
		else if(direction.toLowerCase().equals("east")&& walls[3]==true){
			xPos+=1;
			walls=board.changePosition(width*yPos+xPos);
			return true;
		}
		return false;
	}
	
	/**
	 * returns name of the player
	 * @return name
	 */
	public String getName() {
		return name;
	}

}

