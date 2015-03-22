/**
 * Created by oscarraigcolon on 21/3/15.
 */
class Money {
  protected final int amount;
  protected String currency;

  public Money(int amount, String currency) {
    this.amount = amount;
    this.currency = currency;
  }

  Money times(int multiplier) {
    return new Money(amount * multiplier,currency);
  }

  public String currency() {
    return currency;
  }


  public boolean equals(Object object) {
    Money money = (Money) object;
    return amount == money.amount && currency().equals(money.currency());
  }

  public static Money dollar(int amount) {
    return new Money(amount,"USD");
  }

  public static  Money franc(int amount) {
    return new Money(amount,"CHF");
  }

  public String toString() {
    return amount + " " + currency;
  }
}
