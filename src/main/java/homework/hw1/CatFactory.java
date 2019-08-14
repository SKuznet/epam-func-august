package homework.hw1;

public class CatFactory implements AnimalFactory {

    @Override
    public Cat createRepresentative() {
        return new Cat();
    }

    public Cat createRepresentative(String name, Integer age, CatType catType, boolean usedForWitchCraft) {
        return new Cat(name, age, catType, usedForWitchCraft);
    }
}
