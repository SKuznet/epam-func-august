package homework2;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Main {

  public static void main(String[] args) {
    CatFactory catFactory = new CatFactory();
    Cat littleCat = catFactory.getCat(CatType.LITTLE);
    Cat mediumCat = catFactory.getCat(CatType.MEDIUM);
    Cat bigCat = catFactory.getCat(CatType.BIG);

    System.out.println("Consumer:");
    Consumer<Cat> consumer = s -> System.out.println(s.meow());
    consumer.accept(littleCat);
    consumer.accept(mediumCat);
    consumer.accept(bigCat);

    System.out.println("BiConsumer:");
    BiConsumer<Cat, Cat> biConsumer = ((s1, s2) ->System.out.println(s1.meow() + "   " + s2.meow()));
    biConsumer.accept(littleCat, mediumCat);
    biConsumer.accept(bigCat, mediumCat);
    biConsumer.accept(littleCat, bigCat);

    System.out.println("Function:");
    Function<Cat, String> function = s -> s.meow().toLowerCase();
    System.out.println(function.apply(littleCat));
    System.out.println(function.apply(mediumCat));
    System.out.println(function.apply(bigCat));

    System.out.println("BiFunction:");
    BiFunction<Cat, Cat, String> biFunction = (s1, s2) -> s1.meow().concat("   ").concat(s2.meow().toLowerCase());
    System.out.println(biFunction.apply(bigCat, littleCat));
    System.out.println(biFunction.apply(mediumCat, littleCat));
    System.out.println(biFunction.apply(bigCat, mediumCat));

    System.out.println("Predicate:");
    Predicate<Cat> predicate = O -> O.meow().isEmpty();
    System.out.println(predicate.test(bigCat));

    System.out.println("BiPredicate:");
    BiPredicate<Cat, Cat> biPredicate = (s1, s2) -> s1.meow().equalsIgnoreCase(s2.meow());
    System.out.println(biPredicate.test(bigCat, bigCat));
    System.out.println(biPredicate.test(bigCat, littleCat));

    System.out.println("Supplier:");
    Supplier<Cat[]> supplier = () -> new Cat[]{littleCat, bigCat};
    System.out.println(supplier.get()[0].meow() + "   " + supplier.get()[1].meow());

    System.out.println("Operator:");
    UnaryOperator<Cat> unaryOperator = sb ->{
      switch(sb.getType()){
        case MEDIUM:
          return new BigCat();
        case LITTLE:
          return new MediumCat();
        case BIG:
          return new BigCat();
         default:
           throw new IllegalArgumentException("Wrong cat type:" + sb.getType());
      }
    };

    BinaryOperator<Cat> binaryOperator = (sb1, sb2) -> {
      if(sb1.meow().length()<sb2.meow().length()){
        return sb2;
      }
      else return  sb1;
    };

    System.out.println(unaryOperator.apply(bigCat).meow());
    System.out.println(binaryOperator.apply(littleCat, mediumCat).meow());

  }

}
