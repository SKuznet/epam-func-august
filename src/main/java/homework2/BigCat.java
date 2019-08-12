package homework2;

public class BigCat implements Cat {

  static CatType type = CatType.BIG;

  @Override
  public String meow() {
    return "big cat: MEEEEEEEEEEEEOOOOOOOOOOOOOWWWWWWWWWWWW";
  }

  @Override
  public CatType getType() {
    return type;
  }
}
