package lesson7;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class CompFuture {

  public static void main(String[] args) {
    CompletableFuture<String> future = CompletableFuture.supplyAsync(()-> {
      try{
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      return "hi";
    });

    System.out.println("Start");
//    System.out.println(future.get());
    System.out.println("End");
  }

}
