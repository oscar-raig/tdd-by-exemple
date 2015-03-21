import org.junit.Assert;
import org.junit.Test;

/**
 * Created by oscarraigcolon on 19/3/15.
 */

public class TestDollar {


  @Test
  public void testEquality() {
    Assert.assertTrue(new Dollar(5).equals(new Dollar(5)));
    Assert.assertFalse(new Dollar(5).equals(new Dollar(6)));
  }

  @Test
  public void testDollarstep4() {
    Dollar five = new Dollar(5);
    Assert.assertEquals(new Dollar(10), five.times(2));
    Assert.assertEquals(new Dollar(15), five.times(3));
  }
}
