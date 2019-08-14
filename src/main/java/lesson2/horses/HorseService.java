package lesson2.horses;

public class HorseService {
    public static void main(String[] args) {
        Horse risak = new Horse(20,"Risak",true, true);
        Horse sizaya = new Horse(30,"Sizaya",true, false);

        printSpeed(risak,o -> o.getSpeed());
        printName(risak, o -> o.getName());
        printSpeed(sizaya, u -> u.getSpeed());
        printName(sizaya, u -> u.getName());
    }

    private static void printName(Horse horse, GetName getName){
        System.out.println(getName.get(horse));
    }

    private static void printSpeed(Horse horse, GetSpeed getSpeed){
        System.out.println(getSpeed.get(horse));
    }
}
