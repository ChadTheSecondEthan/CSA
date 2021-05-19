package Module14;

/*
 * Author: Ethan Fisher
 * Date: 3/29/2021
 * School: Franklin Academy HS
 * Patron Tester Program
 * 
 * Description: Prints media and patron objects
 * Difficulties: Making a return date 14 days after the given date
 * Learned: abstract classes allow you to take certain information from
 * 		one class and add it to another
 */

public class TestPatron {
	
	public static void main(String[] args) {
		Patron emily = new Patron();
		
		Media book1 = new Book();
		Media movie1 = new Movie();
		Media audioBook1 = new AudioBook();
		Media book2 = new Book();
		Media movie2 = new Movie();
		Media audioBook2 = new AudioBook();
		
		book1.setTitle("ABC");
		((Book)book1).setAuthor("Suzie Smith");
		
		movie1.setTitle("Garden State");
		((Movie)movie1).setYear(2008);
		
		audioBook1.setTitle("My Audio Book");
		((AudioBook)audioBook1).setNarrator("Some Narrator");
		((AudioBook)audioBook1).setYear(2000);
		
		book2.setTitle("The Second Book");
		((Book)book2).setAuthor("The Author of the Second Book");
		
		movie2.setTitle("The Second Movie");
		((Movie)movie2).setYear(1999);
		
		audioBook2.setTitle("The Second Audio Book");
		((AudioBook)audioBook2).setNarrator("The Second Narrator");
		((AudioBook)audioBook2).setYear(2001);
		
		System.out.println(book1);
		System.out.println(movie1);
		System.out.println(audioBook1);
		System.out.println(book2);
		System.out.println(movie2);
		System.out.println(audioBook2);
	}

}

/**
 * Sample Output:

The specs of this book are: 
	 Title: ABC
	 Author: Suzie Smith
	 Checkout Date: java.util.GregorianCalendar[time=1617049400598,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="America/New_York",offset=-18000000,dstSavings=3600000,useDaylight=true,transitions=235,lastRule=java.util.SimpleTimeZone[id=America/New_York,offset=-18000000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2021,MONTH=2,WEEK_OF_YEAR=14,WEEK_OF_MONTH=5,DAY_OF_MONTH=29,DAY_OF_YEAR=88,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=4,HOUR_OF_DAY=16,MINUTE=23,SECOND=20,MILLISECOND=598,ZONE_OFFSET=-18000000,DST_OFFSET=3600000]

The specs of this book are: 
	 Title: Garden State
	 Year: 2008
	 Checkout Date: 3/7

The specs of this book are: 
	 Title: My Audio Book
	 Narrator: Some Narrator
	 Year: 2000
	 Checkout Date: java.util.GregorianCalendar[time=1617049400662,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="America/New_York",offset=-18000000,dstSavings=3600000,useDaylight=true,transitions=235,lastRule=java.util.SimpleTimeZone[id=America/New_York,offset=-18000000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2021,MONTH=2,WEEK_OF_YEAR=14,WEEK_OF_MONTH=5,DAY_OF_MONTH=29,DAY_OF_YEAR=88,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=4,HOUR_OF_DAY=16,MINUTE=23,SECOND=20,MILLISECOND=662,ZONE_OFFSET=-18000000,DST_OFFSET=3600000]

The specs of this book are: 
	 Title: The Second Book
	 Author: The Author of the Second Book
	 Checkout Date: java.util.GregorianCalendar[time=1617049400662,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="America/New_York",offset=-18000000,dstSavings=3600000,useDaylight=true,transitions=235,lastRule=java.util.SimpleTimeZone[id=America/New_York,offset=-18000000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2021,MONTH=2,WEEK_OF_YEAR=14,WEEK_OF_MONTH=5,DAY_OF_MONTH=29,DAY_OF_YEAR=88,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=4,HOUR_OF_DAY=16,MINUTE=23,SECOND=20,MILLISECOND=662,ZONE_OFFSET=-18000000,DST_OFFSET=3600000]

The specs of this book are: 
	 Title: The Second Movie
	 Year: 1999
	 Checkout Date: 3/7

The specs of this book are: 
	 Title: The Second Audio Book
	 Narrator: The Second Narrator
	 Year: 2001
	 Checkout Date: java.util.GregorianCalendar[time=1617049400663,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="America/New_York",offset=-18000000,dstSavings=3600000,useDaylight=true,transitions=235,lastRule=java.util.SimpleTimeZone[id=America/New_York,offset=-18000000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2021,MONTH=2,WEEK_OF_YEAR=14,WEEK_OF_MONTH=5,DAY_OF_MONTH=29,DAY_OF_YEAR=88,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=4,HOUR_OF_DAY=16,MINUTE=23,SECOND=20,MILLISECOND=663,ZONE_OFFSET=-18000000,DST_OFFSET=3600000]

*/
