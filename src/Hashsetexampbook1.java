import java.util.*;  
class lab {  
int id;  
String name,author,publisher;  
int quantity;  
public lab(int id, String name, String author, String publisher, int quantity) {  
    this.id = id;  
    this.name = name;  
    this.author = author;  
    this.publisher = publisher;  
    this.quantity = quantity;  
}  
}

public class Hashsetexampbook1 {  
public static void main(String[] args) {  
    HashSet<lab> set=new HashSet<lab>();  
    //Creating Books  
    lab b1=new lab(101,"Let us C","Yashwant Kanetkar","BPB",8);  
    lab b2=new lab(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
    lab b3=new lab(103,"Operating System","Galvin","Wiley",6);  
    //Adding Books to HashSet  
    set.add(b1);  
    set.add(b2);  
    set.add(b3);  
    //Traversing HashSet  
    for(lab b:set){  
    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
    }  
}  
}  