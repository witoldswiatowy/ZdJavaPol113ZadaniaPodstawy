package Dzien9.Task8;

public class Main {
    public static void main(String[] args) {

        Author szymborska = new Author("Szymborska", "Polskie");
        Author tuwin = new Author("Tuwin", "Polskie");
        Author muller = new Author("Muller", "Niemieckie");

        Poem[] poems = new Poem[3];
        poems[0] = new Poem(szymborska, 30);
        poems[1] = new Poem(tuwin, 45);
        poems[2] = new Poem(muller, 23);

        System.out.println(authortheLongestPoem(poems));

    }
        private static Author authortheLongestPoem (Poem[] poems){
        Author author = poems[0].getCreator();
        int poemLenght = 0;
        for (int i = 0; i < poems.length; i++){
            if (poemLenght < poems[i].getStropheNumbers()){
                poemLenght = poems[i].getStropheNumbers();
                author = poems[i].getCreator();
            }
        }
        return author;
        }
}
