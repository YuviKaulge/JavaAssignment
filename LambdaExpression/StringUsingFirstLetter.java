package LambdaExpression;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer; 


public class StringUsingFirstLetter 
{

    public static void main(String[] args) 
    {
        List<String> list = new ArrayList<>(); 
        
        list.add("Yuvraj");
        list.add("Deepak"); 
        list.add("Shrikant");
        list.add("Yash");
        list.add("Aniket");
        
        System.out.println();


        StringBuilder str = new StringBuilder() ;
        
        Consumer<String> consumer = (string1)->
        { 
            char ch = string1.charAt(0);
            str.append(ch); 
        }; 

        for (String string : list) 
        {
           consumer.accept(string);  
        }

        System.out.println(str);
    }

        
}