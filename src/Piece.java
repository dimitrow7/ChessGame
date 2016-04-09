import java.util.ArrayList;

public abstract class Piece {
 private Player player;
 String typeOfpiece;
 boolean firstMove=true;
 public Piece(Player player, String type) {
	this.player=player;
	this.typeOfpiece=type;
}
public Player getPlayer() {
	return player;
}
 
 public boolean playerColor(){
	 return ("white").equals(player.getColor());
 }
 public void firstMove(){
	 firstMove=true;
 }
 public boolean hasMove(){
	 return firstMove;
 }
 public boolean getPieceColor() {
		return player.isWhite;
	}
	
	public String getType() {
		return typeOfpiece;
	}

	public abstract boolean isValid(Square[][] board, int prevX, int prevY,
			int finX, int finY);
	
	public abstract ArrayList<Square> getPotentialMoves(Square[][] board, int prevX, int prevY);

}