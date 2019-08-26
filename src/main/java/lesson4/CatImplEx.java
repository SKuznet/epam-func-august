package lesson4;

public class CatImplEx {
    public static void main(String[] args) {
        Cat cat = new Cat() {
            @Override
            public void getInfo(String t) {
                System.out.println(t);
            }
        };

        cat.getInfo("Barsik");

        // ==
        Cat cat1 = t -> System.out.println(t);
        cat1.getInfo("Barsik");

        // ==
        Cat cat2 = System.out::println;
        cat2.getInfo("Barsik");
    }
}
