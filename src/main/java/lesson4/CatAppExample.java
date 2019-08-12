package lesson4;

public class CatAppExample {

  public static void main(String[] args) {

    Cat cat = new Cat() {
      @Override
      public void getInfo(String t) {
        System.out.println(t);
      }
    };
    Cat cat1 = t -> System.out.println(t);
    Cat cat2 = System.out::println;

  }

}
