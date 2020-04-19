
public class Player {

    public static final int INITIAL_NETWORTH = 1500;

    private String name;
    private Piece piece;
    private Board board;
    private Dice[] dices;
    private int netWorth;

    public Player(String name, Board board, Dice[] dices){
        this.name = name;
        this.board = board;
        this.dices = dices;
        this.netWorth = Player.INITIAL_NETWORTH;
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

        piece.setLocation(board.getSquare(piece.getLocation(), fvTot));
    }

    public void addCash(int cash) throws Exception{
        if(cash < 0)
            throw new Exception("Income cash should be greater than zero");
        netWorth += cash;
    }


    public int getNetWorth() {
        return netWorth;
    }

    public void reduceCash(int min) {
        //TODO check bound ? no negatif netWorth
        netWorth -= min;
    }

}
