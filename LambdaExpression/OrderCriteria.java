package LambdaExpression;


import java.util.Scanner;

/**
 * OrderCriteria
 */

 @FunctionalInterface
 interface YuviOrder
 {
    public String OrderStatus(int n);
 }

public class OrderCriteria {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the order Amount : ");
        int amount = sc.nextInt();
         sc.close();
        YuviOrder yuvi = (n) ->
        {
        	return ((n>=10000)?"Accepted":"Not Accepted");     
        	
        };
        System.out.println("Order Status : "+yuvi.OrderStatus(amount));
    }
}