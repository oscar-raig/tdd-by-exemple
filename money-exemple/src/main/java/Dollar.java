/**
 * Created by oscarraigcolon on 19/3/15.
 */
public class Dollar {

  private int amount = 10;

  public Dollar(int amount) {
    this.amount = amount;
  }

  public Dollar times(int multiplier) {

    return new Dollar(amount * multiplier);
  }

  public boolean equals(Object object) {
    Dollar dollar = (Dollar) object;
    return amount == dollar.amount;
  }
}
