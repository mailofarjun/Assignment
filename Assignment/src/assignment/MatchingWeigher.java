package assignment;

import Model.Executive;
import Model.LatLongLocation;
import Model.Order;
import interfaces.Location;
import interfaces.LocationComparator;
import interfaces.Weigher;

public class MatchingWeigher implements Weigher {
	
	// to be wired by spring or custom factory or other preferred framework
	private LocationComparator<Location> locationComparator;
	
    // these parameters can be fetched from a config file or persistence or a service by integrating the source appropriately
	private static final long MAX_FIRST_MILE = 10000;
	private static final long MAX_RESTAURANT_WAIT = 10000;
	private static final long FIRST_MILE_WEIGHTAGE = 5;
	private static final long WAIT_AT_RESTAURANT_WEIGHTAGE = 1;
	private static final long PAST_EXECUTIVE_WAITING_WEIGHTAGE = 3 ;
	
	@Override
	public long weigh(Order order, Executive executive) {
		// this method tries to project the space and time difference into one space-time dimension 
		
		
		// a separate library can be used for transforming the geographical dimensions into single dimension projections
		long firstMileDistance = locationComparator.difference(order.getRestaurantLocation() , executive.getCurrentLocation());
		long waitingAtRestaurant = order.getProcessingTimestamp() - executive.getReachTimestamp(order.getRestaurantLocation());
		
		//heuristic to minimise starvation of an executive
		long pastExecutiveWaitingTime = executive.getPastWaitingTime();
		
		//heuristic to minimise the distance travelled by executive . Lesser the distance , more the weightage because of the inversing with MAX value
		long weightOfFirstMileDifference = (MAX_FIRST_MILE - firstMileDistance)*FIRST_MILE_WEIGHTAGE;
		
		//heuristic to minimise the waiting time of executive at restaurant. Lesser the waiting time , more the weightage because of inversing with MAX value
		long weightOfWaitingAtRestaurant = (MAX_RESTAURANT_WAIT - waitingAtRestaurant) * WAIT_AT_RESTAURANT_WEIGHTAGE ;
		
		long finalWeight = weightOfFirstMileDifference  + weightOfWaitingAtRestaurant + (pastExecutiveWaitingTime*PAST_EXECUTIVE_WAITING_WEIGHTAGE);
		return finalWeight;
	}

}

// skeleton example of a location comparator
class LatLongLocationComparator implements LocationComparator<LatLongLocation>{

	@Override
	public <LatLongLocation> long difference(LatLongLocation source, LatLongLocation target) {
		// calculates difference between source and target and projects it as a single dimensional value

		//dummy return value
		return 0;
	}
	
}
