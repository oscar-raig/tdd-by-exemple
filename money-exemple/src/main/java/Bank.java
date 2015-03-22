
//import com.sun.tools.javac.util.Pair;

import java.util.Hashtable;

/**
 * Created by oscarraigcolon on 22/3/15.
 */
public class Bank {

  private Hashtable rates= new Hashtable();

  public Money reduce(Expression source, String to) {

    return source.reduce(this,to);

  }
  int rate(String from, String to) {
    if (from.equals(to)) return 1;
    Integer rate= (Integer) rates.get(new Pair(from, to));
    return rate.intValue();
  }
  void addRate(String from, String to, int rate) {
    rates.put(new Pair(from, to), new Integer(rate));
  }
}
