package Generic;
import java.util.Scanner;
import java.util.TreeSet;


public class Employee { 
    private int id;
	private String name;
	private String department;
	private int salary;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public Employee(int id, String name, String department, int salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
 

    public String displayDetails() {
        return "department =" + department + ", id=" + id + ", name=" + name + ", salary=" + salary ;
    } 
    public static void main(String[] args) { 

        TreeSet<Employee> emp = new TreeSet<>(new IdComprare()); 
 
        emp.add(new Employee(101,"Yuvraj ","IT",10101));
        emp.add(new Employee(102,"Yash","Manager",3300));
        emp.add(new Employee(103,"Aniket","QA",2900));
        emp.add(new Employee(104,"Priya","Management",4000));
        emp.add(new Employee(105,"Ruturaj","HR",1400));
        emp.add(new Employee(107,"Raya","Training",3700));
        emp.add(new Employee(108,"RavanRaj","IT",9800));
        emp.add(new Employee(109,"Snheal","Tester",4900));
        emp.add(new Employee(110,"Vishnu","HR",5900));
        emp.add(new Employee(111,"Ashu","Management",2700));
         
        for(Employee e:emp)
        {
            System.out.println(e.displayDetails());
        }
    }

}