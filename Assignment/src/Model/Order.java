package Model;

import interfaces.Location;

public class Order {
	

public Location getRestaurantLocation(){
	// this would return a single dimension representation of the geographical location
	
	
	//dummy return value
	return new LatLongLocation();
}


public long getProcessingTimestamp(){
	// this would return the timestamp at which the order would have been processed at the restaurant
	
	// dummy return value
	return 5;
}

}
