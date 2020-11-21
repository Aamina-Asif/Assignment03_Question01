package Basic;

public class Date {
	private int day;
	private int month;
	private int year;
	
	public Date(int day,int month,int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public Date(String date) 
	{
		String s[]=date.split("/");
		this.day=Integer.parseInt(s[0]);
		this.month=Integer.parseInt(s[1]);
		this.year=Integer.parseInt(s[2]);
	}
	void setDay(int day) 
	{
		this.day=day;
	}
	void setMonth(int month) 
	{
		this.month=month;
	}
	void setYear(int year) 
	{
		this.year=year;
	}
	public int getDay() 
	{
		return day;
	}
	public int getMonth() 
	{
		return month;
	}
	public int getYear() 
	{
		return year;
	}
	public String toString() 
	{
		return this.day+"/"+this.month+"/"+this.year;
	}

}
