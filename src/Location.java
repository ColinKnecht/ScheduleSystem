import java.util.ArrayList;

public class Location 
{
	private String locationName;
	private String address;
	private String notes; //notes about specific location
	private int totalShiftsPerWeek;///num of total shifts in week i.e. 9 @Indaco
	public ArrayList<Valet> workers = new ArrayList<Valet>();
	
	public Location(String locationName, int totalShiftsPerWeek)
	{	
		this.locationName = locationName;
		this.totalShiftsPerWeek = totalShiftsPerWeek;
	}
	
	public void addWorker(Valet v)
	{
		workers.add(v);
	}
	public void printWorkerList()
	{
		for (int i=0; i < workers.size(); i++)
		{
			System.out.println(workers.get(i).getFirstName());
		}
	}
	public String getLocationName() 
	{
		return locationName;
	}
	public void setLocationName(String locationName) 
	{
		this.locationName = locationName;
	}
	public String getAddress() 
	{
		return address;
	}
	public void setAddress(String address) 
	{
		this.address = address;
	}
	public String getNotes() 
	{
		return notes;
	}
	public void setNotes(String notes) 
	{
		this.notes = notes;
	}
	public int getTotalShiftsPerWeek() 
	{
		return totalShiftsPerWeek;
	}
	public void setTotalShiftsPerWeek(int totalShiftsPerWeek) 
	{
		this.totalShiftsPerWeek = totalShiftsPerWeek;
	}
	
	
}//end Location Class
