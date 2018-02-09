/*package com.citizant.order.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.citizant.model.order.Order;

@Service
public class OrderService {
	private static List<Order> orders = new ArrayList<Order>();
	private static int orderCount = 3;

	static {
		orders.add(new Order(1, "citizant", "Learn Spring MVC", new Date(),
				false));
		orders.add(new Order(2, "citizant", "Learn Struts", new Date(), false));
		orders.add(new Order(3, "citizant", "Learn Hibernate", new Date(),
				false));
	}

	public List<Order> retrieveOrders(String user) {
		List<Order> filteredOrders = new ArrayList<Order>();
		for (Order order : orders) {
			if (order.getUser().equals(user))
				filteredOrders.add(order);
		}
		return filteredOrders;
	}

	public Order retrieveOrder(int id) {
		for (Order order : orders) {
			if (order.getId() == id)
				return order;
		}
		return null;
	}

	public void updateOrder(Order order) {
		orders.remove(order);
		orders.add(order);
	}

	public void addOrder(String name, String desc, Date targetDate,
			boolean isDone) {
		orders.add(new Order(++orderCount, name, desc, targetDate, isDone));
	}

	public void deleteOrder(int id) {
		Iterator<Order> iterator = orders.iterator();
		while (iterator.hasNext()) {
			Order order = iterator.next();
			if (order.getId() == id) {
				iterator.remove();
			}
		}
	}

	
	
}
*/