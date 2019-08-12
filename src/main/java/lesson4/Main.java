package lesson4;

public class Main {

  public static void main(String[] args) {
    int val1 = 100;
    int val2 = 30;
    int result = action(val1, val2, MyMathUtil::minus);
    System.out.println(result);
  }


  public static int action(int val1, int val2, MyFunction myFunction) {
    return myFunction.doSomething(val1, val2);
  }
}
