
//TODO : POur l'instant on a :
/*
* assertEquals
* assertSame
* assertNotEquals
* assertTrue
* assertNotNull
*
*
* ParametizedTest
* Test
* RepeatedTest
* BeforeAll
*
* */

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String userInput;
        int numberOfPlayer;

        while(true){
            System.out.println("Entrer le nombre de joueurs (2-8)");

            userInput = scanner.nextLine();
            numberOfPlayer = Integer.parseInt(userInput);

            if(numberOfPlayer > 8 || numberOfPlayer  < 2){
                System.out.println("Nombre de joueurs incorrect");
            }else{
                break;
            }
        }

        MonopolyGame game = new MonopolyGame(numberOfPlayer);
        game.playGame();

        System.out.println("\nLa partie est terminée.");

    }
}
