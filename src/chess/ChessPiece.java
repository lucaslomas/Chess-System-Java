package chess;

import boardGame.Board;
import boardGame.Piece;
import boardGame.Position;

public abstract class ChessPiece extends Piece {
    private Color color;
    private int moveCount;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }
    public ChessPosition getChessPosition(){
        return ChessPosition.fromPostion(position);
    }

    public Color getColor() {
        return color;
    }

    public int getMoveCount() {
        return moveCount;
    }
    public int increasetMoveCount(){
        return moveCount++;
    }
    public int decreaseMoveCount(){
        return moveCount--;
    }

    protected boolean IsThereAOpponentPiece(Position position){
        ChessPiece p = (ChessPiece) getBoard().piece(position);
        return p != null && p.getColor() != color;
    }
}
