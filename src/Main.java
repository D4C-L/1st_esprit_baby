import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ZooManagment zoo = new ZooManagment();
        System.out.println(zoo);
        Zoo zoo1 = new Zoo("zooology","Ghazela", 24);
        zoo1.displayZoo();
        System.out.println(zoo1);
        Animal animal = new Animal("cats", "lion", 8, true);
        System.out.println(animal);
    }
}