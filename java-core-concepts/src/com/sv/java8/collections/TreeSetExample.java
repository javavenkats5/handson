package com.sv.java8.collections;
import java.util.*;  
class EBook implements Comparable<EBook>{  
int id;  
String name,author,publisher;  
int quantity;  
public EBook(int id, String name, String author, String publisher, int quantity) {  
    this.id = id;  
    this.name = name;  
    this.author = author;  
    this.publisher = publisher;  
    this.quantity = quantity;  
}  
public int compareTo(EBook b) {  
    if(id>b.id){  
        return 1;  
    }else if(id<b.id){  
        return -1;  
    }else{  
    return 0;  
    }  
}  
}  
public class TreeSetExample {  
public static void main(String[] args) {  
    Set<EBook> set=new TreeSet<EBook>();  
    //Creating EBooks  
    EBook b1=new EBook(121,"Let us C","Yashwant Kanetkar","BPB",8);  
    EBook b2=new EBook(233,"Operating System","Galvin","Wiley",6);  
    EBook b3=new EBook(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
    //Adding EBooks to TreeSet  
    set.add(b1);  
    set.add(b2);  
    set.add(b3);  
    //Traversing TreeSet  
    for(EBook b:set){  
    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
    }  
}  
}  