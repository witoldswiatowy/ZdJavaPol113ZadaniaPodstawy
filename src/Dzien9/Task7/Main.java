package Dzien9.Task7;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Mruczek");
        System.out.println(cat1.toString());
        System.out.println(cat1);
        cat1.print();

        Cat cat2 = new Cat("Filemon");
        cat1.equals(cat2);

        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Mruczek");
        cats[1] = new Cat("Filemon");
        cats[2] = new Cat("Bonifacy");

        int i = 5;
        for(Cat cat : cats){
            cat.print();
            cat.makeSound();
            cat.eatMice(i++ * i);
            System.out.println();
        }
    }
}
