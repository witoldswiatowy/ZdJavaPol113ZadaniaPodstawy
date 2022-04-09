package Dzien9.Task7;

import java.util.Objects;

public class Cat {
    private String name;

    public Cat(String name){
        this.name = name;
    }

    public Cat(){
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getName(String name) {
        this.name = name;
    }
//    public void setName1(String newName) {
//        name = newName;
//    }
    //to jest to samo co  zthis, ale musimy wymyslac nowe nazwy

    // gettery i settery nie powinnismy tworzyc zawsze, bo po co maja wisiec nie uzywane metody.
    // Jesli potrzebujemy je to wtedy tworzymy. Zreszta zastanowmy sie po co zmieniac konkretna zmienna


    public void makeSound(){
        System.out.println(" Miau miau");
    }

    public void eatMice (int mice) {
        System.out.println(" I ate " + mice + " mice.");
    }
    public void print () {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(name, cat.name);
    }

}
