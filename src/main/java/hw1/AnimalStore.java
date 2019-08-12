package hw1;

public class AnimalStore {

    Animal cat;

    public int countLegs(){
        AnimalFactory catFactory = new CatFactory();
        cat = catFactory.animalCreator();
        return cat.legs();
    }

}
