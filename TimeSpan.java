package lab4exercises2;
public class TimeSpan 
{
	//Fields
	private int hours = 1;
	private int minutes = 170; //60 min = 1 hour
	private int anyHours;
	//Constructors
	TimeSpan(int hoursGiven, int minutesGiven)
	{
		this.hours = hoursGiven;
		this.minutes = minutesGiven;
	}
	
	TimeSpan()
	{
		this.hours = 0;
		this.minutes = 0;
	}
	//Getter
	public int getHours() 
	{
		return hours;
	}
	public int getMinutes() 
	{
		return minutes;
	}
	//Methods
	
	public int tellmeMinutes(int anyMinutes)
	{
		return anyMinutes % 60; //mod remainder into leftover minutes
	}
	public int tellmeFullHours(int anyMinutes)
	{

		return anyHours = anyMinutes / 60; //integer division into hours
	}
	public int tellmeFullMinutes(int myHours, int myMinutes)
	{
		return myMinutes + (myHours*60);
	}
	public void add(int hoursIn, int minutesIn)
	{
		int z = this.minutes + minutesIn;
		
		this.hours = this.hours+hoursIn+tellmeFullHours(z);
		this.minutes = tellmeMinutes(z);
	}	
	
	public void add(int timespan)						//timespan as a class/object
	{
		this.hours += tellmeFullHours(timespan+this.minutes);
		this.minutes = tellmeMinutes(timespan+this.minutes);
	}
	
	public double getTotalHours()
	{
		double totalHours = tellmeFullMinutes(this.hours, this.minutes) / 60.0;
		return totalHours;
	}
	
	public String toString()
	{
		return this.hours + "h" + this.minutes + "m";
	}
	
}