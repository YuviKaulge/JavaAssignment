package LambdaExpression;
import java.util.ArrayList;
import java.util.List; 

/**
 * ReplaceAll_ListOfWordsInUpperCase
 */ 


public class ReplaceAllUppercase 
{

    public static void main(String[] args) 
    {
        List<String> lis = new ArrayList<>(); 
        lis.add("Yuvraj ");
        lis.add("Yash"); 
        lis.add("Vishnu");
        lis.add("Ram");
        lis.add("Prashnt");
        
        System.out.println(lis);   
        
     //   list.replaceAll((str) -> (str.toUpperCase()));

        lis.replaceAll((str)->(str.toUpperCase()));
        System.out.println(lis);
        
        lis.replaceAll((str)->(str.toLowerCase()));
     
        
        System.out.println(lis); 
    }
}