package application;

import interfaces.Assigner;

import java.util.ArrayList;
import java.util.List;

import assignment.BipartiteMatchingAssigner;
import Model.Assignment;
import Model.Executive;
import Model.Order;

public class MainApplication {
	
	
	// this method is an example of an endpoint and entry to the matching business logic
	// this can be a cron job or a service or a stand alone application
	public void execute() {
	
	// choosing an assignment strategy from all assignment strategies
	Assigner assigner = new BipartiteMatchingAssigner();
	
	// dummy input and execution
	assigner.assign(new ArrayList<Order>(), new ArrayList<Executive>());
	
	}


}
