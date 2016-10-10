
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Week 
{
	private ArrayList<Day> DaysOfWeek = new ArrayList<Day>();
	private Locale locale = Locale.US;
	private Calendar cal = new GregorianCalendar(locale);
	private DateFormat df = DateFormat.getDateInstance(DateFormat.FULL,locale);
	
	public void getDaysThisWeek()
	{
		cal.setTime(new Date()); 
		cal.setFirstDayOfWeek(Calendar.SUNDAY);
		
		cal.set(Calendar.DAY_OF_WEEK, cal.getFirstDayOfWeek());
		
		for (int i = 0; i < 7; i++)
		{
			String nameofMonth = cal.getDisplayName(Calendar.MONTH, Calendar.LONG, locale);
			String nameofDay = cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, locale);
			int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
			
			System.out.println(dayOfMonth + " : " + df.format(cal.getTime()));
			Day weekDay = new Day(dayOfMonth);
			DaysOfWeek.add(weekDay);
			
			cal.add(Calendar.DAY_OF_WEEK, 1);
		}
	}
	
	public void printDaysOfWeek()
	{
		for (int i=0; i < DaysOfWeek.size(); i++)
		{
			System.out.println(DaysOfWeek.get(i));
		}
	}
}
