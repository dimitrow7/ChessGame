import java.util.ArrayList;

public class King extends Piece {

	boolean castle;

	public King(Player player, String type) {
		super(player, type);
		castle = true;
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