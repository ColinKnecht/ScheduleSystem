
public class GenerateSchedule 
{
	private int sunday;
	private int monday;
	private int tuesday;
	private int wednesday;
	private int thursday;
	private int friday;
	private int saturday;
	//private final int TOTALSHIFTSPERWEEK = 9;
	private int totalRestarauntShifts = 0;
	private int shift;
	private int valet1Shifts;
	private int valet2Shifts;
	private int valet3Shifts;
	Week week = new Week();
	
	public GenerateSchedule(Location l, Valet v, Valet c)
	{
		sunday = 1;
		monday = 1;
		tuesday = 1;
		wednesday = 1;
		thursday = 1;
		friday = 2;
		saturday = 2;
		
		totalRestarauntShifts = l.getTotalShiftsPerWeek();
		valet1Shifts = v.getWeeklyShifts();
		valet2Shifts = c.getWeeklyShifts();
		
		if (totalRestarauntShifts != valet1Shifts + valet2Shifts)
		{
			while (totalRestarauntShifts != valet1Shifts + valet2Shifts)
			{
				valet1Shifts = v.getWeeklyShifts();
				valet2Shifts = c.getWeeklyShifts();
				
			}
		}
		System.out.println(v.getFirstName() + " " + valet1Shifts);
		System.out.println(c.getFirstName() + " " + valet2Shifts);
	
	}
	
	public GenerateSchedule(Location l, Valet v)
	{
		totalRestarauntShifts = l.getTotalShiftsPerWeek();
		v.getWeeklyShifts();
	}
	
	public GenerateSchedule(Location l, Valet v, Valet c, Valet q)
	{
		week.getDaysThisWeek();
		//week.printDaysOfWeek();
		totalRestarauntShifts = l.getTotalShiftsPerWeek();
		valet1Shifts = v.getWeeklyShifts();
		valet2Shifts = c.getWeeklyShifts();
		valet3Shifts = q.getWeeklyShifts();
		
		if (totalRestarauntShifts != valet1Shifts + valet2Shifts + valet3Shifts)
		{
			while (totalRestarauntShifts != valet1Shifts + valet2Shifts + valet3Shifts)
			{
				valet1Shifts = v.getWeeklyShifts();
				valet2Shifts = c.getWeeklyShifts();
				valet3Shifts = q.getWeeklyShifts();
				
			}
		}
		System.out.println(v.getFirstName() + " " + valet1Shifts);
		System.out.println(c.getFirstName() + " " + valet2Shifts);
		System.out.println(q.getFirstName() + " " + valet3Shifts);
		
	}
	
	public int getValet1Shifts()
	{
		return valet1Shifts;
	}
	
	public int getValet2Shifts()
	{
		return valet2Shifts;
	}
	
	public int getValet3Shifts()
	{
		return valet3Shifts;
	}
	
	
	
}
