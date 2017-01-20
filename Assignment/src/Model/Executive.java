package Model;

import interfaces.Location;

public class Executive {
public Location getCurrentLocation(){
	//must return an appropriate representation of location 
	
	//dummy return value 
	return new LatLongLocation();
}

public long getReachTimestamp(Location location){
	// must return the time at which the executive will reach the location based on his current location and speed
	
	//dummy return value
	return 5;
}

public long getPastWaitingTime(){
	// must return the amount of time , the executive has already waited since his last assignment
	
	return 5;
}

}
