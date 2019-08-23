package lesson7;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class CombineCompletableFuture {
    public static void main(String[] args) {
        CompletableFuture<CompletableFuture<Integer>> result = getUserDetails(5)
                .thenApply(CombineCompletableFuture::getCreditRaing);

        try {
            TimeUnit.SECONDS.sleep(1);
            System.out.println(result.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        CompletableFuture<Integer> result2 = getUserDetails(5)
                .thenCompose(CombineCompletableFuture::getCreditRaing);

        try {
            System.out.println(result2.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

    static CompletableFuture<User> getUserDetails(int userId) {
        return CompletableFuture.supplyAsync(() -> UserService.getUserDetails(userId));
    }

    static CompletableFuture<Integer> getCreditRaing(User user) {
        return CompletableFuture.supplyAsync(() -> CreditRatingService.getCreditRating(user));
    }
}

//Bad practice
class User {
    private String name;
    private int id;

    public User(int id) {
        this.name = "Jack" + id;
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

class CreditRatingService {
    static Integer getCreditRating(User user) {
        CreditRating rating = new CreditRating(user.getId());
        return rating.getRating();
    }
}

class UserService {
    static User getUserDetails(int id) {
        return new User(id);
    }
}

