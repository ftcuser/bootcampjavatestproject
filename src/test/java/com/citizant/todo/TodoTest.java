package com.citizant.todo;


import static org.junit.Assert.*; 

import org.junit.Test; 

import com.citizant.model.todo.Todo;


public class TodoTest {
	
	Todo todo = new Todo();
	
	
	@Test 
 	public void testTruncate1InFirst1Position_1inFirstposition(){ 
 

		assertEquals( "CICD", todo.truncateNumberInFirst1Position("CICD")); 
 		 
} 

	 	@Test 
	 	public void testDonotTruncateCInFirst1Position_CinFirstposition(){ 
	 
 
			assertEquals( "CICD", todo.truncateNumberInFirst1Position("CICD")); 
	 		 
	} 
	

}
