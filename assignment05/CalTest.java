
import org.junit.*;
import static org.junit.Assert.*;


public class CalTest {

  public static void main(String args[]){
    org.junit.runner.JUnitCore.main("CalTest");
  }

  @Before
  public void setup() {
    // TODO
  }

  @Test
  public void testSameMonthDiffDay() {
    int days_diff = Cal.cal(1, 3, 1, 12, 2018);
    assertEquals("Same Month Different Days", days_diff, 9);
  }

  @Test
  public void testSameMonthSameDay() {
    int days_diff = Cal.cal(1, 8, 1, 8, 2018);
    assertEquals("Same Month Same Day", days_diff, 0);
  }

  @Test
  public void testFebMarchLeapYear() {
    int days_diff = Cal.cal(2, 20, 3, 1, 2016);
    assertEquals("Check End of Feb Leap Year (2016)", days_diff, 10);
  }

  @Test
  public void testFebMarchLeapYear2000() {
    int days_diff = Cal.cal(2, 20, 3, 1, 2000);
    assertEquals("Check End of Feb Leap Year (2000)", days_diff, 10);
  }

  @Test
  public void testFebMarchNotLeapYear() {
    int days_diff = Cal.cal(2, 20, 3, 1, 2018);
    assertEquals("Check End of Feb NOT Leap Year (2018)", days_diff, 9);
  }

  @Test
  public void testFebMarchNotLeapYear2100() {
    int days_diff = Cal.cal(2, 20, 3, 1, 2017);
    assertEquals("Check End of Feb NOT Leap Year (2100)", days_diff, 9);
  }

  @Test
    public void testEndDates() {
    Cal c = new Cal();
    int month1=1;
    int day1=31;
    int month2 = 3;
    int day2 = 31;
    int year = 2018;
    int x = c.cal(month1,day1,month2,day2,year);
    assertEquals(59,x);
  }
}
