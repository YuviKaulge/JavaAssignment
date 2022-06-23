
class Singleton 
{ 
	private static Singleton instance = null; 
	public String s; 
	private Singleton()            
	{
		s = "It's Singleton class";
	}
 
	public static Singleton getInstance()
	{
		if (instance == null)
			instance = new Singleton();

		return instance;
	}
} 

class SingletonMain { 
	public static void main(String args[])
	{ 
		Singleton x = Singleton.getInstance();   
	}
	
}
