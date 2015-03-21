/**
 * Created by oscarraigcolon on 21/3/15.
 */
public class Franc {

  private int amount = 10;

  public Franc(int amount) {
    this.amount = amount;
  }

  public Franc times(int multiplier) {

    return new Franc(amount * multiplier);
  }

  public boolean equals(Object object) {
    Franc dollar = (Franc) object;
    return amount == dollar.amount;
  }
}
