//package com.citizant.order.service;


//import static org.junit.Assert.*;
//
//import org.junit.Before;
//import org.junit.After;
//import org.junit.Test;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import static org.mockito.Mockito.*;
//
//import java.sql.SQLException;

//import com.citizant.order.bo.exception.BOException;
//import com.citizant.order.dao.OrderDAO;
//import com.citizant.order..Order;

//public class OrderServiceTest {
//	
//	private static final int ORDER_ID = 123;
//	
//	@Mock
//	OrderDAO dao;
//	private OrderBOImpl bo;
//	
//  @Before
//  public void setUp()
//  {
// 	  MockitoAnnotations.initMocks(this);
// 	     bo = new OrderBOImpl();
//		 bo.setDao(dao);
//  }
//  
//  @After
//  public void tearDown() throws Exception {
// 	
//  }
//	@Test
//	public void placeOrder_Should_Create_An_Order() throws SQLException, BOException {
//		
//		{
//			 System.out.println("Place order Test case executed");
//	    }
//
//		
//		Order order = new Order();
//		when(dao.create(any(Order.class))).thenReturn(new Integer(1));
//		boolean result = bo.placeOrder(order);
//		
//		assertTrue(result);
//		verify(dao,atLeast(1)).create(order);
//	}
//
//	
//	@Test
//	public void placeOrder_Should_not_Create_An_Order() throws SQLException, BOException {
//		
//	
//		
//		Order order = new Order();
//		when(dao.create(order )).thenReturn(new Integer(0));
//		boolean result = bo.placeOrder(order);
//		
//		assertFalse(result);
//		verify(dao).create(order);
//	}
//
//	@Test(expected=BOException.class)
//	public void placeOrder_Should_Throw_BOException() throws SQLException, BOException {
//		
//		
//		Order order = new Order();
//		when(dao.create(order )).thenThrow(SQLException.class);
//		boolean result = bo.placeOrder(order);
//		
//	}
//	
//	@Test
//	public void cancelOrder_Should_cancel_The_Order() throws SQLException, BOException {
//		{
//			 System.out.println("Cancel order Test case executed");
//	    }
//			
//		Order order = new Order();
//		when(dao.read(ORDER_ID)).thenReturn(order);
//		when(dao.update(order)).thenReturn(1);
//		boolean result = bo.cancelOrder(ORDER_ID);
//		
//		assertTrue(result);
//		verify(dao).read(ORDER_ID);
//		verify(dao).update(order);
//	}
//
//	@Test
//	public void cancelOrder_Should_Not_cancel_The_Order() throws SQLException, BOException {
//		{
//			 System.out.println("update order Test case executed");
//	    }
//			
//		Order order = new Order();
//		when(dao.read(ORDER_ID)).thenReturn(order);
//		when(dao.update(order)).thenReturn(0);
//		boolean result = bo.cancelOrder(ORDER_ID);
//		
//		assertFalse(result);
//		verify(dao).read(ORDER_ID);
//		verify(dao).update(order);
//	}
//	
//
//	@Test(expected = BOException.class)
//	public void cancelOrder_ShouldThrowBOException() throws SQLException, BOException {
//			
//	       when(dao.read(anyInt())).thenThrow(SQLException.class);
//		    bo.cancelOrder(ORDER_ID);
//	
//	}
//	
//		
//	@Test(expected = BOException.class)
//	public void cancelOrder_Should_Throw_A_BOException() throws SQLException, BOException {
//			
//			Order order = new Order();
//			when(dao.read(ORDER_ID)).thenReturn(order);
//			when(dao.update(order)).thenThrow(SQLException.class);
//		     bo.cancelOrder(ORDER_ID);
//			
//		
//	}
//	
//	@Test
//	public void deleteOrder_Deletes_The_Order() throws SQLException, BOException {
//		{
//			 System.out.println("delete order Test case executed");
//	    }
//			
//		when(dao.delete(ORDER_ID)).thenReturn(1);
//		boolean result = bo.deleteOrder(ORDER_ID);
//		assertTrue(result);
//		verify(dao).delete(ORDER_ID);
//	
//	}
//	
//	@Test
//	public void deleteOrder_Should_Not_Deletes_The_Order() throws SQLException, BOException {
//			
//		when(dao.delete(ORDER_ID)).thenReturn(0);
//		boolean result = bo.deleteOrder(ORDER_ID);
//		assertFalse(result);
//		verify(dao).delete(ORDER_ID);
//	
//	}
//	
//	@Test(expected = BOException.class)
//	public void deleteOrder_ShouldThrowBOException() throws SQLException, BOException {
//			
//	       when(dao.delete(ORDER_ID)).thenThrow(SQLException.class);
//		    bo.deleteOrder(ORDER_ID);
//	
//	}
//	
//}
