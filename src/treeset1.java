import java.util.*;
public class treeset1 {
	public static void main(String args[]){
		TreeSet<String> c1=new TreeSet<String>();
		c1.add("vamsi");
		c1.add("dad");
		c1.add("chandu");
		c1.add("sunny");
        c1.add("amala");
        Iterator <String> itr=c1.iterator();
        while(itr.hasNext())
        {
        	System.out.println(itr.next());
        }
        
		
	}

}
