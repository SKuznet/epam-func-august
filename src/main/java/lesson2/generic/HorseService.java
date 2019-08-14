package lesson2.generic;

public class HorseService {
    public static void main(String[] args) {
        Horse buraya = new Horse(20,"Buraya", true, true);
        Horse seraya = new Horse(30,"Seraya", true, false);

        print(buraya, O -> O.getSpeed());
        print(buraya, O -> O.getName());
        print(seraya, P -> P.getSpeed());
        print(seraya, P -> P.getName());
    }

    private static void print(Horse horse, Get get){
        System.out.println(get.get(horse));
    }
}
