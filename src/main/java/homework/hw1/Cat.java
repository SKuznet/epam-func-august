package homework.hw1;

import java.util.Objects;

public class Cat extends Pet {

    private CatType catType;
    private boolean UsedForWitchCraft;

    public Cat() {
        this.setName("Random");
        this.setAge(4);
        this.setCatType(CatType.DOMESTIC);
        this.setUsedForWitchCraft(false);
    }

    public Cat(String name, Integer age, CatType catType, boolean usedForWitchCraft) {
        super(name, age);
        this.catType = catType;
        UsedForWitchCraft = usedForWitchCraft;
    }

    public CatType getCatType() {
        return catType;
    }

    public void setCatType(CatType catType) {
        this.catType = catType;
    }

    public boolean isUsedForWitchCraft() {
        return UsedForWitchCraft;
    }

    public void setUsedForWitchCraft(boolean usedForWitchCraft) {
        UsedForWitchCraft = usedForWitchCraft;
    }

    @Override
    public String getSound() {
        System.out.println("Meaw");
        return "Meaw";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        if (isUsedForWitchCraft() != cat.isUsedForWitchCraft()) return false;
        return getCatType() == cat.getCatType();
    }

    @Override
    public int hashCode() {
        int result = getCatType() != null ? getCatType().hashCode() : 0;
        result = 31 * result + (isUsedForWitchCraft() ? 1 : 0);
        return result;
    }
}
