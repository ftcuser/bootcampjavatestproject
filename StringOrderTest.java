package com.citizant.todo.order;

import static org.junit.Assert.*;

import org.junit.Test;

import com.citizant.model.order.StringOrder;

public class StringOrderTest {
	
	StringOrder order = new StringOrder();
	
	@Test
	public void testTruncateAInFirst2Positions_Ainfirst2positions() {
		
		//AACD => CD ACD => CD CDEF=>CDEF CDAA => CDAA
		
		assertEquals( "CD", order.truncateAInFirst2Positions("AACD"));
		
	 //expected , actual

	}
	
	@Test
	public void testTruncateAInFirst2Positions_AinFirstposition(){
	
	//	assertEquals( "CDA", helper.truncateAInFirst2Positions("ACD"));
		assertEquals( "CD", order.truncateAInFirst2Positions("ACD"));
		
	}
	
	
	
	

}
