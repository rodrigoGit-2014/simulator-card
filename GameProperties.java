package card.simulator.game;

public class GameProperties {

    private int NUMBER_TOTAL_CARD;
    private int NUMBER_CARD_TO_DISTRIBUTE_ON_TABLE;
    private int NUMBER_CARD_TO_DISTRIBUTE_BY_PLAYER;

    public int getNumberTotalOfCard() {
        return NUMBER_TOTAL_CARD;
    }

    public int getNumberOfCardToDistributeOnTable() {
        return NUMBER_CARD_TO_DISTRIBUTE_ON_TABLE;
    }

    public int getNumberOfCardToDistributeByPlayer() {
        return NUMBER_CARD_TO_DISTRIBUTE_BY_PLAYER;
    }

    public GameProperties(CardGameTypes cardGameTypes){
        if (CardGameTypes.ESCOBA == cardGameTypes){

        }
    }

    public GameProperties(){}
    public GameProperties(int numTotCard, int numCardDistTable, int numCardDistPlayer) {
        this.NUMBER_TOTAL_CARD = numTotCard;
        this.NUMBER_CARD_TO_DISTRIBUTE_ON_TABLE = numCardDistTable;
        this.NUMBER_CARD_TO_DISTRIBUTE_BY_PLAYER = numCardDistPlayer;
    }

}
