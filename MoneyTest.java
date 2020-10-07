import org.junit.Test;
import static org.junit.Assert.*;

class MoneyTest{
  @Test
  public void testMultiplication() {
    Dollar five = new Dollar(5);
    five.times(2);
    assertEquals(10, five.amount);
  }
}