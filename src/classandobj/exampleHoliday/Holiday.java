package classandobj.exampleHoliday;
public class Holiday {
	private int day;
	private String month;
	private boolean holiday;
	private String name;	
	
	public Holiday() {
		
	}
	public Holiday(int day, String month, String name, boolean holiday) {
		this.day = day;
		this.name= name;
		this.holiday = holiday;
		this.month= month;	
	}
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public boolean isHoliday() {
		return holiday;
	}
	public void setHoliday(boolean holiday) {
		this.holiday = holiday;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean isHoliday(boolean holi) {
		return holi;
	}
}
