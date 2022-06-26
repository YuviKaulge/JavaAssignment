package LambdaExpression;

import java.util.ArrayList;
import java.util.List;

/**
 * RemoveOddLengthStrings
 */
public class RemoveOddLengthStrings {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Yuvraj");
        list.add("Aniket");
        list.add("Yash");
        list.add("Shrikant");
        list.add("Handwash Bande");
        list.add("Shweta");
        System.out.println("Original list"); 
        System.out.println(list);  
        System.out.println("List after removing old lenght words ");
        list.removeIf((str) -> (str.length()%2 !=0));
        System.out.println(list);

    }
}