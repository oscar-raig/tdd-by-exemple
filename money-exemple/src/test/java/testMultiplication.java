import org.junit.Test;
import org.junit.*;
/**
 * Created by oscarraigcolon on 19/3/15.
 */

public class testMultiplication {
    @Test
    public void  testDollarFive(){
        Dollar five= new Dollar(5);
        Dollar ten = five.times(2);
        Assert.assertEquals(10, ten.amount);
  }
  @Test
    public void testMultiplication() {
    Dollar five = new Dollar(5);
    Dollar product = five.times(2);

    Assert.assertEquals(10, product.amount);
    product = five.times(3);
    Assert.assertEquals(15, product.amount);
  }

  @Test
  public void testEquality() {
    Assert.assertTrue(new Dollar(5).equals(new Dollar(5)));
    Assert.assertFalse(new Dollar(5).equals(new Dollar(6)));
  }
}
