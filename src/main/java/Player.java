

public class Player {

    private String name;
    private Piece piece;
    private Board board;
    private Cup cup;

    public Player(String name, Board board, Cup cup){
        this.name = name;
        this.board = board;
        this.cup = cup;
    }

    public void setPiece(Piece piece){
        this.piece = piece;
    }
    
    public String getName(){
        return this.name;
    }

    public Piece getPiece(){
        return this.piece;
    }

    public void takeTurn(){
        cup.roll();
        int fvTot = cup.getTotal();
        System.out.println("Total du lancer des dés : " + fvTot);

        piece.setLocation(board.getSquare(piece.getLocation(), fvTot));
    }





}
