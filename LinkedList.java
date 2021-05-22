package com.example;

import java.util.*;
public class LinkedLists {
	
	public static void main(String args[]) {
		
		 LinkedList<String> ll=new LinkedList<String>();  
		 
		 
		 ll.add("Netra");
		 ll.add("xyz");
		 ll.add("yella");
		 
		 ll.offer("ss");
		 ll.offer("nn"); 

		 
		 ll.addFirst("Netra123");  //implements deque inteface
		 ll.addLast("cs");
		 
		 ll.peekLast();  //it return last element
		 
		 ll.pollFirst();
		 
		 ll.removeLast();
		 for(String e:ll) {
			 System.out.println(e);
		 }
		 
	
		
		 
		 //descending
		 
		 System.out.println("------------------");
		 
		 Iterator itr = ll.descendingIterator();
		 
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
		 }
		 
		 
		 
		 
	
		
	}

}
