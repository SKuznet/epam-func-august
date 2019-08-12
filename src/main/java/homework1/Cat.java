package homework1;

import java.util.Objects;
import java.util.Random;

/**
 * Class cat. Contains name, age and color
 *
 * @author Ilia Ugriumov
 */
public class Cat {
    private String name;
    private int age;
    private String colorFur;
    private Random rnd = new Random ();

    public Cat(String name, int age, String colorFur) {
        this.name = name;
        this.age = age;
        this.colorFur = colorFur;
    }

    public Cat(String name, String colorFur) {
        this.name = name;
        this.colorFur = colorFur;
        age = rnd.nextInt ( 20 );
    }

    /**
     * Is cat hungry
     *
     * @return if random == 1 return false. Else return tru;
     */
    public boolean isHungry() {
        if (rnd.nextInt ( 3 ) == 1) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        Cat cat = (Cat) o;
        return age == cat.age &&
                Objects.equals ( name, cat.name ) &&
                Objects.equals ( colorFur, cat.colorFur ) &&
                Objects.equals ( rnd, cat.rnd );
    }

    @Override
    public int hashCode() {
        return Objects.hash ( name, age, colorFur, rnd );
    }

    /**
     * Method do cat name to upper case
     *
     * @return name in upper case;
     */
    public Cat doNametoUpperCase() {
        this.setName ( getName ().toUpperCase () );
        return this;
    }

    /**
     * Set cat voice
     *
     * @param specialVoice - string with cat voice
     * @return string. cat voice
     */
    public String setVoice(String specialVoice) {
        return specialVoice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColorFur() {
        return colorFur;
    }

    public void setColorFur(String colorFur) {
        this.colorFur = colorFur;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", colorFur='" + colorFur + '\'' +
                '}';
    }
}
