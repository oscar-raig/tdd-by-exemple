/**
 * Created by oscarraigcolon on 21/3/15.
 */
public class Franc extends Money {

  //private int amount;

  public Franc(int amount) {
   super(amount);
  }

  public Franc times(int multiplier) {
    return new Franc(amount * multiplier);
  }

}
