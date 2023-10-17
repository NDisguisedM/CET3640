package lab4exercises2;

public class TimeSpanApp {

	public static void main(String[] args) {
		TimeSpan ts = new TimeSpan(5, 42);
		TimeSpan ts2 = new TimeSpan(5, 42);
		TimeSpan ts3 = new TimeSpan(1, 30);
		ts.add(1, 52);
		System.out.println("Adding 5h42m and 1h52m, the answer is: " + ts.getHours() + "h" + ts.getMinutes() + "m.");
		
		ts2.add(112);
		System.out.println("Adding 5h42m and 112m, the answer is:" + ts2.getHours() + "h" + ts2.getMinutes() + "m.");
		
		System.out.println("Total Hours are: " + ts3.getTotalHours() + " hours");
	}

}
