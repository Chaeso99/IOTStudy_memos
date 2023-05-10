package ch07;

class Vehicle{ 
	void move(){
		System.out.println("움직이다.");
	}
}

class AirPlane extends Vehicle{ 
	void fly(){
		System.out.println("날다.");
	}
}

class Car extends Vehicle{ 
	void drive(){
		System.out.println("달리다.");
	}
}

public class CastingEx01 {

	
	public static void main(String[] args) {
		moveVehicle(new AirPlane()); 
		moveVehicle(new Car());
	}
	
	static void moveVehicle(Vehicle vehicle){
		if(vehicle instanceof AirPlane){
			AirPlane ap = (AirPlane) vehicle;
			ap.fly();
		}else if(vehicle instanceof Car){
			Car car = (Car) vehicle;
			car.drive();
		}
	}
}