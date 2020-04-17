

public class Player {

    private String name;
    private Piece piece;
    private Board board;
    private Dice[] dices;

    public Player(String name, Board board, Dice[] dices){
        this.name = name;
        this.board = board;
        this.dices = dices;
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
        int fvTot = 0;
        for (int i = 0; i < dices.length; i++) {
            dices[i].roll();
            fvTot += dices[i].getFaceValue();
        }

        System.out.println("Total du lancer des dés : " + fvTot);

        piece.setLocation(board.getSquare(piece.getLocation(), fvTot));

    }





}
