import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;


public class Day extends Week
{
	private int dayOfMonth;
	private Locale locale = Locale.US;
	private Calendar cal = new GregorianCalendar(locale);
	Date date = new Date();
	DateFormat df = new SimpleDateFormat("yy-MM-EEEE");
	
	public Day(int dayOfMonth)
	{
		this.dayOfMonth = dayOfMonth;
	}
	public void printDay()
	{
	System.out.println(df.format(date));
	}
	
	public void printDays()
	{
		for(int i=0; i < 7; i++)
		{
			System.out.println(df.format(date));
		}
	}
}
