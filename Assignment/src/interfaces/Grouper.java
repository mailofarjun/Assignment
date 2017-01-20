package interfaces;

import java.util.List;

import Model.Executive;
import Model.Order;

public interface Grouper {
	
	// groups each executive to a list of orders based on some preference like first mile distance 
	// the same order can be included in the groups of two or more executives 
	// the grouping can be tuned to control the number of options for orders and executives which in turn controls the density of the graph to be generated
	// more orders per executive leads to better accuracy with lesser performance and vice versa
	 List<Group> getGroups(List<Order> orders , List<Executive> executives);

}
