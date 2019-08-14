package lesson5;

public class User {
    String name;
    String surName;

    public User(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }
}
