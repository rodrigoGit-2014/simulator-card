package card.simulator.game;

import java.util.List;

public class Shot {

    private int id;
    private List<Card> cardsOnTable;
    private List<Card> cardsWon;
    private Player player;

    public Shot(int id, List<Card> cardsTable, List<Card> cardsHold, Player player) {
        this.id = id;
        this.cardsOnTable = cardsTable;
        this.cardsWon = cardsHold;
        this.player = player;
    }
}
