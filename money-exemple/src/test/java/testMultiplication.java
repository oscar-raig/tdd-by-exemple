import org.junit.Test;
import org.junit.*;
/**
 * Created by oscarraigcolon on 19/3/15.
 */

public class testMultiplication {
    @Test
    public void  testDollarFive(){
        Dollar five= new Dollar(5);
        five.times(2);
        Assert.assertEquals(10, five.amount);
  }
}
