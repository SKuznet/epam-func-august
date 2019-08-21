package lesson6.hw2;

import java.util.Arrays;

public class Values {
  private String[] values;

  public String[] getValues() {
    return values;
  }

  public void setValues(String[] values) {
    this.values = values;
  }

  @Override
  public String toString() {
    return "Values{" +
        "values=" + Arrays.toString(values) +
        '}';
  }


}
