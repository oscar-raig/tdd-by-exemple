/**
 * Created by oscarraigcolon on 19/3/15.
 */
public class Dollar  extends Money{

  private String currency;

  public Dollar(int amount,String currency) {
    super(amount,currency);
  }

  public Money times(int multiplier) {
    return Money.dollar(amount * multiplier);
  }


  public String currency() {
    return currency;
  }


}
