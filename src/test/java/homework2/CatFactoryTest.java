package homework2;

import org.junit.*;
import static org.assertj.core.api.Assertions.assertThat;

public class CatFactoryTest {

  private CatFactory catFactory;

  @Before
  public void init() {

    catFactory = new CatFactory();

  }

  @Test
  public void testGetCat() {
    assertThat(catFactory.getCat(CatType.MEDIUM).getType()).isEqualTo(CatType.MEDIUM);
    assertThat(catFactory.getCat(CatType.BIG).getType()).isEqualTo(CatType.BIG);
    assertThat(catFactory.getCat(CatType.LITTLE).getType()).isEqualTo(CatType.LITTLE);

    assertThat(catFactory.getCat(CatType.MEDIUM).getType()).isNotEqualTo(CatType.BIG);
    assertThat(catFactory.getCat(CatType.MEDIUM).getType()).isNotEqualTo(CatType.LITTLE);

    assertThat(catFactory.getCat(CatType.BIG).getType()).isNotEqualTo(CatType.MEDIUM);
    assertThat(catFactory.getCat(CatType.BIG).getType()).isNotEqualTo(CatType.LITTLE);

    assertThat(catFactory.getCat(CatType.LITTLE).getType()).isNotEqualTo(CatType.BIG);
    assertThat(catFactory.getCat(CatType.LITTLE).getType()).isNotEqualTo(CatType.MEDIUM);

  }

}
