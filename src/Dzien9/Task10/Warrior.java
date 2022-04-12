package Dzien9.Task10;

import java.util.Random;

public class Warrior {

    private String name;
    private int strangh;
    private int hp;
    private int ini;

    public Warrior(String name, int strangh, int hp, int ini) {
        this.name = name;
        this.strangh = strangh;
        this.hp = hp;
        this.ini = ini;
    }

    public boolean isALife (){
        return hp > 0;
    }

    public void attack (Warrior warrior){
        Random randomNumber = new Random();
        if (isALife()) {
            int hit = strangh + randomNumber.nextInt(10);
            warrior.hp -= hit;
            System.out.println("Wojownik " + this.name + " zaatakował " + " za " + hit + " wojownika " + warrior.name);
        }
    }

    public static void fightingWith (Warrior warrior1, Warrior warrior2){
        while (warrior1.isALife() && warrior2.isALife()){
            if (warrior1.isALife()){
                warrior1.attack(warrior2);
            }
            if (warrior2.isALife()){
                warrior2.attack(warrior1);
            }
        }
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "name='" + name + '\'' +
                ", strangh=" + strangh +
                ", hp=" + hp +
                '}';
    }
}
