package lesson4.homework4;

@FunctionalInterface
public interface CatFactory {
    CatInst createCat(String catName);
}

class Demo {
    public static void main(String[] args) {
        CatFactory catsFactory = CatInst::new;
        CatInst cat = catsFactory.createCat("Barsik");
        System.out.println(cat.toString());
    }
}