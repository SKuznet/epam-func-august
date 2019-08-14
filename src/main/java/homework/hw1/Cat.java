package homework.hw1;

public class Cat extends Pet {

    private CatType catType;
    private boolean UsedForWitchCraft;

    public Cat() {
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
        return "Meaw";
    }
}
