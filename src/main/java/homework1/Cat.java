package homework1;

public interface Cat {
    default String meow(){
        return "Meow!";
    }

    String getName();

    int getAge();

    int getWeight();

    String getOwnerName();

    void setName(String name);

    void setWeight(int weight);

    void setAge(int age);
}
