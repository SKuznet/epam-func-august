package homeworks.hw1.cats;

public class Lion implements Cat {
    @Override
    public void makeVoice() {
        System.out.println("Roar like a lion.");
    }

    @Override
    public String makeAction() {
        return "sleeping";
    }
}
