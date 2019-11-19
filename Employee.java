import java.util.Date;
public class Employee
{
	
	private int age;
	private String name;
	private Date joiningDate;
	Employee(String name, int age, Date joiningDate)
	{
		this.name=name;
		this.age=age;
		this.joiningDate=joiningDate;
	}
	public String getName()
	{
 
		return name;
	}
	public int getAge()
	{
 
		return age;
	}
	public Date getJoiningDate()
	{
 
		return joiningDate;
	}
}