package HW1;

public class BritishCat implements Cat {
    private String name;
    private boolean afraidOfDogs;

    @Override
    public void sayHello(){
        System.out.println("Hi, I'm British cat");
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public boolean isAfraidOfDogs() {
        return afraidOfDogs;
    }
    @Override
    public void setAfraidOfDogs(boolean afraidOfDogs) {
        this.afraidOfDogs = afraidOfDogs;
    }

}

