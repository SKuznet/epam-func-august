package homeworks.hw1.cats;

public class Tiger implements Cat {
    @Override
    public void makeVoice() {
        System.out.println("Roar like a Tiger.");
    }

    @Override
    public String makeAction() {
        return "deer hunting";
    }
}
