package card.simulator.game;

public class GameManager {

    private Game game;



    public GameManager(CardGameTypes cardGameTypes, int players) {
        game = new Game(1, players, cardGameTypes);

    }

    public void play() {



      //  int countOfMoves = getMovesCount();
        int countOfMoves =1;

        while (countOfMoves > 0) {

            Action action = new Action(game);
            System.out.println("Start Play-Move: " + countOfMoves);
            System.out.println();

            for (Integer t : action) {
                System.out.println(t);
            }
            System.out.println("End Play-Move: " + countOfMoves);
            System.out.println();
            countOfMoves--;//= ASSIGN_CARDS * PLAYERS;

        }


    }


}
