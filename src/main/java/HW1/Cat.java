package HW1;

abstract class Cat {
    boolean afraidOfDogs;
    String name;
    abstract void sayHello();
    String getName() {
        return name;
    }
    void setName(String name) {
        this.name = name;
    }
    boolean isAfraidOfDogs() {
        return afraidOfDogs;
    }
    void setAfraidOfDogs(boolean afraidOfDogs) {
        this.afraidOfDogs = afraidOfDogs;
    }




}
