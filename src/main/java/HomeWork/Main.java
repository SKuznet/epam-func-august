package HomeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

import static HomeWork.CatCreator.catCreator;
import static HomeWork.CatCreator.catPrinter;

public class Main {

        public static void main(String[] args) {
            List<MyCat> myCatList = new ArrayList<>();
            myCatList = catCreator(4);

            catPrinter(myCatList);

            //Consumer
            Consumer<List> consumer = o -> System.out.println(o.size());
            consumer.accept(myCatList);

            //BiConsumer
            BiConsumer<MyCat, MyCat> biConsumer = (mc1, mc2) -> System.out.println("Summarily: " + (mc1.getAge() + mc2.getAge()));
            biConsumer.accept(myCatList.get(0), myCatList.get(1));

            //Function
            Function<MyCat, String> function = o -> o.getName().toUpperCase();
            System.out.println(function.apply(myCatList.get(0)));

            //BiFunction
            BiFunction<MyCat, MyCat, Integer> biFunction = (o1, o2) -> (o1.getAge() + o2.getAge());
            System.out.println(biFunction.apply(myCatList.get(3), myCatList.get(2)));

            //UnaryOperator
            List<MyCat> finalMyCatList = myCatList;
            UnaryOperator<Integer> unaryOperator = o -> o.compareTo(finalMyCatList.get(0).getAge());
            System.out.println(unaryOperator.apply(myCatList.get(2).getAge()));

            //BinaryOperator
            BinaryOperator<String> binaryOperator = (o1, o2) -> o1.concat(o2);
            System.out.println(binaryOperator.apply(myCatList.get(0).getName(), myCatList.get(2).getName()));

            //Supplier
            List<MyCat> finalMyCatList1 = myCatList;
            Supplier<String[]> supplier = () -> new String[]{finalMyCatList1.get(0).getName(), finalMyCatList1.get(1).getName(), finalMyCatList1.get(2).getName()};
            System.out.println(Arrays.toString(supplier.get()));


        }
}
