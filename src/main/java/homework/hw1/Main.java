package homework.hw1;

import java.util.function.*;

public class Main {

    public static void main(String[] args) {

        CatFactory animalCreator = new CatFactory();

        Animal savannah = animalCreator.createRepresentative("Rini", 4, CatType.WILDHYBRID, false);
        Pet abyssinian = animalCreator.createRepresentative("Glinda", 2, CatType.DOMESTIC, true);

        // Supplier example
        Supplier<Cat> sphynx = () -> animalCreator.createRepresentative();
        Cat ragdoll = sphynx.get();

        // Consumer example
        Consumer<Animal> printSound = animal -> animal.getSound();
        printSound.accept(savannah);
        printSound.accept(abyssinian);

        // Function example
        Function<Cat, String> reactToWitchcraft = cat -> cat.isUsedForWitchCraft() ? "AAAGRH!!" : "You're so fluffy, oh so fluffy!";
        System.out.println(reactToWitchcraft.apply((Cat) savannah));
        System.out.println(reactToWitchcraft.apply((Cat) abyssinian));
        System.out.println(reactToWitchcraft.apply(ragdoll));

        // BiFunction example
        BiFunction<Pet, Pet, Boolean> compareAge = (pet1, pet2) -> pet1.getAge().equals(pet2.getAge()) ;
        System.out.println(compareAge.apply((Pet)savannah, abyssinian).toString());
        System.out.println(compareAge.apply((Pet)savannah, ragdoll).toString());

        // UnaryOperator example
        UnaryOperator<Integer> makeOlder = pet -> ++pet;
        System.out.println(makeOlder.apply(((Pet)savannah).getAge()));
        System.out.println(makeOlder.apply((abyssinian).getAge()));
        System.out.println(makeOlder.apply((ragdoll).getAge()));

        // Predicate example
        Predicate<Cat> hasWildBlood = cat -> cat.getCatType().equals(CatType.WILDHYBRID);
        if (hasWildBlood.test((Cat)savannah) || hasWildBlood.test((Cat)abyssinian) || hasWildBlood.test((Cat)ragdoll)){
            System.out.println("One of them is a wildhybrid!");
        } else {
            System.out.println("There are no wildhybrids among them!");
        }
    }
}
