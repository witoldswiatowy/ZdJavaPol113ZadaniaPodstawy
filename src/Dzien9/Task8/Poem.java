package Dzien9.Task8;

public class Poem {
    private Author creator;
    private int stropheNumbers;

    public Poem (Author creator, int stropheNumbers){
        this.creator = creator;
        this.stropheNumbers = stropheNumbers;
    }

    public void print () {
        System.out.println(this);
    }

    public Author getCreator() {
        return creator;
    }

    public int getStropheNumbers() {
        return stropheNumbers;
    }

    @Override
    public String toString() {
        return "Poem{" +
                "creator=" + creator +
                ", stropheNumbers=" + stropheNumbers +
                '}';
    }
}
