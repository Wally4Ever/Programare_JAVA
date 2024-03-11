import java.util.Random;

public class ValentinP_L3_11 {

	private static final int BOARD = 3;
	private static final char EMPTY = '*';
	private static final char PLAYER_X = 'X';
	private static final char PLAYER_O = 'O';

	private char[][] board;

	public ValentinP_L3_11() {
		board = new char[BOARD][BOARD];
		for (int i = 0; i < BOARD; i++) {
			for (int j = 0; j < BOARD; j++) {
				board[i][j] = EMPTY;
			}
		}
	}

	public void play() {
		char currentPlayer = PLAYER_X;
		Random rand = new Random();
		int noEmpty = BOARD * BOARD;

		while (noEmpty > 0 && !hasWinner()) {
			// executes until there are no empty spots or there's a winner
			int row, col;
			do {
				row = rand.nextInt(BOARD);
				col = rand.nextInt(BOARD);
			} while (board[row][col] != EMPTY);
			// found an empty spot
			board[row][col] = currentPlayer;
			// set X or O at empty position
			noEmpty--;
			// less empty positions
			System.out.println("Current board:");
			printBoard();

			if (currentPlayer == PLAYER_X) {
				currentPlayer = PLAYER_O;
			} else {
				currentPlayer = PLAYER_X;
			}
			// change player
		}
		// board is either full or has winner
		if (hasWinner()) {
			// currentPlayer was changed last in loop so need to change it back
			if (currentPlayer == PLAYER_X) {
				currentPlayer = PLAYER_O;
			} else {
				currentPlayer = PLAYER_X;
			}
			System.out.println("Player " + currentPlayer + " wins!");
		} else {
			System.out.println("It's a tie!");
		}
	}

	private boolean hasWinner() {
		for (int i = 0; i < BOARD; i++) {
			// rows
			if (board[i][0] != EMPTY && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
				return true;
			}
			// Check columns
			if (board[0][i] != EMPTY && board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
				return true;
			}
		}
		// diagonal
		if (board[0][0] != EMPTY && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
			return true;
		}
		if (board[0][2] != EMPTY && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
			return true;
		}
		// winner not found
		return false;
	}

	private void printBoard() {
		for (int i = 0; i < BOARD; i++) {
			for (int j = 0; j < BOARD; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		ValentinP_L3_11 game = new ValentinP_L3_11();

		game.play();
		game.printBoard();
	}
}
