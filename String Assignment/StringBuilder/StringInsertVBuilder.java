package StringBuilder;



	/**
	 * InsertString_StringBuilder
	 */
	public class StringInsertVBuilder
	{

	    public static void main(String[] args) 
	    {
	        StringBuilder str = new StringBuilder("It is used to _ at the specified index position");
			  str.insert(str.indexOf("_"),"insert text");
			  System.out.println(str);

	    }
	
}
