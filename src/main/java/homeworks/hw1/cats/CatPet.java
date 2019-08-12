package homeworks.hw1.cats;

public class CatPet implements Cat {
    @Override
    public void makeVoice() {
        System.out.println("Meow");
    }

    @Override
    public String makeAction() {
        return "Mouse hunting";
    }
}
