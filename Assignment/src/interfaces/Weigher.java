package interfaces;

import Model.Executive;
import Model.Order;

public interface Weigher {
	 long weigh(Order order , Executive executive);
}
