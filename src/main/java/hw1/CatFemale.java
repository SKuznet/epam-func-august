package hw1;

public class CatFemale implements Cat {

    private int lives = 9;

    @Override
    public int getLives() {
        return lives;
    }

    @Override
    public CatFemale decrementLives() {
        this.lives--;
        return this;
    }

    @Override
    public void setLives(int lives) {
        this.lives = lives;
    }

    @Override
    public String call() {
        return ("Murr");
    }

    @Override
    public String toString(){
        return "Cat{" +
                "type=" + this.getClass() +
                ", lives=" + this.getLives() +
                "}";
    }
}
