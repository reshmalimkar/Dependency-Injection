package p1;

class Car {//Dependency class
	void go() {
		System.out.println("Jouring Starting.....");
	}
}

class Travel {//dependent class
	Car car = new Car();//tighly coupled 
	void joury() {
		car.go();
	}
}

public class DI {
	public static void main(String[] args) {

		Travel travel = new Travel();
		travel.joury();
	}
}
