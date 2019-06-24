package card.simulator.game;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Action implements Iterable<Integer> {
    private static final int TOTAL_CARDS = 40;
    private final int ASSIGN_CARDS = 3;
    private int total;
    private int players;
    private List<List<Card>> cards;
    private static boolean[] trackCards = new boolean[TOTAL_CARDS];
    ;

    public Action(Game game) {
        this.total = total;
        this.players = players;
        cards = new ArrayList<>();
        for (int i = 0; i < players; i++) {
            // cards.add(getRandomCards(ASSIGN_CARDS));
            cards.add(game.getCardGenerator().getRandomCards(ASSIGN_CARDS));

        }

    }

    public Iterator<Integer> iterator() {
        return new ActionIterator(total * players, players, cards);
    }

}
