package Model;

public class Assignment {
Order order;
Executive executive;

Assignment(Order order , Executive exec){
	this.order = order;
	this.executive = exec;
}

Order getOrder(){
	return order;
}

Executive getExecutive(){
	return executive;
}

}
