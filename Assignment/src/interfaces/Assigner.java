package interfaces;

import java.util.List;

import Model.Assignment;
import Model.Executive;
import Model.Order;

public interface Assigner {
	 List<Assignment> assign(List<Order> orders , List<Executive> executives);
}
