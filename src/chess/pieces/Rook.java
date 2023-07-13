package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {

	public Rook(Board board, Color color) {
		super(board, color);
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		
		Position p = new Position(0,0);
		
		//above
		p.setValues(position.getRow() - 1, position.getColumn());
		while(getBoard().positionExits(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setRow(p.getRow()-1);
		}
		if(getBoard().positionExits(p) && isThereOpponentPiece(p)) {
			p.setRow(p.getRow());
		}
		
		//left
		p.setValues(position.getRow(), position.getColumn() - 1);
		while(getBoard().positionExits(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setRow(p.getColumn()-1);
		}
		if(getBoard().positionExits(p) && isThereOpponentPiece(p)) {
			p.setRow(p.getRow());
		}
		//right
		p.setValues(position.getRow(), position.getColumn() + 1);
		while(getBoard().positionExits(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setRow(p.getColumn()+1);
		}
		if(getBoard().positionExits(p) && isThereOpponentPiece(p)) {
			p.setRow(p.getRow());
		}
		
		//below
		p.setValues(position.getRow() + 1, position.getColumn());
		while(getBoard().positionExits(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setRow(p.getRow()+1);
		}
		if(getBoard().positionExits(p) && isThereOpponentPiece(p)) {
			p.setRow(p.getRow());
		}
		
		return null;
	}
	
	
	@Override
	public String toString() {
		
		return " R";
	}

}
