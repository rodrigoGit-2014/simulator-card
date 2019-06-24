package card.simulator.game;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;

public class ActionIterator implements Iterator<Integer> {

    private int totalTurn;
    private int startTurn;
    private int players;
    private int currentPlayer;
    private List<List<Card>> playersCard;
    private boolean[][] cardPlayedTrack;


    public ActionIterator(Integer tTurn, Integer players, List<List<Card>> cards) {
        this.startTurn = 0;
        this.totalTurn = tTurn;
        this.players = players;
        this.currentPlayer = 0;
        this.playersCard = cards;

        cardPlayedTrack = new boolean[players][cards.get(0).size()];

    }


    public boolean hasNext() {
        return startTurn < totalTurn;
    }

    public Integer next() {
        if (hasNext()) {
            int currentPlayerMove = (currentPlayer % players) + 1;
            int indexRandomCard = getRandomCard(currentPlayerMove);
            List<Card> cardx = playersCard.get(currentPlayerMove-1);
            System.out.println("Player " + currentPlayerMove + " --- Card launch is: " + cardx.get(indexRandomCard));
            currentPlayer++;
            if (currentPlayer >= players) currentPlayer = 0;
            int currentTurn = startTurn;
            startTurn++;
            return currentTurn;
        }
        throw new NoSuchElementException();
    }

    public int getRandomCard(int currentPlayerIndex) {
        Random r = new Random();

        boolean foundCard = false;
        int indexCard = 0;
        while (!foundCard) {
            int pick = r.nextInt(totalTurn / 2);
            if (!cardPlayedTrack[currentPlayerIndex - 1][pick]) {
                cardPlayedTrack[currentPlayerIndex - 1][pick] = true;
                foundCard = true;
                indexCard = pick;
            }

        }
        return indexCard;
    }

}
