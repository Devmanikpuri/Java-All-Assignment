package com.org.gen.col;
import java.util.*;

public class TestSet {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  HashSet<String> h1 = new HashSet<String>();
		  h1.add("A");
		  h1.add("B");
		  h1.add("C");
		  
		  HashSet<String> h2 = new HashSet<String>();
		  h2.add("X");
		  h2.add("Y");
		  h2.add("Z");
		  
		  h1.addAll(h2);
			Iterator<String> li = h1.iterator();
			while(li.hasNext())
			{
		
				System.out.println(li.next());
			}
			
			for(String val:h1){
				System.out.println(val);
				
			}

	}


}
