package StringBuffer;


public class StringInsert {

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("It is used to_ at the specified index position");
        str.insert(str.indexOf("_"),"insert text");
        System.out.println(str);

    }
}