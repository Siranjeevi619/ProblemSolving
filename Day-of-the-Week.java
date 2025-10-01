import java.util.Calendar;
import java.util.GregorianCalendar;
public class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        Calendar calendar = new GregorianCalendar(year, month - 1, day);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        return days[dayOfWeek - 1];
    }
}