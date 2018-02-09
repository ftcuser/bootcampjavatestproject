package com.citizant.todo;

import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.citizant.model.todo.Todo;
import com.citizant.todo.service.TodoService;

import static org.mockito.Mockito.*;

import java.sql.SQLException;

//import com.citizant.order.bo.exception.BOException;
//import com.citizant.order.dao.OrderDAO;
//import com.citizant.order.dto.Order;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OrderTestCasesExecution {
	
	@Test
	public void firstTestCase()
		{
	 System.out.println("First Test case executed");
	 
	  }
	@Test
	public void thirdTestCase()
		{
	 System.out.println("Third Test case executed");
	  }

	@Test
	public void secondTestCase()
		{
	 System.out.println("Second Test case executed");
	  }
	
	
//	private static final int ORDER_ID = (Integer) null;
//	@Mock
//	Todo todo;
//	private TodoService todoservice;
//	
//   @Before
//  public void setUp()
//  {
// 	  MockitoAnnotations.initMocks(this);
// 	     Todo to = new Todo();
//		 to.setTodo(to);
//  }
//  
//  @After
//  public void tearDown() throws Exception {
// 	
//  }

//@Test
//public void deleteOrder_Deletes_The_Order() throws SQLException{
//	{
//		 System.out.println("delete order Test case executed");
//    }
//		
//	when(todoservice.deleteTodo(ORDER_ID)).thenReturn(1);
//	boolean result = todo.deleteTodo(ORDER_ID);
//	assertTrue(result);
//	verify(todo).deleteTodo(ORDER_ID);
//
//}
//
//@Test
//public void deleteOrder_Should_Not_Deletes_The_Order() throws SQLException {
//		
//	when(todoservice.deleteTodo(ORDER_ID)).thenReturn(0);
//	boolean result = todo.deleteOrder(ORDER_ID);
//	assertFalse(result);
//	verify(todo).deleteTodo(ORDER_ID);
//
//}

//public TodoService getTodoservice() {
//	return todoservice;
//}
//
//public void setTodoservice(TodoService todoservice) {
//	this.todoservice = todoservice;
//}

}
