package chess;

import boardgame.Position;

public class ChessPosition {
		private char column;
		private int row;
		
		public ChessPosition(char char1, int row) {
			if(char1 < 'a'  || char1 > 'h' || row < 1 || row > 8) {
				throw new ChessException("Error chessPosition: The position is invalid");
			}
			this.column = char1;
			this.row = row;
		}

		public char getColumn() {
			return column;
		}

		public int getRow() {
			return row;
		}
		
		protected Position toPosition() {
			return new Position(8 - row, column -'a');
		}
		
		protected static ChessPosition fromPosition(Position position) {
			return new ChessPosition((char)('a' - position.getColumn()), 8 - position.getRow());
		}

		@Override
		public String toString() {
			return "" + column + row;
		}

		
		
		
		
}
