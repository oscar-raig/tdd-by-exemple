import org.junit.Assert;
import org.junit.Test;

/**
 * Created by oscarraigcolon on 21/3/15.
 */
public class TestFranc {

  @Test
  public void testEquality() {
    Assert.assertTrue(Money.franc(5).equals(Money.franc(5)));
    Assert.assertFalse(Money.franc(5).equals(Money.franc(6)));
  }

  @Test
  public void testFrancMultiplication() {

    Money five = Money.franc(5);
    Assert.assertEquals(Money.franc(10), five.times(2));
    Assert.assertEquals(Money.franc(15), five.times(3));
  }
}
