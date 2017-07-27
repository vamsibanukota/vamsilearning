import java.util.*;    
class vegetables {    
int nur;    
String name,colour;    
int quantity;    
public vegetables(int nur, String name, String colour, int quantity) {    
    this.nur = nur;    
    this.name = name;    
    this.colour = colour;       
    this.quantity = quantity;    
}    
} 
public class Hashmapbookexam1 {
	public static void main(String[] args) {       
	    HashMap<Integer,vegetables> gvvs=new HashMap<Integer,vegetables>();    
	      
	    vegetables v1=new vegetables(5000,"tomota","red",811);    
	    vegetables v2=new vegetables(5050,"green chilles & capsicum","green",400);    
	    vegetables v3=new vegetables(1010,"lemon","yellow",623);    
	    
	    gvvs.put(1113,v1);  
	    gvvs.put(3222,v3);  
	    gvvs.put(2333,v2);  
	      
	   
	    for(Map.Entry<Integer, vegetables> entry:gvvs.entrySet()){    
	        int key=entry.getKey();  
	        vegetables v=entry.getValue();  
	        System.out.println(key+" Details:");  
	        System.out.println(v.nur+" "+v.name+" "+v.colour+"  "+v.quantity);   
	    }    
	}    

}
