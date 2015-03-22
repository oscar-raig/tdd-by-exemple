import org.junit.Assert;
import org.junit.Test;

/**
 * Created by oscarraigcolon on 19/3/15.
 */

public class TestDollar {


  @Test
  public void testEquality() {
    Assert.assertTrue(Money.dollar(5).equals(Money.dollar(5)));
    Assert.assertFalse(Money.dollar(5).equals(Money.dollar(6)));
  }

  @Test
  public void testDollarMultiplication() {
    Money five = Money.dollar(5);
    Assert.assertEquals(Money.dollar(10), five.times(2));
    Assert.assertEquals(Money.dollar(15), five.times(3));
  }
}
