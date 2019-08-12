package homework2;

public class LittleCat implements Cat {

  static CatType type = CatType.LITTLE;

  @Override
  public String meow() {
    return"little cat: meow";
  }

  @Override
  public CatType getType() {
    return type;
  }
}
