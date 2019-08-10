package homework1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CatSiamese implements Cat {
    private final String breed = "Siamese";
    private String name;
    private int weight;
    private int age;
    private String ownerName;
}
