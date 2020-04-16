
public class Board {


    private static final int BOARD_SIZE = 40;
    private Square[] squares;


    public Board(){
        this.squares =  new Square[BOARD_SIZE];
        squares[0] = new Square(0,"Go");
        for (int i = 1; i < BOARD_SIZE; i++) {
            squares[i] = new Square(i,"Square " + i);
        }
    }

    public Square getSquare(Square oldLoc, int fvTot){
        int newPos = (oldLoc.getId() + fvTot) % BOARD_SIZE;
        return this.squares[newPos];
    }

    public Square getSquare(int id){
        if(id >= BOARD_SIZE || id < 0){
            throw new IndexOutOfBoundsException("This square is out of the board");
        }
        return squares[id];
    }






}
