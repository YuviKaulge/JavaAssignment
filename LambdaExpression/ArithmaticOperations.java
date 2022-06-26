package LambdaExpression;


@FunctionalInterface
interface Addition{
    public int add(int a,int b);
}
@FunctionalInterface
interface Substraction{
    public int sub(int a,int b);
}
@FunctionalInterface
interface Multiplication{
    public int multiply(int a,int b);
}
@FunctionalInterface
interface Division{
    public int div(int a,int b);
}




public class ArithmaticOperations {

    public static void main(String[] args) {

        // Addition 
        Addition addRes = (a,b) -> (a+b);
        System.out.println("Addition is : "+addRes.add(3, 20));
        //Substraction
        Substraction subRes = (a,b) -> (a-b);
        System.out.println("Substraction is : "+subRes.sub(110,10));
        //Multiplication
        Multiplication multiplyRes = (a,b) -> (a*b);
        System.out.println("Multiplication is : "+ multiplyRes.multiply(10, 52));
        //Division 
        try{ 
        Division divRes = (a,b) -> (a/b) ;
        System.out.println("Division is : "+ divRes.div(10, 02));
        }catch(ArithmeticException e){
            System.out.println("Exception Occered  : "+e.getMessage());
        }
        
    }
}