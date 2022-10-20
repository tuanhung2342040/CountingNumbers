import java.util.*;

public class Person{
    private String name;
    private int age;
    private Memory mem;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        mem = new Memory();
        mem.addLifeData("Name: " + name);
        mem.addLifeData("Age:  " + age);
    }

    public String toString() {
        return "Name:  " + name + '\n' +
                "Age:  " + age + '\n';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void tellAll() {
        mem.dumpMemory();
    }

    public void rememberAnEvent(String s) {
        mem.addLifeData(s);
    }

    // Start of inner class Memory
}
