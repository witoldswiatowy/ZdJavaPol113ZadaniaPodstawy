package Dzien9.Task10;

public class Main {
    public static void main(String[] args) {
        Warrior warrior1 = new Warrior("Artur", 5, 20,5);
        Warrior warrior2 = new Warrior("Hanz", 7, 18,5);

        System.out.println(warrior1.toString());
        System.out.println(warrior2.toString());
        Warrior.fightingWith(warrior1,warrior2);
        System.out.println(warrior1.toString());
        System.out.println(warrior2.toString());

    }
}
