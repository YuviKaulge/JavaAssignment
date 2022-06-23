package Generic;
import java.util.HashMap; 



public class Assignment2
{

    public static void main(String[] args) 
    {
        
       HashMap<Integer,Double> mmap=new HashMap<Integer,Double>();  
       mmap.put(1,101.01); 
       mmap.put(2,200.30);    
       mmap.put(3,300.00);   
       mmap.put(4,400.00); 
       mmap.put(5, 500.34);
       mmap.put(6, 600.43);
       mmap.put(7, 700.30);
       mmap.put(8, 800.50);
       mmap.put(9, 900.90);
       mmap.put(10,1000.34);

   System.out.println(mmap);

    }
}