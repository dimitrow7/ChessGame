import java.util.ArrayList;

public class Queen extends Piece {

	String pieceType;

	public Queen(Player player, String type) {
		super(player, type);
		pieceType = type;
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isValid(Square[][] board, int prevX, int prevY, int finX, int finY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Square> getPotentialMoves(Square[][] board, int prevX, int prevY) {
		// TODO Auto-generated method stub
		return null;
	}
}