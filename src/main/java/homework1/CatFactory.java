package homework1;

import java.util.function.Supplier;

public class CatFactory {
    
    private static final String BARSIK = "Barsik";
    private static final String MURZIK = "Murzik";
    private int BarsikNumber = 1;
    private int MurzikNumber = 1;

    public Cat createCat(String catType) {
        Supplier<Cat> supplier;
        
        if (catType.equalsIgnoreCase(BARSIK)) {
            supplier = () -> new Barsik(BARSIK + BarsikNumber++, false, false);
        } else if (catType.equalsIgnoreCase(MURZIK)) {
            supplier = () -> new Murzik(MURZIK + MurzikNumber++, false, false);
        } else {
            throw new RuntimeException("Unexpected type of cat!");
        }
        
        return supplier.get();
    }
}
