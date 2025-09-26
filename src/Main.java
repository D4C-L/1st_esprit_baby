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
        Animal dog = new Animal("dogs", "chiuaua", 5, true);
        boolean create2 = zoo1.addAnimal(dog);
        if (create2)
            System.out.println("Animal added");
        else
            System.out.println("Animal not added");
        for(int i=0; i<26;i++) {
            boolean create = zoo1.addAnimal(new Animal("cats", "lion", i, true));
            if (create)
                System.out.println("Animal added");
            else
                System.out.println("Animal not added");
        }
        System.out.println(zoo1);
        zoo1.showAnimals();
        System.out.println(zoo1.searchAnimal(dog));
        System.out.println(zoo1.searchAnimal(zoo1.animals[1]));
        System.out.println(zoo1.searchAnimal(zoo1.animals[4]));
    }
}