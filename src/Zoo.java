public class Zoo {
    Animal[]  animals;
    String name;
    String city;
    int nbrCages;
    int cmp;

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

    public void addAnimal(Animal animal){
    if (cmp<nbrCages)
        animals[cmp++] = animal;
    }

    public void showAnimals(){
        for (int i=0;i<cmp;i++)
            System.out.println(animals[i]);
    }

    public String toString(){return "le zoo va contenir "+this.nbrCages+" cages.";}

}
