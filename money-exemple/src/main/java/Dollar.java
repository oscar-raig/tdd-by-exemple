/**
 * Created by oscarraigcolon on 19/3/15.
 */
public class Dollar {

    int amount = 10;
    private int numberDollars;
    public Dollar(int NumberDollars){
      numberDollars = NumberDollars;
    }

    public Dollar times(int NumberOfTimes){

        Dollar newDollar = new Dollar(this.numberDollars);
        newDollar.amount = NumberOfTimes * this.numberDollars;
        return newDollar;
    }

}
