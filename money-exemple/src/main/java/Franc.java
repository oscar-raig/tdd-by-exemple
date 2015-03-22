/**
 * Created by oscarraigcolon on 21/3/15.
 */
public class Franc extends Money {

 // private String currency;

  public Franc(int amount, String currency) {
    super(amount,currency);
  }

  public Money times(int multiplier) {
    return Money.franc(amount * multiplier);
  }



}
