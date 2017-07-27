import java.util.*;

class clothes {  
int no;  
String name,type,quality;  
int quantity;  
public clothes(int no, String name, String type, String quality, int quantity) {  
    this.no = no;  
    this.name = name;  
    this.type = type;  
    this.quality = quality;  
    this.quantity = quantity;  
}  
}
public class Hashsetownbookexamp1 {
	public static void main(String[] args) {  
	    HashSet<clothes> set=new HashSet<clothes>();  
	    //Creating Books  
	    clothes s14=new clothes(1678,"cloth1","jeans","awesome",188);  
	    clothes s20=new clothes(1234,"cloth2","formal","professional",4002);  
	    clothes s67=new clothes(1001,"cloth3","banian &short","comfortable",645);  
	      
	    set.add(s14);  
	    set.add(s20);  
	    set.add(s67);  
	     
	    for(clothes s:set){  
	    System.out.println(s.no+" "+s.name+" "+s.type+" "+s.quality+" "+s.quantity);  
	    }  
	}  
	}  


