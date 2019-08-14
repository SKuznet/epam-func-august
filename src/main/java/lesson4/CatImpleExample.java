package lesson4;

public class CatImpleExample {
    public static void main(String[] args) {
        CatL4 cat = new CatL4() {
            @Override
            public void getInfo(String t) {
                System.out.println("Something");
            }
        };

        cat.getInfo("Barsik");

        CatL4 cat1= t -> System.out.println(t);
        cat1.getInfo("Barsik");

        CatL4 cat2 = System.out::println;
        cat2.getInfo("Barsik");
    }
}
