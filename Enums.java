public class Enums{

		public enum month{
			JANUARY, FEBUAURY, MARCH, APRIL, MAY, JUNE,
			JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER,DECEMBER
		}
		public enum Day{
			SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
		}

		public static void main(String []args){

			int months = month.values().length;
			int Days = Day.values().length;
			System.out.println("Number of months in a year: "+months);
			System.out.println("Number of days in a week: "+Days+"\n");

			System.out.println("months: \n");
			for(int i = 0; i < months; i++){
				System.out.println(month.values()[i]);
		}
			System.out.println("\ndays: \n");
			for(Day d: Day.values()){
				System.out.println(d);
			}
			System.out.println();
		}
}