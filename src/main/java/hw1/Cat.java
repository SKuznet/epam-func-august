package hw1;

public class Cat {
  private String name;

  public Cat(String name) {
    this.name=name;  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public static Cat antiCat (Cat cat){
   StringBuilder stringBuilder=new StringBuilder(cat.getName());
   cat.setName(stringBuilder.reverse().toString());
   return cat;
  }

  public static Cat catMerge (Cat cat1, Cat cat2){
    return new Cat(cat1.getName()+cat2.getName());
  }
  public static boolean hasName (Cat cat){
    return cat.getName().isEmpty();
  }
}
