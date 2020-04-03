package main.java;

/*
* Dans le monopolyGame on va créer 8 instance de pièces
* avec chacune un nom spécifique.
*
*
*  */

public class Piece {

    private String name;
    //private Square location;


//    Piece(String name, Square startSquare){
//        this.name = name;
//        this.square = startSquare;
//    }

    String getName(){
        return name;
    }

//    Square getLocation(){
//        return square;
//    }

    //Mouvement de la pièce sur le board, il faut
    //récupérer l'id actuel de notre Square(location)
    //et l'incrémenter
//    void movement(int diceValue){
//        int idSquare = square.getId();
//        int tmpId = idSquare + diceValue;
//
//        if(tmpId > 39){ //Square.VALUE_MAX ??
//            //les square id vont de 0 à 39
//            idSquare = (tmpId % (39 + 1));
//        }else{
//            idSquare = tmpId;
//        }
//      this.square = idSquare;
//    }






}
