package hw1;

public class CatFactory {

  public static Cat create (String catName){
    return new Cat(catName);
  }
}
