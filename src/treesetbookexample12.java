import java.util.*;
class fruit implements Comparable<fruit>{   
int no;  
String name,colour;  
int quantity;  
public fruit(int no, String name, String colour, int quantity) {  
    this.no = no;  
    this.name = name;  
    this.colour = colour;    
    this.quantity = quantity;  
} 
public int compareTo(fruit m)
{
	if(no> m.no){
	return 1;}
	else if(no< m.no){
		return -1;}
	else{
		return 0;}
	}}
public class treesetbookexample12 {
	public static void main(String[] args) {  
	    Set <fruit> set=new TreeSet<fruit>();  

	      
	    fruit m14=new fruit(1678,"mango","yellow",188);  
	    fruit m20=new fruit(1234,"papaya","orange",4002);  
	    fruit m67=new fruit(1001,"watermelon","green",645);  
	      
	    set.add(m14);  
	    set.add(m20);  
	    set.add(m67);  
	     
	    for(fruit m:set){  
	    System.out.println(m.no+" "+m.name+" "+m.colour+"  "+m.quantity);  
	    }  
	}  
	}  






