package AssignMent1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		//System.out.println("Hello java");
		
//		ApplicationContext context=new ClassPathXmlApplicationContext("Config.xml");
//		
//		
//	     Customer customer=(Customer) context.getBean("custome");
//	    System.out.println(customer);
	     ApplicationContext context2=new ClassPathXmlApplicationContext("Assignment1.xml");
	     Address addres=(Address)context2.getBean("addres");
	      
	     
	      System.out.println(addres);
	}

}
