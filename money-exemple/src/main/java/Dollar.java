/**
 * Created by oscarraigcolon on 19/3/15.
 */
public class Dollar {

    int amount = 10;
    public Dollar(int amount){
      this.amount= amount;
    }

    public void times(int multiplier){
      amount= amount * multiplier;

    }
}
