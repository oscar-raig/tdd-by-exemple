/**
 * Created by oscarraigcolon on 21/3/15.
 */
abstract class Money {
  protected final int amount;
  protected String currency;

  public Money(int amount, String currency) {
    this.amount = amount;
    this.currency = currency;
  }

  abstract Money times(int multiplier);

  public String currency() {
    return currency;
  }


  public boolean equals(Object object) {
    Money money = (Money) object;
    return amount == money.amount && getClass().equals(money.getClass());
  }

  public static Money dollar(int amount) {
    return new Dollar(amount,"USD");
  }

  public static  Franc franc(int amount) {
    return new Franc(amount,"CHF");
  }
}
