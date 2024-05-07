package p1;

interface Vehicle {

	void start();
}

class Car1 implements Vehicle {

	@Override
	public void start() {
		System.out.println("Start Journy by Car");
	}

}

class Bike implements Vehicle {

	@Override
	public void start() {
		System.out.println("Start Journy by Bike..");
	}
}

class Travel1 {
	Vehicle vehicle;//refer

	void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	void Journy() {
		vehicle.start();
	}

}

public class DIResolved {
	public static void main(String[] args) {
		Travel1 t1 = new Travel1();
		Car c=new Car();
		Bike bike = new Bike();
		Car1 car1 = new Car1();
		t1.setVehicle(bike);
		t1.Journy();
	}
}
