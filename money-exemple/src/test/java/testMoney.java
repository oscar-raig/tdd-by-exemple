import org.junit.Assert;
import org.junit.Test;

public class TestMoney {
  @Test
  public void testEquality() {
    Assert.assertTrue(Money.dollar(5).equals(Money.dollar(5)));
    Assert.assertFalse(Money.dollar(5).equals(Money.dollar(6)));
    Assert.assertTrue(Money.franc(5).equals(Money.franc(5)));
    Assert.assertFalse(Money.franc(5).equals(Money.franc(6)));
    Assert.assertFalse(Money.franc(5).equals(Money.dollar(5)));
  }

  @Test
  public void testCurrency() {
    Assert.assertEquals("USD", Money.dollar(1).currency());
    Assert.assertEquals("CHF", Money.franc(1).currency());
  }



  @Test
  public void testSimpleAdditionWithExpressionAndBank() {
    Money five = Money.dollar(5);
    Expression sum = five.plus(five);
    Bank bank = new Bank();
    Money reduced = bank.reduce(sum, "USD");
    Assert.assertEquals(Money.dollar(10), reduced);
  }

  @Test
  public void testReduceSum() {
    Expression sum = new Sum(Money.dollar(3), Money.dollar(4));
    Bank bank = new Bank();
    Money result = bank.reduce(sum, "USD");
    Assert.assertEquals(Money.dollar(7), result);
  }

  @Test
  public void testReduceMoney() {
    Bank bank = new Bank();
    Money result = bank.reduce(Money.dollar(1), "USD");
    Assert.assertEquals(Money.dollar(1), result);
  }

  @Test
  public void testReduceMoneyDifferentCurrency() {
    Bank bank = new Bank();
    bank.addRate("CHF", "USD", 2);
    Money result= bank.reduce(Money.franc(2), "USD");
    Assert.assertEquals(Money.dollar(1), result);
  }

  @Test
  public void testIdentityRate() {
    Assert.assertEquals(1, new Bank().rate("USD", "USD"));
  }

}