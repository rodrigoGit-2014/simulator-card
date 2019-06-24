package card.simulator.game;

public class Card {

    private int id;
    private int value;

    public Card(int id, int value) {
        this.id = id;
        this.value = value;
    }

    @Override
    public String toString() {
        return " " + id + " ";
    }
}
