/*
The paramater weekday is true if it a weekday, and the paramater vactation is true if we are on vaction.
We sleep in if its not a weekday or we're on vaction. Return trye if we sleep in. 
*/

public class SleepIn {
	public static boolean sleep(boolean weekday, boolean vaction){
		if(!weekday || vaction){
			return true;
		}
		return false;

	}
	public static void main (String[] args){
          // Test case: It's a weekday, not on vacation
		boolean weekday = true;
		boolean vacation = false;
		boolean shouldSleep = sleep(weekday, vacation);
		System.out.println("should sleep in? " + shouldSleep);
		
          // Test case: It's not  a weekday, not on vacation


		 weekday = false;
		 vacation = false;
		 shouldSleep = sleep(weekday, vacation);
		System.out.println("should sleep in? " + shouldSleep);

          // Test case: It's a weekday, on vacation

		 weekday = true;
		 vacation = true;
		 shouldSleep = sleep(weekday, vacation);
		System.out.println("should sleep in? " + shouldSleep);

          // Test case: It's  not a weekday,  on vacation

		 weekday = false;
		 vacation = true;
		 shouldSleep = sleep(weekday, vacation);
		System.out.println("should sleep in? " + shouldSleep);

	}

}