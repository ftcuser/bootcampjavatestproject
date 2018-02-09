package com.citizant.order.exception;

import java.sql.SQLException;

public class OrderException extends Exception {

	
	private static final long serialVersionUID = 1L;

	public OrderException(SQLException e) {
		super(e);

	}

}