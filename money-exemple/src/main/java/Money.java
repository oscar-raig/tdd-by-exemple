/**
 * Created by oscarraigcolon on 21/3/15.
 */
public class Money {
  protected final int amount;

  public Money(int amount) {
    this.amount = amount;
  }

  public Money times(int multiplier) {

    return new Money(amount * multiplier);
  }

  public boolean equals(Object object) {
    Money money = (Money) object;
    return amount == money.amount && getClass().equals(money.getClass());
  }
}
