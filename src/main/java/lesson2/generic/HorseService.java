package lesson2.generic;

public class HorseService {
  public static void main(String[] args){
    Horse burays = new Horse(20, "Buraya", true, true);

    print(burays, O->O.getSpeed());
    print(burays, O->O.getName());
  }

  private static void print (Horse horse,Get get){
    System.out.println(get.get(horse));
  }

}
