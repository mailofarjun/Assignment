package assignment;

import Model.Executive;
import Model.Order;

public class MatchingEdge implements Edge<Order, Executive> {
	Order source;
	Executive target;
	long weight;
	
	MatchingEdge(Order source , Executive target, long weight){
		this.source = source;
		this.target = target;
		this.weight = weight;
	}

	@Override
	public Order getSource() {
		return source;
		
	}

	@Override
	public Executive getTarget() {
		return target;
	}

	@Override
	public long getWeight() {
		return weight;
	}

}
