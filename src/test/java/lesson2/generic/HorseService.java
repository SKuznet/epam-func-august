package lesson2.generic;

public class HorseService {
    public static void main(String[] args) {
        Horse buraya = new Horse(20, "Buraya", true, true);
        Horse seraya= new Horse(30, "Seraya", true, false);

        print(buraya, o -> o.getSpeed());
        print(buraya, o -> o.getName());
        print(seraya, p -> p.getSpeed());
        print(seraya, p -> p.getName());
    }

    public static void print (Horse horse, Get get) {
        System.out.println(get.get(horse));
    }
}
