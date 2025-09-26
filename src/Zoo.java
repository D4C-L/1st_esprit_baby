import java.util.Objects;

public class Zoo {
    public Animal[]  animals;
    String name;
    String city;
    final int nbrCages;
    public int cmp;

    public Zoo(String name, String city, int nbrCages) {
        if(nbrCages < 26)
            this.nbrCages = nbrCages;
        else
            this.nbrCages = 25;
        this.name = name;
        this.city = city;
        animals = new Animal[this.nbrCages];
        cmp=0;
    }

    public void displayZoo() {
        System.out.println("Zoo: " + this.name + " /" + this.city + " /" + this.nbrCages);
    }

    public boolean addAnimal(Animal animal){
    if (cmp<nbrCages)
    {
        animals[cmp++] = animal;
        return true;
    }
    return false;
    }

    public void showAnimals(){
        for (int i=0;i<cmp;i++)
            System.out.println(animals[i]);
    }

    public int searchAnimal(Animal animal){
        int i=0;
        while (i<cmp){
           if(Objects.equals(animals[i].name, animal.name))
               return i;
           i++;
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal){
        int i=0;
        while (i<cmp){
            if(Objects.equals(animals[i].name, animal.name))
            {
                for(int j=i;j<animals.length-1;j++)
                    animals[i]=animals[j];
                return true;
            }
            i++;
        }
        return false;
    }

    public boolean isZooFull(){return cmp==nbrCages;}

    public static Zoo compareZoo(Zoo zoo1,Zoo zoo2){
        if(zoo1.cmp>zoo2.cmp)
            return zoo1;
        return zoo2;
    }

    public String toString(){return "le zoo va contenir "+this.nbrCages+" cages.";}

}
