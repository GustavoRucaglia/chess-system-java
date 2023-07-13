package Application;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {
	public static void main(String[] args) {
		
		Scanner tcd = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();
		
		while(true) {
			UI.printBoard(chessMatch.getPieces());
			System.out.println();
			System.out.println("Source: ");
			ChessPosition source = UI.readChessPosition(tcd);
			
			System.out.println("\nTarget: ");
			ChessPosition target = UI.readChessPosition(tcd);
			
			ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
		}
	}
}
