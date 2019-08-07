package lesson2.horses;

public class HorseService {

  public static void main(String[] args) {
    Horse risak = new Horse(20,"Risak",true,true);
    Horse sizaya = new Horse(20,"Sizya",true,false);

    printSpeed(risak, O -> O.getSpeed());
    printName(risak, O -> O.getName());

    printSpeed(risak, U -> U.getSpeed());
    printName(risak, U -> U.getName());
  }

  private static void printName(Horse horse, GetName nameOf){
    System.out.println(nameOf.get(horse));
  }

  private static void printSpeed(Horse horse, GetSpeed speedOf){
    System.out.println(speedOf.get(horse));
  }


}
