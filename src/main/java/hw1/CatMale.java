package hw1;

public class CatMale implements Cat{

    private int lives = 9;

    public int getLives() {
        return lives;
    }

    public CatMale decrementLives() {
        this.lives--;
        return this;
    }

    @Override
    public void setLives(int lives) {
        this.lives = lives;
    }

    @Override
    public String call() {
        return ("Mew");
    }

    @Override
    public String toString(){
        return "Cat{" +
                "type=" + this.getClass() +
                ", lives=" + this.getLives() +
                "}";
    }
}
