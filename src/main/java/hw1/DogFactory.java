package hw1;

public class DogFactory implements AnimalFactory {
    @Override
    public Animal animalCreator() {
        return new Dog();
    }
}
