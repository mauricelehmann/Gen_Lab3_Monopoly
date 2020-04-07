/*
* Dans le monopolyGame on va créer 8 instance de pièces
* avec chacune un nom spécifique.
*
*
*  */

public class Piece {

    private String name;
    private Square location;

     Piece(String name, Square startSquare){
         this.name = name;
         this.location = startSquare;
    }

    String getName(){
        return name;
    }

    Square getLocation(){
        return location;
    }

    //Mouvement de la pièce sur le board, il faut
    //récupérer l'id actuel de notre Square(location)
    //et l'incrémenter
    void movement(int diceValue){
         int newId = (location.getId() + diceValue) % 40;
         this.location = new Square(newId);
    }
}
