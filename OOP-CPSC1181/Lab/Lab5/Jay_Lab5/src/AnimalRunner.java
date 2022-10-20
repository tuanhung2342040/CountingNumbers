import java.awt.*;
import java.util.*;

public class AnimalRunner
{
    public static void main(String[] args)
    {
        // 1.1
        ArrayList<Speakable> dogcatList = new ArrayList<>();
        dogcatList.add(new Dog("Fred"));
        dogcatList.add(new Cat("Wanda"));
        for (Speakable sp : dogcatList)
        {
            sp.speak();
        }
        System.out.println();
        // Casting class objects 1.2
        Dog d1 = new Dog("Fred");
        d1.speak();
        Dog d2;
        Object obj = new Dog("Connie");
        d2 = (Dog)obj;
        d2.speak();

        // Try to cast A Cat to A Dog
//        Cat c = new Cat("Antony");
//        c.speak();
//        Dog d3 = (Dog)c;
//        d3.speak();


    }

}
class Dog implements Speakable
{
    private String name;

    public Dog(String name)
    {
        this.name = name;
    }

    public void speak()
    {
        System.out.println("Woof! Woof!");
    }

    public String toString()
    {
        return "Dog:  " + name;
    }
}

class Cat implements Speakable
{
    private String name;

    public Cat(String name)
    {
        this.name = name;
    }

    public void speak()
    {
        System.out.println("Meow! Meow!");
    }

    public String toString()
    {
        return "Cat:  " + name;
    }
}
