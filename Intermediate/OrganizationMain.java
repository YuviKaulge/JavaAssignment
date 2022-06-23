class Employee 
{
	int salary;
	Employee()
	{
	    salary=0;
	}
	Employee(int salary)
	{
		this.salary=salary;
	}
	int getSalary()
	{
		return salary;
	}
	
}

class Manager extends Employee
{
	// Incentive
	
	int incentive ;
	Manager()
	{
		incentive=0;
	}
	Manager(int salary,int incentive)
	{
		super(salary);
		this.incentive=incentive;
	}
	
	int getSalary()
	{
		return(super.getSalary()+incentive);
	}
	
}
class Labour extends Employee
{
	int overtime;
	Labour()
	{
		overtime=0;
	}
	Labour(int salary,int overtime)
	{
		super(salary);
		this.overtime=overtime;
	}
	int getSalary()
	{
		return(super.salary)+overtime;
	}
}
public class OrganizationMain
{
	public static void main(String[] args)
	{
		Manager m1=new Manager(1000,300);
		Manager m2=new Manager(3000,900);
		
		Labour l1=new Labour(600,2000);
		Labour l2=new Labour(800,300);
		
		System.out.println("m1 : "+m1.getSalary());
		System.out.println("m2 : "+m2.getSalary());
		
		System.out.println("l1 : "+l1.getSalary());
		System.out.println("l2 : "+l2.getSalary());
		
	}

}
