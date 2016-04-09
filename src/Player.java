
public class Player {
	
	boolean isWhite;
	boolean isBlack;
	boolean turn=false;
	
	public Player(boolean color) {
		if(color){
			isWhite=true;
			isBlack=false;
		}
		else{
			isWhite=false;
			isBlack=true;
		}
		
	}
	public boolean getColor(){
		return isWhite;
	}
	public boolean isTurned(){
		return turn;
	}
	public void changeTurn(){
		turn=!turn;
	}

}
