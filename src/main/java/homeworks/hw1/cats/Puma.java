package homeworks.hw1.cats;

public class Puma implements Cat {
    @Override
    public void makeVoice() {
        System.out.println("Roar like a Puma and go to the tree.");
    }

    @Override
    public String makeAction() {
        return "Go to the tree";
    }
}
