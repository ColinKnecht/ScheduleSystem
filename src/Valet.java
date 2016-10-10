import java.util.Random;

public class Valet 
{
	private String firstName;
	private String lastName;
	private int maxShiftsPerWeek;
	private int minShiftsPerWeek;
	private int shiftsThisWeek;
	Random ranGen = new Random();
	
	public Valet(String firstName, String lastName)//Constructor
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Valet(String firstName, String lastName, int maxShiftsPerWeek, int minShiftsPerWeek)//Constructor
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.maxShiftsPerWeek = maxShiftsPerWeek;
		this.minShiftsPerWeek = minShiftsPerWeek;
	}
	
	public int getWeeklyShifts()
	{
		//minimum + rn.nextInt(maxValue - minvalue + 1)
		//shiftsThisWeek = ranGen.nextInt(maxShiftsPerWeek + 1);
		shiftsThisWeek = minShiftsPerWeek + ranGen.nextInt(maxShiftsPerWeek - minShiftsPerWeek + 1);
		
		return shiftsThisWeek;
	}
	
	public String getFirstName() 
	{
		return firstName;
	}
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	public String getLastName() 
	{
		return lastName;
	}
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}
	public int getMaxShiftsPerWeek() 
	{
		return maxShiftsPerWeek;
	}
	public void setMaxShiftsPerWeek(int maxShiftsPerWeek) 
	{
		this.maxShiftsPerWeek = maxShiftsPerWeek;
	}
	public int getMinShiftsPerWeek() 
	{
		return minShiftsPerWeek;
	}
	public void setMinShiftsPerWeek(int minShiftsPerWeek) 
	{
		this.minShiftsPerWeek = minShiftsPerWeek;
	}

	
}//end Valet Class
