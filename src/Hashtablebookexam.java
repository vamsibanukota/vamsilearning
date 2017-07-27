import java.util.*;    
class Book {    
int id;    
String name,author,publisher;    
int quantity;    
public Book(int id, String name, String author, String publisher, int quantity) {    
    this.id = id;    
    this.name = name;    
    this.author = author;    
    this.publisher = publisher;    
    this.quantity = quantity;    
}    
} 
public class Hashtablebookexam {
	public static void main(String[] args) {    
   
	    Map<Integer,Book> map1=new Hashtable<Integer,Book>();    
	    //Creating Books    
	    Book g1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",80);    
	    Book g2=new Book(104,"Data Communications & Networking","Forouzan","Mc Graw Hill",41);    
	    Book g3=new Book(100,"Operating System","Galvin","Wiley",36);    
	    Book g4=new Book(102,"power System","Gatvinerss","Whiskeey",61); 
	    Book g5=new Book(103,"metal theorySystem","johncena","monster",16); 
	      
	    map1.put(1,g1);  
	    map1.put(2,g2);  
	    map1.put(3,g3);  
	    map1.put(4,g4);
	    map1.put(5,g5);
	 
	    for(Map.Entry<Integer, Book> entry:map1.entrySet()){    
	        int key=entry.getKey();  
	        Book g=entry.getValue();  
	        System.out.println(key+" Details:");  
	        System.out.println(g.id+" "+g.name+" "+g.author+" "+g.publisher+" "+g.quantity);   
	    }    
	}    
	}    


