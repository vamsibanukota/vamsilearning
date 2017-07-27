import java.util.*;
public class Hahmapremove {
	public static void main (String[]args)
	{
		HashMap<Integer,String>ser=new HashMap<Integer,String>();
		ser.put(101, "vam");
		ser.put(1100, "sam");
		ser.put(469, "dad");
		ser.put(608, "mom");
		ser.put(700, "chandu");
		ser.put(900, "chanti");
		ser.put(600, "vijay");
		
		   System.out.println("Values before remove: "+ ser); 
		   ser.remove(700);  
		   ser.remove(900); 
		   System.out.println("Values after remove: "+ ser);  
		   }      

		   

}
