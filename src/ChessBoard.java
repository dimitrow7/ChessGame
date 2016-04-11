import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class ChessBoard extends JLayeredPane {

	private static int BOARD_WIDTH = 600;
	private static int BOARD_HEIGHT = 600;
	private Dimension size = new Dimension(BOARD_WIDTH, BOARD_HEIGHT);
	private JPanel chessBoard;
	private JPanel[][] chessBoardGrid = new JPanel[8][8];
	private Square[][] gameBoard;

	public ChessBoard() {
		chessBoard = new JPanel(new GridLayout(8, 8));
		chessBoard.setPreferredSize(size);
		chessBoard.setBounds(0, 0, BOARD_WIDTH, BOARD_HEIGHT);

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				chessBoardGrid[i][j] = new JPanel(new GridBagLayout());
				chessBoard.add(chessBoardGrid[i][j]);

				if (i % 2 == 0) {
					if (j % 2 == 0) {
						chessBoardGrid[i][j].setBackground(Color.GRAY);
					} else {
						chessBoardGrid[i][j].setBackground(Color.WHITE);
					}
				} else {
					if (j % 2 == 0) {
						chessBoardGrid[i][j].setBackground(Color.WHITE);
					} else {
						chessBoardGrid[i][j].setBackground(Color.GRAY);
					}
				}
			}
		}
	}
}
