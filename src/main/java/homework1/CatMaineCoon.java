package homework1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CatMaineCoon implements Cat {
    private final String breed = "Maine Coon";
    private String name;
    private int weight;
    private int age;
    private String ownerName;
}
