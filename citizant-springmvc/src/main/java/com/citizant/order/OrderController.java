/*package com.citizant.order;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.citizant.model.order.Order;
import com.citizant.order.service.OrderService;

@Controller
public class OrderController {

	@Autowired
	private OrderService service;

	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(
				dateFormat, false));
	}

	@RequestMapping(value = "/list-orders", method = RequestMethod.GET)
	public String showOrdersList(ModelMap model) {
		String user = getLoggedInUserName();
		model.addAttribute("orders", service.retrieveOrders(user));
		return "list-orders";
	}

	@RequestMapping(value = "/add-order", method = RequestMethod.GET)
	public String showAddOrderPage(ModelMap model) {
		model.addAttribute("order", new Order());
		return "order";
	}

	@RequestMapping(value = "/add-order", method = RequestMethod.POST)
	public String addOrder(ModelMap model, @Valid Order order, BindingResult result) {

		if (result.hasErrors())
			return "order";

		service.addOrder(getLoggedInUserName(), order.getDesc(),
				order.getTargetDate(), false);
		model.clear();// to prevent request parameter "name" to be passed
		return "redirect:/list-orders";
	}

	private String getLoggedInUserName() {
		Object principal = SecurityContextHolder.getContext()
				.getAuthentication().getPrincipal();

		if (principal instanceof UserDetails)
			return ((UserDetails) principal).getUsername();

		return principal.toString();
	}

	@RequestMapping(value = "/update-order", method = RequestMethod.GET)
	public String showUpdateOrderPage(ModelMap model, @RequestParam int id) {
		model.addAttribute("order", service.retrieveOrder(id));
		return "order";
	}

	@RequestMapping(value = "/update-order", method = RequestMethod.POST)
	public String updateOrder(ModelMap model, @Valid Order order,
			BindingResult result) {
		if (result.hasErrors())
			return "order";

		order.setUser(getLoggedInUserName());
		service.updateOrder(order);

		model.clear();// to prevent request parameter "name" to be passed
		return "redirect:/list-orders";
	}

	@RequestMapping(value = "/delete-order", method = RequestMethod.GET)
	public String deleteOrder(@RequestParam int id) {
		service.deleteOrder(id);

		return "redirect:/list-orders";
	}

}
*/