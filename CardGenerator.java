package abstractfactory;

import card.simulator.game.Card;
import card.simulator.game.GameProperties;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CardGenerator {

    private GameProperties gameProperties;
    private boolean[] trackCards;

    public CardGenerator(GameProperties proper) {
        this.gameProperties = proper;
        this.trackCards = new boolean[gameProperties.getNumberTotalOfCard()];
    }


    public List<Card> getRandomCards(int howManyCards) {
        List<Card> cards = new ArrayList<>();
        Random random = new Random();
        while (howManyCards > 0) {
            int randomCard = random.nextInt(gameProperties.getNumberTotalOfCard());
            if (isNotUsedCard(randomCard)) {
                trackCards[randomCard] = true;
                howManyCards--;
                cards.add(new Card(randomCard + 1, randomCard + 1));
            }
        }
        return cards;
    }

    private boolean isNotUsedCard(int indexCardTrack) {
        return !trackCards[indexCardTrack];
    }

}
