import java.io.*;
import java.util.*;
import java.lang.Math;

    public class JavaAssignment7 
    {
	   public static void main(String[] args) 
	   {
		   
		   Scanner sc=new Scanner(System.in);
		   int a[]=new int[15];
		   
		   
		   boolean found=false;
		   System.out.println("Enter 15 elements in the array: ");
		   int i;
		
		  for(i=0;i<15;i++)
		  {
			a[i]=sc.nextInt();
		  }
		   System.out.println("Enter the element to be searched: ");
		   int keyy;
		   keyy=sc.nextInt();
		   
		   for(i=0;i<15;i++)
		   {
			if(a[i]==keyy)
			{
				found=true;
				System.out.println("Key " + keyy + " found in the array");
				break;
			}
		}
		if(found==false)
		{
			
			System.out.println("Key " + keyy + " not found in the array");
		}
		

	 }
  }

