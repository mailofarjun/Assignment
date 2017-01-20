package interfaces;

import java.util.List;

import Model.Executive;
import Model.Order;

public interface Group {
	 List<Order> getOrders();
	 Executive getExecutive();
}
