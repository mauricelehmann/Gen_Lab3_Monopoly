

public class Player {

    private String name;
    private Piece piece;

    public Player(String name){
        this.name = name;
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





}
