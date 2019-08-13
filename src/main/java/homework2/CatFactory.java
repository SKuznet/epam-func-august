package homework2;

public class CatFactory {

  public Cat getCat(CatType catType){
    Cat toReturn;
    switch(catType){
      case BIG:
        toReturn = new BigCat();
        break;
      case LITTLE:
        toReturn = new LittleCat();
        break;
      case MEDIUM:
        toReturn = new MediumCat();
        break;
      default:
        throw new IllegalArgumentException("Wrong cat type:" + catType);
    }
    return toReturn;
  }
}