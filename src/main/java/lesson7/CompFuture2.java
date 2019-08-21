package lesson7;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompFuture2 {

  public static void main(String[] args) {
    CompletableFuture<String> future = CompletableFuture.supplyAsync(()->"hi");
    future.thenAccept(System.out::println);

    try{
      future.get();
    } catch (InterruptedException| ExecutionException e){
      e.printStackTrace();
    }
  }

}
