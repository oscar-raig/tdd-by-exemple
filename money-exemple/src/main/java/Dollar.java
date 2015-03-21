/**
 * Created by oscarraigcolon on 19/3/15.
 */
public class Dollar  extends Money{

  //private int amount;

  public Dollar(int amount) {
   super(amount);
  }

  public Dollar times(int multiplier) {
    return new Dollar(amount * multiplier);
  }

  public boolean equals(Object object) {
    Money dollar = (Dollar) object;
    return amount == dollar.amount;
  }


}
