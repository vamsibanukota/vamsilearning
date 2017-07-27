import java.util.*;
public class TreeMapexam1 {
	public static void main (String[]args)
	{
		HashMap<Integer,String>pm=new HashMap<Integer,String>();
		pm.put(101, "vam");
		pm.put(600, "sam");
		pm.put(469, "dad");
		pm.put(308, "mom");
		pm.put(950, "cha");
		
		for(Map.Entry m:pm.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
			  }  
			 }  
			}  
