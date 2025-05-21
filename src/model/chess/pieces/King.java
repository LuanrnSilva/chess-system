package model.chess.pieces;

import enumerator.Color;
import model.boardgame.Board;
import model.chess.ChessPiece;

public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }

}
