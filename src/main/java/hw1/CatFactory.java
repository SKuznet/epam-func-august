package hw1;

public class CatFactory implements AnimalFactory {
    @Override
    public Animal animalCreator() {
        return new Cat();
    }
}
