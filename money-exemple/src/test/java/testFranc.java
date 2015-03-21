import org.junit.Assert;
import org.junit.Test;

/**
 * Created by oscarraigcolon on 21/3/15.
 */
public class TestFranc {
  @Test
  public void testFrancMultiplication() {

    Franc five = new Franc(5);
    Assert.assertEquals(new Franc(10), five.times(2));
    Assert.assertEquals(new Franc(15), five.times(3));
  }
}
