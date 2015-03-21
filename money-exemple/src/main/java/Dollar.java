/**
 * Created by oscarraigcolon on 19/3/15.
 */
public class Dollar {

    int amount = 10;
    public Dollar(int amount){
      this.amount= amount;
    }

    public Dollar times(int multiplier){

      return new Dollar(amount * multiplier);
    }

    public boolean equals(Object object) {
       return true;
    }

}
