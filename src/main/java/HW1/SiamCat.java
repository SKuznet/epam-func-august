package HW1;

public class SiamCat implements Cat {
    private String name;
    private int age;
    private boolean afraidOfDogs;

    @Override
    public void sayHello(){
        System.out.println("Hi, I'm Siam cat");
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