

public class MonopolyGame {

    private static final int MAX_ROUND = 20;

    private Player[] players;
    private final Board board = new Board();
    private int round = 0;
    private final Dice[] dices = {new Dice(), new Dice()};

    public MonopolyGame(int numberOfPlayer){

        //NumberOfPlayer is checked in the main console

        this.players =  new Player[numberOfPlayer];
        for (int i = 0; i < numberOfPlayer; i++) {
            this.players[i] = new Player("Player " + i, board, dices);
            this.players[i].setPiece(new Piece("Piece " + i, board.getSquare(0)));
        }
    }

    public void playGame(){
        for (int i = 0; i < MAX_ROUND; i++) {
            playRound();
        }
    }

    private void playRound(){
        for(Player player : players){
            player.takeTurn();
        }
    }

}
