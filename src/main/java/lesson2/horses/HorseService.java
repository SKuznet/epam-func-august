package lesson2.horses;

public class HorseService {
    public static void main(String[] args) {
        Horse risak = new Horse(20, "Risak", true, true);
        Horse sizaya = new Horse(30, "Sizaya", true, false);

        printSpeed(risak, O -> O.getSpeed());
        printName(risak, O -> O.getName());

        printSpeed(sizaya, U -> U.getSpeed());
        printName(sizaya, U -> U.getName());
    }

    // don't repeat!
    private static void printName(Horse horse, GetName get) {
        System.out.println(get.get(horse));
    }

    private static void printSpeed(Horse horse, GetSpeed get) {
        System.out.println(get.get(horse));
    }
}
