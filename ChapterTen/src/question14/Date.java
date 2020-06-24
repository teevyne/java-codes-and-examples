package question14;

public class Date {
	private int day;
	private int month;
	private int year;
	
	private static final int[] daysPerMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	
	public Date(int day, int month, int year) {
		
		// check if month in range
		if (month <= 0 || month > 12)
			throw new IllegalArgumentException("month (" + month + ") must be 1-12");
		
		// check if day in range for month
		if (day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29)))
			throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
		
		// check for leap year if month is 2 and day is 29
		if (month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))
			throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
		
		this.day = day;
		this.month = month;
		this.year = year;
		
		System.out.printf("Date object constructor for date %s%n", this);
	}
	
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public String getDate() {
		return String.format("%d/%d/%d", getMonth(), getDay(), getYear());
	}

	// return a String of the form month/day/year
	public String toString(){
		return String.format("%d/%d/%d", getMonth(), getDay(), getYear());
	}
} // end class Date
