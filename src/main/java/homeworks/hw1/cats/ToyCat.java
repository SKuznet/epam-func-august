package homeworks.hw1.cats;

public class ToyCat implements Cat {
    @Override
    public void makeVoice() {
        System.out.println("Squeak");
    }

    @Override
    public String makeAction() {
        return "Play game";
    }
}
