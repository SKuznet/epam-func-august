package Horses;

public class HorseService {
    public static void main(String[] args) {
        Horse rusak = new Horse(20, true, "Rusak", true);
        Horse sizaya = new Horse(30, true, "Sizaya", false);
        printName(rusak, o -> o.getName());
        printSpeed(rusak, c -> c.getSpeed());
        printName(sizaya, u -> u.getName());
        printSpeed(sizaya, v -> v.getSpeed());
    }

    private static void printName(Horse horse, GetName get) {
        System.out.println(get.get(horse));
    }

    private static void printSpeed(Horse horse, GetSpeed get) {
        System.out.println(get.get(horse));
    }
}
