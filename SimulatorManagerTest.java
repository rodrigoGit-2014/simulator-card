package card.simulator.game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimulatorManagerTest {

    public static void main(String[] args) {

        List<Card> cards = getCards();
        List<Player> players = getPlayers();

        GameManager gameManager = new GameManager(CardGameTypes.ESCOBA, 2);
        gameManager.play();


        //Welcome to simulator card game
        //How many players is gonna be ? ___
        //Choose type of card game
        //1. Brisca
        //2. Escoba
        //3. Poto Sucio
        //**  option: __
        //*** loading configurations.....

        //Game start ..
        //The cards on the table are:
        //Cards for player1:
        //Cards for player2:


        //goal point: 9

        //initial1 state
        //player1 cards: 2, 9
        //player3 cards: 5, 11
        //cards over table: 1, 4
        //*shot1
        //player:1 - card:1,2,4
        //*shot2
        //player:3 - card:1,2,4,
        //shot3
        //player:1 - card:1,2,9
        //shot4
        //player:3 - card:1,2,9,11

        //**shuffle cards

        //initial2 state
        //player1 cards: 6, 8
        //player3 cards: 3, 12
        //cards over table: 1,2,9,11
        //shot5
        //player:1 - card:9,11
        //shot6
        //player:3 - card:9,11,12
        //shot7
        //player:1 - card:8,9,11,12
        //shot8
        //player:3 - card:3,8,9,11,12


        Shot shot1Player1 = new Shot(1, Arrays.asList(cards.get(0), cards.get(1), cards.get(3)), null, players.get(0));
        Shot shot2Player3 = new Shot(2, Arrays.asList(cards.get(0), cards.get(1)), Arrays.asList(cards.get(3), cards.get(4)), players.get(2));
        Shot shot3Player1 = new Shot(3, Arrays.asList(cards.get(0), cards.get(1), cards.get(8)), null, players.get(0));
        Shot shot4Player3 = new Shot(4, Arrays.asList(cards.get(0), cards.get(1), cards.get(8), cards.get(10)), null, players.get(2));

        Shot shot5Player1 = new Shot(5, Arrays.asList(cards.get(8), cards.get(10)), Arrays.asList(cards.get(0), cards.get(1), cards.get(5)), players.get(0));
        Shot shot6Player3 = new Shot(6, Arrays.asList(cards.get(8), cards.get(10), cards.get(11)), null, players.get(2));
        Shot shot7Player1 = new Shot(7, Arrays.asList(cards.get(7), cards.get(8), cards.get(10), cards.get(11)), null, players.get(0));
        Shot shot8Player3 = new Shot(8, Arrays.asList(cards.get(2), cards.get(7), cards.get(8), cards.get(10), cards.get(11)), null, players.get(2));

    }


    private static List<Player> getPlayers() {
        List<Player> players = new ArrayList<>();

        Player player1 = new Player(1, "player 1");
        Player player2 = new Player(1, "player 2");
        Player player3 = new Player(1, "player 3");

        players.add(player1);
        players.add(player2);
        players.add(player3);

        return players;
    }

    private static List<Card> getCards() {

        List<Card> cards = new ArrayList<>();

        Card card1 = new Card(1, 1);//*
        Card card2 = new Card(2, 2);//*
        Card card3 = new Card(3, 3);//*
        Card card4 = new Card(4, 4);//*
        Card card5 = new Card(5, 5);//*
        Card card6 = new Card(6, 6);//*
        Card card7 = new Card(7, 7);
        Card card8 = new Card(8, 8);//*
        Card card9 = new Card(9, 9);//*
        Card card10 = new Card(10, 10);
        Card card11 = new Card(11, 11);//*
        Card card12 = new Card(12, 12);//*

        cards.add(card1);
        cards.add(card2);
        cards.add(card3);
        cards.add(card4);
        cards.add(card5);
        cards.add(card6);
        cards.add(card7);
        cards.add(card8);
        cards.add(card9);
        cards.add(card10);
        cards.add(card11);
        cards.add(card12);

        return cards;
    }
}
