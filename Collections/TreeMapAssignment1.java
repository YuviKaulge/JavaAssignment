package Collections;
import java.util.Set;
import java.util.TreeMap;


public class TreeMapAssignment1 
{

    public static void main(String[] args) { 
        TreeMap<Long,Contact> list = new TreeMap<>();

        list.put((long) 1000001, new Contact( 77588765, "Saurabh", "yuvrajkaulge@gmail.com", Contact.Gender.Male));
        list.put((long) 1000002, new Contact( 77679650, "Yashwant ", "yashu@gmail.com", Contact.Gender.Male));
        list.put((long) 1000003, new Contact( 9999999, "shweta", "s.fukr@gmail.com", Contact.Gender.Female));
        

        Set<Long> keys=list.keySet();
        System.out.print("Keys :- ");
        for(long i:keys)
        {
            System.out.print(i+"  ");
            
        } 
        System.out.println();
        System.out.println("Values:-");
        for(long i:keys)
        {
            System.out.println("   "+list.get(i));
        }
        System.out.println();
        System.out.println(list);

    }   
} 