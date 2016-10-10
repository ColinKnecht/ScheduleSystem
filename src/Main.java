
public class Main {

	public static void main(String[] args) 
	{
		Week week = new Week();
		Location indaco = new Location("Indaco",7);
		Valet colin = new Valet("Colin","Knecht",4,3);
		Valet lucas = new Valet("Lucas", "Goude",4,3);
		Valet hunter = new Valet("Hunter", "Wang",1,0);
		int totalShifts = 0;
		//week.getDaysThisWeek();
		indaco.addWorker(colin);
		indaco.addWorker(lucas);
		indaco.addWorker(hunter);
		
		GenerateSchedule schedGen = new GenerateSchedule(indaco,colin, lucas, hunter);
		//System.out.println("Colin: " + colin.getWeeklyShifts());
		//System.out.println("Lucas: " + lucas.getWeeklyShifts());
		//totalShifts = colin.getWeeklyShifts() + lucas.getWeeklyShifts();
		//System.out.println("Total Shifts " + totalShifts);
		//Day day = new Day();
		//day.printDays();
		System.out.println("Done");
		//indaco.printWorkerList();
		
		

	}

}
