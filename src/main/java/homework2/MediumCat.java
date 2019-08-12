package homework2;

public class MediumCat implements Cat {

  static CatType type = CatType.MEDIUM;

  @Override
  public String meow() {
    return "medium cat: MEEEOOOWWWW";
  }

  @Override
  public CatType getType() {
    return type;
  }
}
