package tr.org.linux.kamp.car;

public class CarApp {

	public static void main(String[] args) {
		Car car1=new Car("Toyota",3,80);
		car1.yaz();
		car1.changeGear(4);
		car1.yaz();
		car1.changeGear(2);
		car1.yaz();
		
	

	}

}
