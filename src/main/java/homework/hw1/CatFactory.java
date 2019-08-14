package homework.hw1;

public class CatFactory implements AnimalFactory {

    @Override
    public Animal createRepresentative() {
        return new Cat();
    }

    public Animal createRepresentative(String name, Integer age, CatType catType, boolean usedForWitchCraft) {
        return new Cat();
    }
}
