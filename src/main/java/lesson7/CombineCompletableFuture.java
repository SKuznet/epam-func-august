package lesson7;

import java.util.concurrent.CompletableFuture;

public class CombineCompletableFuture {

  public static void main(String[] args) {
//    CompletableFuture<CompletableFuture<Integer>> result = getUserDetails(5)
//        .thenApply(CombineCompletableFuture::getCreditRating);

  }

  static CompletableFuture getUserDetails(int userId) {
    return CompletableFuture.supplyAsync(() -> UserService.getUserDetail(userId));
  }

  static CompletableFuture<Integer> getCreditRating(User user) {
    return CompletableFuture.supplyAsync(() -> CreditRatingService.gegtCreditRating(user));
  }
}

class UserService {

  static User getUserDetail(int id) {
    return new User(id);
  }
}

class CreditRatingService {

  static Integer gegtCreditRating(User user) {
    CreditRating rating = new CreditRating(user.getId());
    return rating.getRating();
  }
}

class CreditRating {

  private int rating;

  public CreditRating(int rating) {
    this.rating = rating;
  }

  public int getRating() {
    return rating;
  }

  public void setRating(int rating) {
    this.rating = rating;
  }
}

class User {

  private String name;
  private int id;

  public User(int id) {
    this.name = "Jack " + id;
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }
}
